package com.ims.actor;

public class InventoryManager extends SystemUser {

    public InventoryManager() {
        super(null,null);
        System.out.println("Inventory Manager Constructed");
    }

    public InventoryManager(String name, Address address) {
        super(name,address);
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    public void checkProfileDashboard(){
        System.out.println("Please select an option");
        System.out.println("Press 1 for viewing profile details");
    }

}