package com.mobileshop;

import java.util.Scanner;

public class TestMobileShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePurchase mobilePurchase = new MobilePurchase(null, null, 0, null); // Creating an instance of MobilePurchase
        System.out.println("Enter mobile name:");
        String mobileName = sc.nextLine();
        mobilePurchase.setmobileName(mobileName); 
        System.out.println("Enter mobilecolour:");
        String mobileColor = sc.nextLine();
        mobilePurchase.setmobileColor(mobileColor);
        System.out.println("Enter mobile rate:");
        int rate = sc.nextInt();
        System.out.println("Enter mobile model:");
        String mobileModel = sc.next();
        MobileB m2 = new MobileB();
        m2.setmobileName(mobileName);
        sc.close();
        
        
    }
}