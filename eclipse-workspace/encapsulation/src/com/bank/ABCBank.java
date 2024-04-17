package com.bank;
import java.util.Scanner;
public class ABCBank {
	String accountHolderName;
	String accountNumber;
	String email1;
	String phoneNumber1;
	private double balance;
	public void getUserDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Account number:");
      accountNumber = sc.nextLine();
	System.out.println("Enter the accountHolderName");
	 accountHolderName = sc.nextLine();
	System.out.println("Enter the mobile number:");
	 phoneNumber1 = sc.nextLine();
	System.out.println("Enter the emailid");
	 email1 = sc.nextLine();
}
public void printUserDetails()
{
	System.out.println("name of person :"+accountHolderName);
	System.out.println("name of the accountnumber"+accountNumber);
	System.out.println("Email id:"+email1);
	System.out.println("phonenumber:"+phoneNumber1);
}
public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposit of $" + amount + " made. New balance is $" + this.balance);
}
}
