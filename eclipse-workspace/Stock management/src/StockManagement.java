import java.util.Date;
import java.util.Scanner;
public class StockManagement{
public static void main(String[] args) {
	int num_product;
		    Scanner sc= new Scanner(System.in);
		    System.out.println("***Stock Management Details***");
		    String[]str= {"MasalaPowder","cosmetics","stationary"};
		    System.out.println("Enter section name:");
		    String str1 = sc.nextLine();
			Item item = new Item(1, null, 10.99, 100);
		        switch(str1)
				{
				  case "MasalaPowder":
					System.out.println("1.Rasam powder\n2.SambarPowder\n 3.Rice Powder");
					break;
				  case "cosmetics":
					System.out.println("1.Lipstick\n 2.eyeliner \n 3.powder");
					break;
				  case "stationary":
					System.out.println("1.pen \n 2. pencile\n 3.rubber\n 4.scale \n 5.box");
					break;
				  default:
				  {
						System.out.println("non of the section in our shop");
						break;
				  }
				}
		        System.out.println("enter Product name");
		        String name = sc.nextLine();
				item.setName(name);
				System.out.println("Enter Price:");
		        double price = sc.nextDouble();
		        item.setPrice(price);  
		        System.out.println("Enter numberofproduct:");
		        int num_product1  = sc.nextInt();
		        System.out.println("Enter Quantity:"); 
		        int quantity = sc.nextInt(); 
		        item.setQuantity(quantity); 
		        System.out.println("Name:"+item.getName());
		        System.out.println("price:"+item.getPrice());
		        System.out.println("quantity:"+item.getQuantity());
		        System.out.println("********");
		        System.out.println("supplier details");
		        Supplier supplier = new Supplier(101, null, null, 50, 549.50, new Date());
		        System.out.println("Supplier ID: " + supplier.getId());
		        System.out.println("Item name: " + item.getName());
		        System.out.println("Quantity: " + item.getQuantity());
		        System.out.println("Order Date: " + supplier.getOrderDate());
		        System.out.println("purchase order details");
		        System.out.println("-------");
		        System.out.println("Enter Total Price:");
		        double totalPrice = sc.nextDouble(); 
		        PurchaseOrder po= new PurchaseOrder(1, item, supplier, 50, 549, null);
		        System.out.println("Purchase ID:"+po.getId());
		        System.out.println("quantity:"+item.getQuantity());
		        System.out.println("total amount is:"+totalPrice);
		        sc.close();
		   }
}
 