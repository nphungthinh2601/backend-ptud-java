package backend_java.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CuaHang")
public class CuaHang {
	@Id
	private ObjectId id;
	
	private ObjectId chuCuaHang;
	private String diaChi;
	private String giayChungNhanAnToan;
	private String giayPhepKinhDoanh;
	private String maSoThue;
	private String tenCuaHang;
	private int trangThai;
	private double doUyTin;
	private String anhDaiDien;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public ObjectId getChuCuaHang() {
		return chuCuaHang;
	}
	public void setChuCuaHang(ObjectId chuCuaHang) {
		this.chuCuaHang = chuCuaHang;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGiayChungNhanAnToan() {
		return giayChungNhanAnToan;
	}
	public void setGiayChungNhanAnToan(String giayChungNhanAnToan) {
		this.giayChungNhanAnToan = giayChungNhanAnToan;
	}
	public String getGiayPhepKinhDoanh() {
		return giayPhepKinhDoanh;
	}
	public void setGiayPhepKinhDoanh(String giayPhepKinhDoanh) {
		this.giayPhepKinhDoanh = giayPhepKinhDoanh;
	}
	public String getMaSoThue() {
		return maSoThue;
	}
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}
	public String getTenCuaHang() {
		return tenCuaHang;
	}
	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public double getDoUyTin() {
		return doUyTin;
	}
	public void setDoUyTin(double doUyTin) {
		this.doUyTin = doUyTin;
	}
	public String getAnhDaiDien() {
		return anhDaiDien;
	}
	public void setAnhDaiDien(String anhDaiDien) {
		this.anhDaiDien = anhDaiDien;
	}
	public CuaHang(ObjectId id, ObjectId chuCuaHang, String diaChi, String giayChungNhanAnToan,
			String giayPhepKinhDoanh, String maSoThue, String tenCuaHang, int trangThai, double doUyTin,
			String anhDaiDien) {
		super();
		this.id = id;
		this.chuCuaHang = chuCuaHang;
		this.diaChi = diaChi;
		this.giayChungNhanAnToan = giayChungNhanAnToan;
		this.giayPhepKinhDoanh = giayPhepKinhDoanh;
		this.maSoThue = maSoThue;
		this.tenCuaHang = tenCuaHang;
		this.trangThai = trangThai;
		this.doUyTin = doUyTin;
		this.anhDaiDien = anhDaiDien;
	}
	public CuaHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
