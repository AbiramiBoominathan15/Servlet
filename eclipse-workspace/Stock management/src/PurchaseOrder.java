import java.util.Date;
public class PurchaseOrder {
    private int id;
    private Item item;
    private Supplier supplier;
    private int quantity;
    private double totalPrice;
    private Date orderDate;
    public PurchaseOrder(int id, Item item, Supplier supplier, int quantity, double totalPrice, Date orderDate) {
        this.id = id;
        this.item = item;
        this.supplier = supplier;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }
    public double purchase()
    {
      System.out.println("Total amount is"+(quantity*totalPrice));
		return totalPrice;
    }
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
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