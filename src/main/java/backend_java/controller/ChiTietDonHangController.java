package backend_java.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.*;
import backend_java.repository.*;

@Configuration
@RestController
@RequestMapping("/api")
public class ChiTietDonHangController {
	@Autowired
	ChiTietDonHangRepository repo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;
	
	@PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@GetMapping("/chitietdonhang")
	public ResponseEntity<List<ChiTietDonHang>> XemDanhSachChiTietDonHang() {
		try {
			List<ChiTietDonHang> chiTietDonHanglst = new ArrayList<ChiTietDonHang>();
			repo.findAll().forEach(chiTietDonHanglst::add);
			
			if (chiTietDonHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(chiTietDonHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
//	@GetMapping("/chitietdonhang/donhang/{id}")
//	public ResponseEntity<List<ChiTietDonHang>> findById(@PathVariable("id") String id) {
//		// In case you want to mention the parent ID itself,
//		ObjectId _id = new ObjectId(id);
//
//		try {
//			List<ChiTietDonHang> chiTietDonHanglst = new ArrayList<ChiTietDonHang>();
//			repo.findAllByDonHang(_id).forEach(chiTietDonHanglst::add);
//			
//			if (chiTietDonHanglst.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//			
//			return new ResponseEntity<>(chiTietDonHanglst, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

}
