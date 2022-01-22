package backend_java.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.*;

@Repository
public interface DonHangRepository extends MongoRepository<DonHang, String> {
<<<<<<< HEAD
	//@Query(value = "{ 'nguoiMua' : ?0 }")
=======
>>>>>>> 49db61b6001d0e96aa3eeca169cc01c4fde2b480
	List<DonHang> findAllByNguoiMua(ObjectId nguoiMua);
}
