package com.ims.entry;

import java.util.Scanner;

class IMSApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Inventory Management System!");
        System.out.println("Please Press ");
        System.out.println("1 for Admin");
        System.out.println("2 for Supplier");
        System.out.println("3 for Inventory Manager");
        java.util.Scanner scanner = new Scanner(System.in);
        while (checkUserSelection(scanner) == false) {
            System.out.println("Incorrect Selection, Please try again!");
        }
    }

    private static boolean checkUserSelection (Scanner scanner){
        // 1 = Admin, 2=Supplier, 3= Inventory Manager
        boolean correct = true;
        int systemUserType = scanner.nextInt();
        if (systemUserType < 1 || systemUserType > 3) {
            System.out.println("You pressed an incorrect Key !");
            correct = false;
        }
        return correct;
    }
}