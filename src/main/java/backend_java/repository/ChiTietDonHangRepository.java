package backend_java.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import backend_java.model.ChiTietDonHang;

public interface ChiTietDonHangRepository extends MongoRepository<ChiTietDonHang, String> {

}
