package backend_java.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.*;

@Repository
public interface CuaHangRepository extends MongoRepository<CuaHang, String> {
	List<CuaHang> findByChuCuaHang(ObjectId nguoiMua);
}
