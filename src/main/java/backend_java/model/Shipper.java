package backend_java.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Shipper")
public class Shipper {
	@Id
	private String _id;
	
	private String cmnd;
	private String gioiTinh;
	private String hinhAnh;
	private String hinhAnhCMNDMatSau;
	private String hinhAnhCMNDMatTruoc;
	private String hoTen;
	private String matKhau;
	private String ngaySinh;
	private double sdt;
	private double doUyTin;
	private String email;
	private String diaChi;
	private Object ViTri;
	private Object phieuXetNghiem;
	private Object tiemNgua;
	private int trangThaiHoatDong;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
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
	public double getSdt() {
		return sdt;
	}
	public void setSdt(double sdt) {
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
	public Object getViTri() {
		return ViTri;
	}
	public void setViTri(Object viTri) {
		ViTri = viTri;
	}
	public Object getPhieuXetNghiem() {
		return phieuXetNghiem;
	}
	public void setPhieuXetNghiem(Object phieuXetNghiem) {
		this.phieuXetNghiem = phieuXetNghiem;
	}
	public Object getTiemNgua() {
		return tiemNgua;
	}
	public void setTiemNgua(Object tiemNgua) {
		this.tiemNgua = tiemNgua;
	}
	public int getTrangThaiHoatDong() {
		return trangThaiHoatDong;
	}
	public void setTrangThaiHoatDong(int trangThaiHoatDong) {
		this.trangThaiHoatDong = trangThaiHoatDong;
	}
	public Shipper(String _id, String cmnd, String gioiTinh, String hinhAnh, String hinhAnhCMNDMatSau,
			String hinhAnhCMNDMatTruoc, String hoTen, String matKhau, String ngaySinh, double sdt, double doUyTin,
			String email, String diaChi, Object viTri, Object phieuXetNghiem, Object tiemNgua, int trangThaiHoatDong) {
		super();
		this._id = _id;
		this.cmnd = cmnd;
		this.gioiTinh = gioiTinh;
		this.hinhAnh = hinhAnh;
		this.hinhAnhCMNDMatSau = hinhAnhCMNDMatSau;
		this.hinhAnhCMNDMatTruoc = hinhAnhCMNDMatTruoc;
		this.hoTen = hoTen;
		this.matKhau = matKhau;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.doUyTin = doUyTin;
		this.email = email;
		this.diaChi = diaChi;
		ViTri = viTri;
		this.phieuXetNghiem = phieuXetNghiem;
		this.tiemNgua = tiemNgua;
		this.trangThaiHoatDong = trangThaiHoatDong;
	}
	public Shipper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
