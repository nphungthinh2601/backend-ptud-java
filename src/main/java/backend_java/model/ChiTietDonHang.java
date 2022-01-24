package backend_java.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ChiTietDonHang")
public class ChiTietDonHang {
	@Id
	private ObjectId id;
	
	private int soLuong;
	private ObjectId donHang;
	private ObjectId sanPham;
	private String danhGia;
	private String phanHoi;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public ObjectId getDonHang() {
		return donHang;
	}
	public void setDonHang(ObjectId donHang) {
		this.donHang = donHang;
	}
	public ObjectId getSanPham() {
		return sanPham;
	}
	public void setSanPham(ObjectId sanPham) {
		this.sanPham = sanPham;
	}
	public String getDanhGia() {
		return danhGia;
	}
	public void setDanhGia(String danhGia) {
		this.danhGia = danhGia;
	}
	public String getPhanHoi() {
		return phanHoi;
	}
	public void setPhanHoi(String phanHoi) {
		this.phanHoi = phanHoi;
	}
	public ChiTietDonHang(ObjectId id, int soLuong, ObjectId donHang, ObjectId sanPham, String danhGia,
			String phanHoi) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donHang = donHang;
		this.sanPham = sanPham;
		this.danhGia = danhGia;
		this.phanHoi = phanHoi;
	}
	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
