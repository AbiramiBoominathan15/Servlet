public class Item {
	public int id;
	public String name;
	public double price;
	public int quantity;
	public int totalPowder;
	public String customerIdPattern;
	public String yesNoPattern;
	public int num_product1;
	public int totalPowder1;
	public String sectionName;

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public void setYesNoPattern(String yesNoPattern) {
		if (yesNoPattern.matches("[a-z]+")) {
			this.yesNoPattern = yesNoPattern;
		} else {
			System.out.println("lowercase letters are only allowed");
		}
	}

	public String getYesNoPattern() {
		return yesNoPattern;
	}

	public void setCustomerIdPattern(String customerIdPattern) {
		if (customerIdPattern.matches("^[A-Za-z0-9]{6}$")) {
			this.customerIdPattern = customerIdPattern;
		} else {
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
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", totalPowder="
				+ totalPowder + ", customerIdPattern=" + customerIdPattern + ", yesNoPattern=" + yesNoPattern
				+ ", num_product1=" + num_product1 + ", totalPowder1=" + totalPowder1 + ", sectionName=" + sectionName
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			System.out.println("invalid name" + "Type only letters numbers are not allowed");
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
		this.totalPowder = totalPowder;

	}

	public int gettotalPowder() {
		// TODO Auto-generated method stub
		return totalPowder;
	}

	public void soldOutPockets(int totalPowder1, int num_product1, String sectionName, Item item) {
		int soldOut1 = totalPowder1 - num_product1;
		// System.out.println("Available Stocks for " + item.getName() + " are: " +
		// soldOut1);

		System.out.println(
				"Available Stocks are:" + soldOut1 + " " + name + " " + "Section Name:" + " " + item.getSectionName());
	}
}





