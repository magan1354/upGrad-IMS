package com.ims.actor;
// class <className>
class Admin {
    //DataType nameofattribute
    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please select an option");
        System.out.println("Press 1 for viewing profile details");
    }

    String getName(){
        return name;
    }
}
