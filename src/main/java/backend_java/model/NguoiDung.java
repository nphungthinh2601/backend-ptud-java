package backend_java.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "NguoiDung")
public class NguoiDung {
	@Id
	private String id;
	
	private String cmnd;
	private String gioiTinh;
	private String hinhAnh;
	private String hinhAnhCMNDMatSau;
	private String hinhAnhCMNDMatTruoc;
	private String hoTen;
	private int loaiND;
	private String matKhau;
	private String ngaySinh;
	private String sdt;
	private double doUyTin;
	private String email;
	private String diaChi;
	private ArrayList<Cart> gioHang;
	private ArrayList<Address> diaChiGiaoNhan;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public String getHinhAnhCMNDMatSau() {
		return hinhAnhCMNDMatSau;
	}
	public void setHinhAnhCMNDMatSau(String hinhAnhCMNDMatSau) {
		this.hinhAnhCMNDMatSau = hinhAnhCMNDMatSau;
	}
	public String getHinhAnhCMNDMatTruoc() {
		return hinhAnhCMNDMatTruoc;
	}
	public void setHinhAnhCMNDMatTruoc(String hinhAnhCMNDMatTruoc) {
		this.hinhAnhCMNDMatTruoc = hinhAnhCMNDMatTruoc;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getLoaiND() {
		return loaiND;
	}
	public void setLoaiND(int loaiND) {
		this.loaiND = loaiND;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public double getDoUyTin() {
		return doUyTin;
	}
	public void setDoUyTin(double doUyTin) {
		this.doUyTin = doUyTin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public ArrayList<Cart> getGioHang() {
		return gioHang;
	}
	public void setGioHang(ArrayList<Cart> gioHang) {
		this.gioHang = gioHang;
	}
	public ArrayList<Address> getDiaChiGiaoNhan() {
		return diaChiGiaoNhan;
	}
	public void setDiaChiGiaoNhan(ArrayList<Address> diaChiGiaoNhan) {
		this.diaChiGiaoNhan = diaChiGiaoNhan;
	}
	public NguoiDung(String id, String cmnd, String gioiTinh, String hinhAnh, String hinhAnhCMNDMatSau,
			String hinhAnhCMNDMatTruoc, String hoTen, int loaiND, String matKhau, String ngaySinh, String sdt,
			double doUyTin, String email, String diaChi, ArrayList<Cart> gioHang, ArrayList<Address> diaChiGiaoNhan) {
		super();
		this.id = id;
		this.cmnd = cmnd;
		this.gioiTinh = gioiTinh;
		this.hinhAnh = hinhAnh;
		this.hinhAnhCMNDMatSau = hinhAnhCMNDMatSau;
		this.hinhAnhCMNDMatTruoc = hinhAnhCMNDMatTruoc;
		this.hoTen = hoTen;
		this.loaiND = loaiND;
		this.matKhau = matKhau;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.doUyTin = doUyTin;
		this.email = email;
		this.diaChi = diaChi;
		this.gioHang = gioHang;
		this.diaChiGiaoNhan = diaChiGiaoNhan;
	}
	public NguoiDung() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}