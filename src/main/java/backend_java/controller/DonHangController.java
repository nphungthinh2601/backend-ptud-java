package backend_java.controller;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
=======
import javax.annotation.PostConstruct;

>>>>>>> 49db61b6001d0e96aa3eeca169cc01c4fde2b480
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.DonHang;
import backend_java.repository.DonHangRepository;

@Configuration
@RestController
@RequestMapping("/api")
public class DonHangController {
	@Autowired
	DonHangRepository repo;
	
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
			repo.findAll().forEach(donHanglst::add);
			
			if (donHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(donHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
<<<<<<< HEAD
//	@GetMapping("/donhang/nguoimua/{id}")
//	public ResponseEntity<List<DonHang>> findByNguoiMua(@PathVariable("id") String id) {
//		try {
//			List<DonHang> donHanglst = new ArrayList<DonHang>();
//			repo.findByNguoiMua(id).forEach(donHanglst::add);
//			
//			if (donHanglst.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			
//			return new ResponseEntity<>(donHanglst, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	@GetMapping("/donhang/{id}")
=======
	@GetMapping("/donhang/nguoimua/{id}")
>>>>>>> 49db61b6001d0e96aa3eeca169cc01c4fde2b480
	public ResponseEntity<List<DonHang>> findById(@PathVariable("id") String id) {
		// In case you want to mention the parent ID itself,
		ObjectId _id = new ObjectId(id);

		try {
			List<DonHang> donHanglst = new ArrayList<DonHang>();
<<<<<<< HEAD
			// repo.findByNguoiMua(id).forEach(donHanglst::add);
=======
>>>>>>> 49db61b6001d0e96aa3eeca169cc01c4fde2b480
			repo.findAllByNguoiMua(_id).forEach(donHanglst::add);
			
			if (donHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(donHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	@PutMapping("/donhang/huydonhang/{id}")
	public ResponseEntity<DonHang> CancelInvoice(@PathVariable("id") String id) {
		try {
			DonHang donHang = new DonHang();
			donHang = repo.findById(id).get();
			
			if (donHang == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			donHang.setTinhTrangCu(donHang.getTinhTrangCu().compareTo("") == 0 ? donHang.getTinhTrang() : (donHang.getTinhTrangCu() + " -> Đã huỷ"));
			donHang.setTinhTrang("Đã huỷ");
			repo.save(donHang);
			return new ResponseEntity<>(donHang, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
