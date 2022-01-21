package backend_java.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SanPham")
public class SanPham {
	@Id
	private String id;
	private String tenSanPham;
	private String xuatXu;
	private int giaTien;
	private Date hanSuDung;
	private String cuaHang;
	private String loaiHang;
	private String hinhAnh;
	private boolean thietYeu;
	private String tenCuaHang;
	private String tenLoaiHang;
	private String donViTinh;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getXuatXu() {
		return xuatXu;
	}
	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}
	public int getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(int giaTien) {
		this.giaTien = giaTien;
	}
	public Date getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(Date hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	public String getCuaHang() {
		return cuaHang;
	}
	public void setCuaHang(String cuaHang) {
		this.cuaHang = cuaHang;
	}
	public String getLoaiHang() {
		return loaiHang;
	}
	public void setLoaiHang(String loaiHang) {
		this.loaiHang = loaiHang;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public boolean isThietYeu() {
		return thietYeu;
	}
	public void setThietYeu(boolean thietYeu) {
		this.thietYeu = thietYeu;
	}
	public String getTenCuaHang() {
		return tenCuaHang;
	}
	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}
	public String getTenLoaiHang() {
		return tenLoaiHang;
	}
	public void setTenLoaiHang(String tenLoaiHang) {
		this.tenLoaiHang = tenLoaiHang;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public SanPham(String id, String tenSanPham, String xuatXu, int giaTien, Date hanSuDung, String cuaHang,
			String loaiHang, String hinhAnh, boolean thietYeu, String tenCuaHang, String tenLoaiHang,
			String donViTinh) {
		super();
		this.id = id;
		this.tenSanPham = tenSanPham;
		this.xuatXu = xuatXu;
		this.giaTien = giaTien;
		this.hanSuDung = hanSuDung;
		this.cuaHang = cuaHang;
		this.loaiHang = loaiHang;
		this.hinhAnh = hinhAnh;
		this.thietYeu = thietYeu;
		this.tenCuaHang = tenCuaHang;
		this.tenLoaiHang = tenLoaiHang;
		this.donViTinh = donViTinh;
	}
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
