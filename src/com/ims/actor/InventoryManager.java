package com.ims.actor;

import javafx.css.converter.LadderConverter;

class InventoryManager {
    int id;
    String name;
    Address address;

    InventoryManager() {
        System.out.println("Inventory Manager Constructed");
    }

    InventoryManager(String name, Address address) {
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please select an option");
        System.out.println("Press 1 for viewing profile details");
    }

}