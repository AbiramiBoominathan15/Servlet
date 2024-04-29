import java.util.Date;
public class Supplier {
	public int id;
	public String item;
	public double supplier;
	public int quantity;
	public double totalPrice;
	public Date orderDate;
	public Supplier(int id, String item, double d, Date orderDate) {
		this.id = id;
		this.item = item;
		this.supplier = d;
		this.quantity = quantity;
		this.orderDate = orderDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getSupplier() {
		return supplier;
	}
	public void setSupplier(double supplier) {
		this.supplier = supplier;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}