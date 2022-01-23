package backend_java.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.*;
import backend_java.repository.*;

@Configuration
@RestController
@RequestMapping("/api")
public class DonHangController {
	@Autowired
	DonHangRepository donHangRepo;
	
	@Autowired
	ChiTietDonHangRepository chiTietDonHangRepo;
	
	@Autowired
	SanPhamRepository sanPhamRepo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;

    // remove _class
    @PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@GetMapping("/donhang")
	public ResponseEntity<List<DonHang>> XemDanhSachDonHang() {
		try {
			List<DonHang> donHanglst = new ArrayList<DonHang>();
			donHangRepo.findAll().forEach(donHanglst::add);
			
			if (donHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(donHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/donhang/nguoimua/{id}")
	public ResponseEntity<List<Invoice>> GetInfOfInvoicesByCus(@PathVariable("id") String id) {
		// In case you want to mention the parent ID itself,
		ObjectId _id = new ObjectId(id);
		
		List<Invoice> result = new ArrayList<Invoice>();
		
		try {
			List<DonHang> invs = new ArrayList<DonHang>();
			donHangRepo.findAllByNguoiMua(_id).forEach(invs::add);
			int i = 1;
			
			for(DonHang inv : invs) {
				List<ChiTietDonHang> invdetails = new ArrayList<ChiTietDonHang>();
				chiTietDonHangRepo.findAllByDonHang(inv.getId()).forEach(invdetails::add);
				
				ArrayList<InvoiceDetail> listinvoiceDetails = new ArrayList<InvoiceDetail>();
				int tmptotal = 0;
				
				for(ChiTietDonHang invdetail : invdetails) {
					SanPham prods = new SanPham();
					prods = sanPhamRepo.findById(invdetail.getSanPham().toString()).get();
					
					InvoiceDetail tmpInvoiceDetail = new InvoiceDetail();
					
                    tmpInvoiceDetail.setProduct(prods.getTenSanPham());
                    tmpInvoiceDetail.setPrice(prods.getGiaTien());
                    tmpInvoiceDetail.setNumOfElement(invdetail.getSoLuong());
                    tmpInvoiceDetail.setUnit(prods.getDonViTinh());
                    tmptotal += prods.getGiaTien() * invdetail.getSoLuong();
                    listinvoiceDetails.add(tmpInvoiceDetail);
				}
				
				Invoice tmp = new Invoice();
                tmp.setID(i);
                tmp.setInvoiceID(inv.getId().toString());
                tmp.setTimeOrder(new SimpleDateFormat("MM/dd/yyyy").format(inv.getThoiGianDat()));
                tmp.setInvoiceDetail(listinvoiceDetails);
                tmp.setTotal(tmptotal);
                tmp.setStatus(inv.getTinhTrang());
                tmp.setOldStatus(inv.getTinhTrangCu());
                tmp.setPayment(inv.getPhuongThucThanhToan());
                tmp.setAction((inv.getTinhTrang().compareTo("Đóng gói") == 0 || inv.getTinhTrang().compareTo("Mới tạo") == 0) ? true : false);
                result.add(tmp);
                i++;
			}

			if (result.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/donhang/huydonhang/{id}")
	public ResponseEntity<DonHang> CancelInvoice(@PathVariable("id") String id) {
		try {
			DonHang donHang = new DonHang();
			donHang = donHangRepo.findById(id).get();
			
			if(donHang.getTinhTrang().compareTo("Mới tạo") != 0 && donHang.getTinhTrang().compareTo("Đóng gói") != 0) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			if (donHang == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			donHang.setTinhTrangCu(donHang.getTinhTrangCu().compareTo("") == 0 ? donHang.getTinhTrang() : (donHang.getTinhTrangCu() + " -> Đã huỷ"));
			donHang.setTinhTrang("Đã huỷ");
			donHangRepo.save(donHang);
			return new ResponseEntity<>(donHang, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}