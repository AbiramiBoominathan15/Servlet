public class Item {
    public int id;
    public String name;
    public double price;
    public int quantity;
	public int totalPowder;
	String customerIdPattern;
	String yesNoPattern;
	public void setYesNoPattern(String yesNoPattern) {
		if(yesNoPattern.matches("[a-z]+"))
		{
		  this.yesNoPattern = yesNoPattern;
		}
		else {
			System.out.println("lowercase letters are only allowed");
		}
	}
	public String getYesNoPattern() {
		return yesNoPattern;
	}
	
	
	public void setCustomerIdPattern(String customerIdPattern) {
		if(customerIdPattern.matches("^[A-Za-z0-9]{6}$"))
		{
		  this.customerIdPattern = customerIdPattern;
		}
		else
		{
			System.out.println("6 alphanumeric characters are allowed");
		}
		
	}
	public String getCustomerIdPattern() {
		return customerIdPattern;
	}
 public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Item() {
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
	public void settotalPowder(int totalPowder) {
		this.totalPowder=totalPowder;
		
	}
	public int gettotalPowder() {
		// TODO Auto-generated method stub
		return totalPowder;
	}

}
