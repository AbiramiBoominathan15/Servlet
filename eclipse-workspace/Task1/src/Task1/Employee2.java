package Task1;

import java.util.Scanner;

public class Employee2 implements Employee1 {

	@Override
	public void printUserDetails() {
		System.out.println("employee name" + name);
		System.out.println("employee role" + role);
	}

	public String name;
	public int role;

	@Override
	public void getUserDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter the role");
		role = sc.nextInt();
	}
}
