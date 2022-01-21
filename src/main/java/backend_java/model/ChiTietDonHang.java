package backend_java.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ChiTietDonHang")
public class ChiTietDonHang {
	@Id
	private String id;
	private int soLuong;
	private String donHang;
	private String sanPham;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getDonHang() {
		return donHang;
	}
	public void setDonHang(String donHang) {
		this.donHang = donHang;
	}
	public String getSanPham() {
		return sanPham;
	}
	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}
	public ChiTietDonHang(String id, int soLuong, String donHang, String sanPham) {
		super();
		this.id = id;
		this.soLuong = soLuong;
		this.donHang = donHang;
		this.sanPham = sanPham;
	}
	public ChiTietDonHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
