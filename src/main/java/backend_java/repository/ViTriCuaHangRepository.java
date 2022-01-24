package backend_java.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.*;

@Repository
public interface ViTriCuaHangRepository extends MongoRepository<ViTriCuaHang, String> {
}
