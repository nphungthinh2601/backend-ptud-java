package backend_java.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "DonHang")
public class DonHang{
	@Id
	private ObjectId id;
	
	private String tinhTrang;
	private Date thoiGianDat;
	private ObjectId nguoiMua;
	private String phuongThucThanhToan;
	private ObjectId shipper;
	private ObjectId cuaHang;
	private int danhGiaCuaKH;
	private int danhGiaCuaNhaCC;
	private double tongTien;
	private int khDanhGiaShipper;
	private String tinhTrangCu;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public Date getThoiGianDat() {
		return thoiGianDat;
	}
	public void setThoiGianDat(Date thoiGianDat) {
		this.thoiGianDat = thoiGianDat;
	}
	public ObjectId getNguoiMua() {
		return nguoiMua;
	}
	public void setNguoiMua(ObjectId nguoiMua) {
		this.nguoiMua = nguoiMua;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public ObjectId getShipper() {
		return shipper;
	}
	public void setShipper(ObjectId shipper) {
		this.shipper = shipper;
	}
	public ObjectId getCuaHang() {
		return cuaHang;
	}
	public void setCuaHang(ObjectId cuaHang) {
		this.cuaHang = cuaHang;
	}
	public int getDanhGiaCuaKH() {
		return danhGiaCuaKH;
	}
	public void setDanhGiaCuaKH(int danhGiaCuaKH) {
		this.danhGiaCuaKH = danhGiaCuaKH;
	}
	public int getDanhGiaCuaNhaCC() {
		return danhGiaCuaNhaCC;
	}
	public void setDanhGiaCuaNhaCC(int danhGiaCuaNhaCC) {
		this.danhGiaCuaNhaCC = danhGiaCuaNhaCC;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public int getKhDanhGiaShipper() {
		return khDanhGiaShipper;
	}
	public void setKhDanhGiaShipper(int khDanhGiaShipper) {
		this.khDanhGiaShipper = khDanhGiaShipper;
	}
	public String getTinhTrangCu() {
		return tinhTrangCu;
	}
	public void setTinhTrangCu(String tinhTrangCu) {
		this.tinhTrangCu = tinhTrangCu;
	}
	public DonHang(ObjectId id, String tinhTrang, Date thoiGianDat, ObjectId nguoiMua, String phuongThucThanhToan,
			ObjectId shipper, ObjectId cuaHang, int danhGiaCuaKH, int danhGiaCuaNhaCC, double tongTien,
			int khDanhGiaShipper, String tinhTrangCu) {
		super();
		this.id = id;
		this.tinhTrang = tinhTrang;
		this.thoiGianDat = thoiGianDat;
		this.nguoiMua = nguoiMua;
		this.phuongThucThanhToan = phuongThucThanhToan;
		this.shipper = shipper;
		this.cuaHang = cuaHang;
		this.danhGiaCuaKH = danhGiaCuaKH;
		this.danhGiaCuaNhaCC = danhGiaCuaNhaCC;
		this.tongTien = tongTien;
		this.khDanhGiaShipper = khDanhGiaShipper;
		this.tinhTrangCu = tinhTrangCu;
	}
	public DonHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
