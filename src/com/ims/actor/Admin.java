package com.ims.actor;

import com.ims.data.SupplierHolder;

// class <className>
public class Admin extends SystemUser {
    //DataType nameofattribute

    Supplier[] suppliers = new Supplier[1000];
    private static int supCount = 0;

    public Admin(){
        super(null, null);
        System.out.println("Admin Constructed !!");
    }

    public Admin(String n, Address address){
        super(n, address);
    }

    public Admin(String n1, Address address, String text){
        super(n1, address);
    }

    // returnType methodName(){ //method definition -> return statement}
    public void checkProfileDashboard(){
        System.out.println("Please select an option");
        System.out.println("Press 1 for viewing profile details");
        System.out.println("Press 2 for viewing number of suppliers");
    }

    public void addSupplier(Supplier supplier){
        // Store the supplier
        int id = storeSupplier(supplier);
        supplier.setId(id);
        mapSupplier(supplier);
        // Mapping the supplier to the administrator

    }

    // Storing a supplier
    private int storeSupplier(Supplier supplier){
        int index = SupplierHolder.saveSupplier(supplier);
        return index;
    }

    // Mapping a supplier with Admin
    private void mapSupplier(Supplier supplier){
        suppliers[supCount] = supplier;
        supCount = supCount + 1;
    }


}
