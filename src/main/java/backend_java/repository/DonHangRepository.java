package backend_java.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.*;

@Repository
public interface DonHangRepository extends MongoRepository<DonHang, String> {
	//@Query(value = "{ 'nguoiMua' : ?0 }")
	List<DonHang> findAllByNguoiMua(ObjectId nguoiMua);
}
