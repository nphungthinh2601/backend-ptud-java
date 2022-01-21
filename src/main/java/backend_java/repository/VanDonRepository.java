package backend_java.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend_java.model.*;

public interface VanDonRepository extends MongoRepository<VanDon, String> {

}
