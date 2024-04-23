public class Item {
    private int id;
    private String name;
    private double price;
    private int quantity;
 public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + "]";
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
		if(name.matches("[a-zA-Z]+") ) {
			this.name=name;
		}else
		{
			System.out.println("invalid name"
					+ "Type only letters numbers are not allowed");
		}
	}
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
