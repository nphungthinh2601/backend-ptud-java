package backend_java.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VanDon")
public class VanDon {
	@Id
	private String _id;
	
	private String maDonHang;
	private String sdtNguoiMua;
	private String cuaHang;
	private String sdtShipper;
	private String trangThai;
	private String diaChiGiaoHang;
	private int giaTri;
	private Date thoiGianDat;
	private Date thoiGianGiao;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getSdtNguoiMua() {
		return sdtNguoiMua;
	}
	public void setSdtNguoiMua(String sdtNguoiMua) {
		this.sdtNguoiMua = sdtNguoiMua;
	}
	public String getCuaHang() {
		return cuaHang;
	}
	public void setCuaHang(String cuaHang) {
		this.cuaHang = cuaHang;
	}
	public String getSdtShipper() {
		return sdtShipper;
	}
	public void setSdtShipper(String sdtShipper) {
		this.sdtShipper = sdtShipper;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getDiaChiGiaoHang() {
		return diaChiGiaoHang;
	}
	public void setDiaChiGiaoHang(String diaChiGiaoHang) {
		this.diaChiGiaoHang = diaChiGiaoHang;
	}
	public int getGiaTri() {
		return giaTri;
	}
	public void setGiaTri(int giaTri) {
		this.giaTri = giaTri;
	}
	public Date getThoiGianDat() {
		return thoiGianDat;
	}
	public void setThoiGianDat(Date thoiGianDat) {
		this.thoiGianDat = thoiGianDat;
	}
	public Date getThoiGianGiao() {
		return thoiGianGiao;
	}
	public void setThoiGianGiao(Date thoiGianGiao) {
		this.thoiGianGiao = thoiGianGiao;
	}
	public VanDon(String _id, String maDonHang, String sdtNguoiMua, String cuaHang, String sdtShipper, String trangThai,
			String diaChiGiaoHang, int giaTri, Date thoiGianDat, Date thoiGianGiao) {
		super();
		this._id = _id;
		this.maDonHang = maDonHang;
		this.sdtNguoiMua = sdtNguoiMua;
		this.cuaHang = cuaHang;
		this.sdtShipper = sdtShipper;
		this.trangThai = trangThai;
		this.diaChiGiaoHang = diaChiGiaoHang;
		this.giaTri = giaTri;
		this.thoiGianDat = thoiGianDat;
		this.thoiGianGiao = thoiGianGiao;
	}
	public VanDon() {
		super();
		// TODO Auto-generated constructor stub
	}

}
