package backend_java.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.*;

@Repository
public interface SanPhamRepository extends MongoRepository<SanPham, String> {
	List<SanPham> findAllByThietYeu(Boolean thietYeu);
}
