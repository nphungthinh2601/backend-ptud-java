package backend_java.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VanDon")
public class VanDon {
	@Id
	private ObjectId _id;
	
	private ObjectId maDonHang;
	private String sdtNguoiMua;
	private ObjectId cuaHang;
	private String sdtShipper;
	private String trangThai;
	private String diaChiGiaoHang;
	private int giaTri;
	private Date thoiGianDat;
	private Date thoiGianGiao;
	private int tienVanChuyen;
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public ObjectId getMaDonHang() {
		return maDonHang;
	}
	public void setMaDonHang(ObjectId maDonHang) {
		this.maDonHang = maDonHang;
	}
	public String getSdtNguoiMua() {
		return sdtNguoiMua;
	}
	public void setSdtNguoiMua(String sdtNguoiMua) {
		this.sdtNguoiMua = sdtNguoiMua;
	}
	public ObjectId getCuaHang() {
		return cuaHang;
	}
	public void setCuaHang(ObjectId cuaHang) {
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
	public int getTienVanChuyen() {
		return tienVanChuyen;
	}
	public void setTienVanChuyen(int tienVanChuyen) {
		this.tienVanChuyen = tienVanChuyen;
	}
	public VanDon(ObjectId _id, ObjectId maDonHang, String sdtNguoiMua, ObjectId cuaHang, String sdtShipper,
			String trangThai, String diaChiGiaoHang, int giaTri, Date thoiGianDat, Date thoiGianGiao,
			int tienVanChuyen) {
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
		this.tienVanChuyen = tienVanChuyen;
	}
	public VanDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
