package backend_java.model;

import java.util.ArrayList;

public class Invoice {
	private int ID;
	private String invoiceID;
	private String timeOrder;
	private ArrayList<InvoiceDetail> invoiceDetail;
	private int total;
	private String status;
	private boolean action;
	private String payment;
	private String oldStatus;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getTimeOrder() {
		return timeOrder;
	}
	public void setTimeOrder(String timeOrder) {
		this.timeOrder = timeOrder;
	}
	public ArrayList<InvoiceDetail> getInvoiceDetail() {
		return invoiceDetail;
	}
	public void setInvoiceDetail(ArrayList<InvoiceDetail> invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isAction() {
		return action;
	}
	public void setAction(boolean action) {
		this.action = action;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getOldStatus() {
		return oldStatus;
	}
	public void setOldStatus(String oldStatus) {
		this.oldStatus = oldStatus;
	}
	public Invoice(int iD, String invoiceID, String timeOrder, ArrayList<InvoiceDetail> invoiceDetail, int total,
			String status, boolean action, String payment, String oldStatus) {
		super();
		ID = iD;
		this.invoiceID = invoiceID;
		this.timeOrder = timeOrder;
		this.invoiceDetail = invoiceDetail;
		this.total = total;
		this.status = status;
		this.action = action;
		this.payment = payment;
		this.oldStatus = oldStatus;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
