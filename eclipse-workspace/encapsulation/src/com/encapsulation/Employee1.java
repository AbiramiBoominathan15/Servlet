package com.encapsulation;

import java.util.Scanner;

public abstract class Employee1 {

	public String name;
	public int role;
	public void getUserDetails(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
	       name= sc.nextLine();
	       System.out.println("Enter the role");
			role= sc.nextInt();     
	}
	
	public abstract void printUserDetails();
	
}
