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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.*;
import backend_java.repository.*;

@Configuration
@RestController
@RequestMapping("/api")
public class LocationController {
	@Autowired
	ViTriCuaHangRepository viTriCuaHangRepo;
	
	@Autowired
	ViTriKhachHangRepository viTriKhachHangRepo;
	
	@Autowired
	ViTriShipperRepository viTriShipperRepo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;
	
	@PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/location/shipper")
	public ResponseEntity<List<ViTriShipper>> XemDanhSachViTriShipper() {
		try {
			List<ViTriShipper> viTriShipperlst = new ArrayList<ViTriShipper>();
			viTriShipperRepo.findAll().forEach(viTriShipperlst::add);
			
			if (viTriShipperlst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(viTriShipperlst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/location/khachhang")
	public ResponseEntity<List<ViTriKhachHang>> XemDanhSachViTriKhachHang() {
		try {
			List<ViTriKhachHang> viTriKhachHanglst = new ArrayList<ViTriKhachHang>();
			viTriKhachHangRepo.findAll().forEach(viTriKhachHanglst::add);
			
			if (viTriKhachHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(viTriKhachHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/location/cuahang")
	public ResponseEntity<List<ViTriCuaHang>> XemDanhSachViTriCuaHang() {
		try {
			List<ViTriCuaHang> viTriCuaHanglst = new ArrayList<ViTriCuaHang>();
			viTriCuaHangRepo.findAll().forEach(viTriCuaHanglst::add);
			
			if (viTriCuaHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(viTriCuaHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/location/cuahang/{id}")
	public ResponseEntity<ViTriCuaHang> GetMotViTriCuaHang(@PathVariable("id") ObjectId id) {
		try {
			ViTriCuaHang viTriCuaHang = new ViTriCuaHang();
			viTriCuaHang = viTriCuaHangRepo.findById(id.toString()).get();
			
			if (viTriCuaHang == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(viTriCuaHang, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/location/cuahang")
	public ResponseEntity<ViTriCuaHang> TaoViTriCuaHang(ViTriCuaHang data) {
		try {
			viTriCuaHangRepo.save(data);
			
			if (data == null) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(data, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
