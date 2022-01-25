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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend_java.model.*;
import backend_java.repository.*;

@Configuration
@RestController
@RequestMapping("/api")
public class ShipperVanDonController {
	@Autowired
	ShipperVanDonRepository repo;
	
	@Autowired
    private MappingMongoConverter mappingMongoConverter;
	
	@PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
	
	@CrossOrigin(origins = "http://localhost:4401")
	@GetMapping("/shippervandon/{id}")
	public ResponseEntity<List<ShipperVanDon>> XemDanhSachShipper(@PathVariable("id") String id) {
		try {
			List<ShipperVanDon> shipperVandonlst = new ArrayList<ShipperVanDon>();
			System.out.println(id);
			ObjectId objId = new ObjectId(id);
			repo.findAllByShipper(objId).forEach(shipperVandonlst::add);
			
			if (shipperVandonlst.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(shipperVandonlst, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
