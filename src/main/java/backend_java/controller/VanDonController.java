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

import backend_java.model.*;
import backend_java.repository.*;

@Configuration
@RestController
@RequestMapping("/api")
public class VanDonController {
	@Autowired
	VanDonRepository repo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;
	
	@PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@GetMapping("/vandon")
	public ResponseEntity<List<VanDon>> XemDanhSachVanDon() {
		try {
			List<VanDon> vanDonlst = new ArrayList<VanDon>();
			repo.findAll().forEach(vanDonlst::add);
			
			if (vanDonlst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(vanDonlst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
