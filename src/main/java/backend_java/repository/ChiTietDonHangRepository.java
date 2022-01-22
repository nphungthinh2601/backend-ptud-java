package backend_java.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.ChiTietDonHang;
import backend_java.model.DonHang;

@Repository
public interface ChiTietDonHangRepository extends MongoRepository<ChiTietDonHang, String> {
	List<ChiTietDonHang> findAllByDonHang(ObjectId donHang);
}
