package com.bank;
import java.util.Scanner;

public class ABCBank {
    String accountHolderName;
    long accountNumber;
    String email1;
    String phoneNumber1;
    private double balance;

    public void getUserDetails() {
        Scanner scanner = new Scanner(System.in);

        // Validate and set account number
        boolean validAccountNumber = false;
        while (!validAccountNumber) {
            System.out.println("Enter the Account number (10 digits):");
            try {
                accountNumber = Long.parseLong(scanner.nextLine());
                if (isValidAccountNumber(accountNumber)) {
                    validAccountNumber = true;
                } else {
                    System.out.println("Invalid account number. Please enter a 10-digit account number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid account number.");
            }
        }
        System.out.println("Enter the account holder name:");
        accountHolderName = scanner.nextLine();
        boolean validPhoneNumber = false;
        while (!validPhoneNumber) {
            System.out.println("Enter the mobile number:");
            phoneNumber1 = scanner.nextLine();
            if (isValidPhoneNumber(phoneNumber1)) {
                validPhoneNumber = true;
            } else {
                System.out.println("Invalid phone number. Please enter a valid phone number.");
            }
        }
        boolean validEmail = false;
        while (!validEmail) {
            System.out.println("Enter the email:");
            email1 = scanner.nextLine();
            if (isValidEmail(email1)) {
                validEmail = true;
            } else {
                System.out.println("Invalid email address. Please enter a valid email address.");
            }
        }
    }
    private boolean isValidAccountNumber(long accountNumber) {
        return String.valueOf(accountNumber).matches("\\d{10}");
    }
    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }
    private boolean isValidEmail(String email) {
       
        return email.matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
    }

    public void printUserDetails() {
        System.out.println("Name of person: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Email id: " + email1);
        System.out.println("Phone number: " + phoneNumber1);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of $" + amount + " made. New balance is $" + this.balance);
    }

    public void deposit(double amount, int accountNumber) {
        this.balance += amount;
        this.balance += accountNumber;
        System.out.println("Deposit of $" + amount + " made. New balance is $" + this.balance + accountNumber);
    }
}
