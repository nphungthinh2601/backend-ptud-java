package backend_java.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.*;
import backend_java.repository.*;

@RestController
@RequestMapping("/api")
public class SanPhamController {
	@Autowired
	SanPhamRepository repo;
	
	@GetMapping("/sanpham")
	public ResponseEntity<List<SanPham>> XemDanhSachSanPham() {
		try {
			List<SanPham> sanPhamlst = new ArrayList<SanPham>();
			repo.findAll().forEach(sanPhamlst::add);
			
			if (sanPhamlst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(sanPhamlst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
