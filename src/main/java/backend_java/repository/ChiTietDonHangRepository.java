package backend_java.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import backend_java.model.ChiTietDonHang;

@Repository
public interface ChiTietDonHangRepository extends MongoRepository<ChiTietDonHang, String> {

}
