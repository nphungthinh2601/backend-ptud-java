package backend_java.model;

public class Cart {
	private String sanPham;
	private String tenSanPham;
	private int soLuong;
	private int tongTien;
	public String getSanPham() {
		return sanPham;
	}
	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getTongTien() {
		return tongTien;
	}
	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
	public Cart(String sanPham, String tenSanPham, int soLuong, int tongTien) {
		super();
		this.sanPham = sanPham;
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.tongTien = tongTien;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
