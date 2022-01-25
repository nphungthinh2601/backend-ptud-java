package backend_java.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ShipperVanDon")
public class ShipperVanDon {
	@Id
	private ObjectId _id;
	
	private String vandonid;
	private String shipper;
	private Double khoangcach;
	private String trangthai;

	public ShipperVanDon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVandonid() {
		return vandonid;
	}

	public void setVandonid(String vandonid) {
		this.vandonid = vandonid;
	}

	public Double getKhoangcach() {
		return khoangcach;
	}

	public void setKhoangcach(Double khoangcach) {
		this.khoangcach = khoangcach;
	}

	public String getShipper() {
		return shipper;
	}

	public void setShipper(String shipper) {
		this.shipper = shipper;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
}
