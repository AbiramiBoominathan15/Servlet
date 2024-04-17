package com.bank;
public class TestABCBank 
{
public static void main (String args[])
{
	TestABCBank te= new TestABCBank();
	ABCBank abcbank = new ABCBank();
	abcbank.deposit(2500);
	abcbank.getUserDetails();
	abcbank.printUserDetails();
}
}
