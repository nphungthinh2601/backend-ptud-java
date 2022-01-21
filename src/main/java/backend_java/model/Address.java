package backend_java.model;

public class Address {
	private String diaChi;
	private int diaChiMacDinh;
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getDiaChiMacDinh() {
		return diaChiMacDinh;
	}
	public void setDiaChiMacDinh(int diaChiMacDinh) {
		this.diaChiMacDinh = diaChiMacDinh;
	}
	public Address(String diaChi, int diaChiMacDinh) {
		super();
		this.diaChi = diaChi;
		this.diaChiMacDinh = diaChiMacDinh;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
