package backend_java.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DonHang")
public class DonHang {
	@Id
	private String id;
	private String tinhTrang;
	private Date thoiGianDat;
	private String nguoiMua;
	private String phuongThucThanhToan;
	private String shipper;
	private String cuaHang;
	private int danhGiaCuaKH;
	private int danhGiaCuaNhaCC;
	private double tongTien;
	private int khDanhGiaShipper;
	private String tinhTrangCu;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getNguoiMua() {
		return nguoiMua;
	}
	public void setNguoiMua(String nguoiMua) {
		this.nguoiMua = nguoiMua;
	}
	public String getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(String phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public String getShipper() {
		return shipper;
	}
	public void setShipper(String shipper) {
		this.shipper = shipper;
	}
	public String getCuaHang() {
		return cuaHang;
	}
	public void setCuaHang(String cuaHang) {
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
	public DonHang(String id, String tinhTrang, Date thoiGianDat, String nguoiMua, String phuongThucThanhToan,
			String shipper, String cuaHang, int danhGiaCuaKH, int danhGiaCuaNhaCC, double tongTien,
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
