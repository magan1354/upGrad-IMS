package com.ims.actor;

import com.ims.data.SupplierHolder;

// class <className>
class Admin extends SystemUser {
    //DataType nameofattribute

    Supplier[] suppliers = new Supplier[1000];
    private static int supCount = 0;

    Admin(){
        super(null, null);
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, Address address){
        super(n, address);
        setName(n);
        setAddress(address);
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please select an option");
        System.out.println("Press 1 for viewing profile details");
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
