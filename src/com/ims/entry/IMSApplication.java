package com.ims.entry;

import com.ims.actor.Address;
import com.ims.actor.Admin;
import com.ims.actor.InventoryManager;
import com.ims.actor.Supplier;

import java.util.Scanner;

class IMSApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to Inventory Management System!");
        System.out.println("Please Press ");
        System.out.println("1 for Admin");
        System.out.println("2 for Supplier");
        System.out.println("3 for Inventory Manager");
        java.util.Scanner scanner = new Scanner(System.in);

        int userSelection = checkUserSelection(scanner);
        while (userSelection < 1 || userSelection > 3) {
            System.out.println("Incorrect Selection, Please try again!");
            userSelection = checkUserSelection(scanner);
        }
        switch (userSelection) {
            case 1:
                Address adminAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
                Admin admin = new Admin("Admin", adminAddress);
                admin.checkProfileDashboard();
                break;
            case 2:
                Address supplierAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
                Supplier supplier = new Supplier("Supplier", supplierAddress);
                supplier.checkProfileDashboard();
                break;
            case 3:
                Address imAddress = new Address("1303", "Laurence Street", "Delhi", 110007);
                InventoryManager im = new InventoryManager("Inventory Manager", imAddress);
                im.checkProfileDashboard();
                break;
            default:

        }
    }
    private static int checkUserSelection(Scanner scanner) {
        // 1 = Admin, 2=Supplier, 3= Inventory Manager
        int systemUserType = scanner.nextInt();
        if (systemUserType < 1 || systemUserType > 3) {
            System.out.println("You pressed an incorrect Key !");
        }
        return systemUserType;
    }
}