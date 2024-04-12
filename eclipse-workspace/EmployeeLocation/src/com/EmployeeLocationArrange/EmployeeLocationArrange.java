package com.EmployeeLocationArrange;

import java.util.Scanner;

public class EmployeeLocationArrange {

	public static void main(String[] args) {
		int age = 0;
        char sex;
        char maritalstatus;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
		age = sc.nextInt();
        if (age > 0) {

            System.out.println("enter your gender(F/M)");
            sex = sc.next().charAt(0);
            System.out.println("enter your marital status(Y/N)");
            maritalstatus = sc.next().charAt(0);
            if (sex == 'F')
                System.out.println("Work only in urban areas");
            else if (sex == 'M' && (age >= 20 && age <= 40))
                System.out.println("Work in anywhere");
            else if (sex == 'M' && (age >= 40 && age <= 60))
                System.out.println("Work in urban areas only");
            else if (age > 60 || (age < 20 && age >= 0))
                System.out.println("ERROR");
        } else {
            System.out.println("INVALID INPUT");// validation

        }
    }
	
}


	


