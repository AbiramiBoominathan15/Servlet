import java.util.Date;
import java.util.Scanner;
public class StockManagement2 {
	 int totalPowder;
	public static void main(String[] args) {
		int num_product;
		StockManagement2 m = new StockManagement2();
		Item item = new Item(1, null, 10.99, 100);
		Scanner sc= new Scanner(System.in);
		System.out.println("***Stock Management Details***");
		System.out.println("Enter CustomerID:");
		String customerIdPattern = sc.nextLine();
		item = new Item();
		item.setCustomerIdPattern(customerIdPattern);
		System.out.print("Are you a regular customer? (yes/no): ");
		String yesNoPattern = sc.nextLine();
		item = new Item();
		item.setCustomerIdPattern(yesNoPattern);
		System.out.println("choose the section \n\nMasalaPowder,\ncosmetics,\nstationary");
		String[] str = { "MasalaPowder", "cosmetics", "stationary" };
		System.out.println("Enter section name:");
		String sectionName = sc.nextLine();
		int totalPowder1 =0;
		switch (sectionName) {
		case "MasalaPowder":
			System.out.println("1.Rasampowder\n2.SambarPowder\n 3.Rice Powder\n 4.CurryLeavesPowder\n5.TurmericPowder");
			System.out.println("Enter Product name:");
			String itemName = sc.nextLine();
			item = new Item();
			item.setName(itemName);
			System.out.println("Enter Quantity(Gram):"); 
	        int quantity = sc.nextInt(); 
	        System.out.println("quantity:"+quantity);
			double price;
			switch (itemName) {
			case "Rasampowder":
				price = 25;
				totalPowder1 = 1000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "SambarPowder":
				price = 35;
				totalPowder1 = 2000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "RicePowder":
				price = 40;
				totalPowder1 = 3000;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "CurryLeavesPowder":
				price = 40;
				totalPowder1 = 2500;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			case "TurmericPowder":
				price = 40;
				totalPowder1 = 1500;
				item.setPrice(price);
				item.settotalPowder(totalPowder1);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
//			item.setPrice(price);
//			item.settotalPowder(totalPowder1);
			break;
		case "cosmetics":
			System.out.println("1.Lipstick\n 2.eyeliner \n 3.powder\n 4.RosePowder\n 5.Hairstraightner");
			System.out.println("\tEnter Product name:");
			String itemName1 = sc.nextLine();
			item = new Item();
			item.setName(itemName1);
			double price1;
			switch (itemName1) {
			case "Lipstick":
				price1 = 200;
				totalPowder1 = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "eyeliner":
				price1 = 155;
				totalPowder1 = 3000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				
				break;
			case "powder":
				price1 = 50;
				totalPowder1 = 4000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "RosePowder":
				price1 = 105;
				totalPowder1 = 5000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			case "Hairstraightner":
				price1 = 2000;
				totalPowder1 = 2000;
				item.setPrice(price1);
				item.settotalPowder(totalPowder1);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price1);
			break;
		case "stationary":
			System.out.println("1.pen \n 2.pencile\n 3.rubber\n 4.scale \n 5.box\n Note\n 6.Book");
			System.out.println("\t Enter Product name:");
			String itemName11 = sc.nextLine();
			item = new Item();
			item.setName(itemName11);
			double price11;
			switch (itemName11) {
			case "pen":
				price11 = 25;
				totalPowder1 = 1500;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "pencile":
				price11 = 35;
				totalPowder1 = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "rubber":
				price11 = 40;
				totalPowder1 = 1220;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "scale":
				price11 = 20;
				totalPowder1 = 1222;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "box":
				price11 = 60;
				totalPowder1 = 1350;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "Note":
				price11 = 80;
				totalPowder1 = 1100;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			case "Book":
				price11 = 180;
				totalPowder1 = 1300;
				item.setPrice(price11);
				item.settotalPowder(totalPowder1);
				break;
			default:
				System.out.println("Invalid choice");
				return;
			}
			item.setPrice(price11);
			break;
		default: {
			System.out.println("non of the section in our shop");
			break;
		}
		}
		System.out.println("Customer Details:");
		System.out.println("Enter numberofproduct:");
		int num_product1 = sc.nextInt();
		System.out.println("Customer purchased product name:" + item.getName());
		// System.out.println("********");
		System.out.println("\n");
		System.out.println("\tSupplier Details");
		Supplier supplier = new Supplier(101, null, null, 50, 549.50, new Date());
		System.out.println("Supplier ID: " + supplier.getId());
		System.out.println("Itemname: " + item.getName());
		System.out.println("OrderDate: " + supplier.getOrderDate());
		System.out.println("\t_____________");
		System.out.println("\n");
		System.out.println(" \tPurchase Order Details");
		System.out.println("--------------------------");
		PurchaseOrder po = new PurchaseOrder(1, item, supplier, 50, 549, null);
		System.out.println("Purchase ID:" + po.getId());
		m.totalPrice(item.getPrice(), (int) num_product1);
		System.out.println("________________________");
		System.out.println(" \n \tAdmin Details");
		m.soldOutPockets(item.gettotalPowder(), num_product1);
		sc.close();
	}
	int totalPowder1 =0;
	public int totalPrice;
	static double discount = 0;
	public void soldOutPockets(int totalPowder1, int num_product1) {
		int soldOut1 = totalPowder1 - num_product1;
		//System.out.println("Available Stocks for " + item.getName() + " are: " + soldOut1);

		System.out.println("Available Stocks are:"+ soldOut1);	
	}
	public void totalPrice(double price, int num_product1) {
		double totalPrice = price * num_product1;
		System.out.println("Total price is " + totalPrice);
		if (totalPrice > 1000 && totalPrice<1500) {
			discount = 0.05 * totalPrice;
			totalPrice -= discount;
			System.out.println("Give 5% discount: " + totalPrice);

		} else if (totalPrice >=1500 && totalPrice<3000) {
			discount = 0.1 * totalPrice;
			totalPrice -= discount;
			System.out.println("Give 10% discount: " + totalPrice);
		} else if (totalPrice >= 3000 && totalPrice<5000) {
			discount = 0.15 * totalPrice;
			totalPrice -= discount;
			System.out.println("Give 15% discount: " + totalPrice);
		} else if ( totalPrice>=5000 && totalPrice<=10000) {
			discount = 0.2 * totalPrice;
			totalPrice -= discount;
			System.out.println("Give 20% discount: " + totalPrice);
		} 
		else {
			System.out.println("Discount not approved for your product, price is too low");
			System.out.println("Offers are only available with our coupon code");
		}
	}
}
