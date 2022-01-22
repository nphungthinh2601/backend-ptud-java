package backend_java.model;

public class InvoiceDetail {
	private String product;
	private String unit;
	private int numOfElement;
	private int price;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getNumOfElement() {
		return numOfElement;
	}
	public void setNumOfElement(int numOfElement) {
		this.numOfElement = numOfElement;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public InvoiceDetail(String product, String unit, int numOfElement, int price) {
		super();
		this.product = product;
		this.unit = unit;
		this.numOfElement = numOfElement;
		this.price = price;
	}
	public InvoiceDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
