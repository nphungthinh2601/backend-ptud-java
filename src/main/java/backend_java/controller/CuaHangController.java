package backend_java.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.CuaHang;
import backend_java.repository.CuaHangRepository;

@Configuration
@RestController
@RequestMapping("/api")
public class CuaHangController {
	@Autowired
	CuaHangRepository repo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;
	
	@PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@GetMapping("/cuahang")
	public ResponseEntity<List<CuaHang>> XemDanhSachCuaHang() {
		try {
			List<CuaHang> cuaHanglst = new ArrayList<CuaHang>();
			repo.findAll().forEach(cuaHanglst::add);
			
			if (cuaHanglst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(cuaHanglst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
