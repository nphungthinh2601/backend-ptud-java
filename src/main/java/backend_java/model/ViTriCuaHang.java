package backend_java.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ViTriCuaHang")
public class ViTriCuaHang {
	@Id
	private ObjectId id;
	
	private double latitude;
	private double longtitude;
	private ObjectId objectId;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	public ObjectId getObjectId() {
		return objectId;
	}
	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}
	public ViTriCuaHang(ObjectId id, double latitude, double longtitude, ObjectId objectId) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.objectId = objectId;
	}
	public ViTriCuaHang() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
