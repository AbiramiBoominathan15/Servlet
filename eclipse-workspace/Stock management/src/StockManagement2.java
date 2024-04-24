import java.util.Date;
import java.util.Scanner;
public class StockManagement2{
public static void main(String[] args) {
	int num_product;
	StockManagement2 m = new StockManagement2();
		    Scanner sc= new Scanner(System.in);
		    System.out.println("***Stock Management Details***");
		    System.out.println("choose the section \n\nMasalaPowder,\ncosmetics,\nstationary");
		    String[]str= {"MasalaPowder","cosmetics","stationary"};
		    System.out.println("Enter section name:");
		    String sectionName = sc.nextLine();
			Item item = new Item(1, null, 10.99, 100);
		        switch(sectionName)
				{
				  case "MasalaPowder":
					System.out.println("1.Rasampowder\n2.SambarPowder\n 3.Rice Powder");
					System.out.println("Enter Product name:");
					String itemName = sc.nextLine();
					item = new Item();
					item.setName(itemName);
					double price;
					switch (itemName) {
					case "Rasampowder":
						price = 25;
						break;
					case "SambarPowder":
						price = 35;
						break;
					case "RicePowder":
						price = 40;
						break;
					case "CurryLeavesPowder":
						price = 40;
						break;
					case "TurmericPowder":
						price = 40;
						break;
					default:
						System.out.println("Invalid choice");
						return;
					}
					item.setPrice(price);
					break;
				  case "cosmetics":
					System.out.println("1.Lipstick\n 2.eyeliner \n 3.powder\n 4.RosePowder\n 5.Hairstraightner");
					System.out.println("Enter Product name:");
					String itemName1 = sc.nextLine();
					item = new Item();
					item.setName(itemName1);
					double price1;
					switch (itemName1) {
					case "Lipstick":
						price1 = 15;
						break;
					case "eyeliner":
						price1 = 55;
						break;
					case "powder":
						price1 = 40;
						break;
					case "RosePowder":
	                    price1 = 105;
	                    break;
	                case "Hairstraightner":
	                    price1 = 200;
	                    break;
	                
					default:
						System.out.println("Invalid choice");
						return;
					}
					item.setPrice(price1);
					break;
				  case "stationary":
					System.out.println("1.pen \n 2. pencile\n 3.rubber\n 4.scale \n 5.box");
					System.out.println("Enter Product name:");
					String itemName11 = sc.nextLine();
					item = new Item();
					item.setName(itemName11);
					double price11;
					switch (itemName11) {
					case "pen":
						price11 = 25;
						break;
					case "pencile":
						price11 = 35;
						break;
					case "rubber":
						price11 = 40;
						break;
					case "scale":
						price11 = 20;
						break;
					case "box":
						price11 = 60;
						break;
					
					default:
						System.out.println("Invalid choice");
						return;
					}
					item.setPrice(price11);
					break;
				  default:
				  {
						System.out.println("non of the section in our shop");
						break;
				  }
				}
		        System.out.println("Enter numberofproduct:");
		        int num_product1  = sc.nextInt();
		       // System.out.println("Enter Quantity:"); 
		      //  int quantity = sc.nextInt(); 
		      //  item.setQuantity(quantity); 
		        System.out.println("Customer purchased product name:"+item.getName());
		       // System.out.println("********");
		        System.out.println("\n");
		        System.out.println("\tSupplier Details");
		        Supplier supplier = new Supplier(101, null, null, 50, 549.50, new Date());
		        System.out.println("Supplier ID: " + supplier.getId());
		        System.out.println("Item name: " + item.getName());
		        System.out.println("Order Date: " + supplier.getOrderDate());
		        System.out.println("\t_____________");
		        System.out.println("\n");
		        System.out.println("Purchase Order Details");
		        System.out.println("-------");
		        PurchaseOrder po= new PurchaseOrder(1, item, supplier, 50, 549, null);
		        System.out.println("Purchase ID:"+po.getId());
				m.totalPrice(item.getPrice(), (int) num_product1);
		        sc.close();
		   }
public void totalPrice(double price, int num_product1) {
	double totalPrice = price * num_product1;
	System.out.println("Total price is " + totalPrice);
}
}