import java.util.Date;

public class PurchaseOrder {
	public int id;
	public Item item;
	public double totalPrice;
	public Date orderDate;

	public PurchaseOrder(int id, Item item, double totalPrice, Date orderDate) {
		this.id = id;
		this.totalPrice = totalPrice;
		this.orderDate = orderDate;
	}

	//public PurchaseOrder(int i, Object object, double d, Date date) {
		// TODO Auto-generated constructor stub
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
}