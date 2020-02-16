package com.ims.actor;

public class Address {

    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    public Address(String buildingNumber, String streetName, String city, int pincode){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public Address(){

    }
}
