package backend_java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.DonHang;
import backend_java.repository.DonHangRepository;

@RestController
@RequestMapping("/api")
public class DonHangController {
	@Autowired
	DonHangRepository repo;
	
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
}