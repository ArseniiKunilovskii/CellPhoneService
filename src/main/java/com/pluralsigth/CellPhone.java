package com.pluralsigth;

public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.carrier = carrier;
        this.owner = owner;
        this.serialNumber = serialNumber;

    }
    public CellPhone(){

    }
    public static void display(CellPhone phone){
        System.out.println("The owner is " + phone.getOwner());
        System.out.println("The model is " + phone.getModel());
        System.out.println("The carrier is " + phone.getCarrier());
        System.out.println("The phone number is " + phone.getPhoneNumber());
    }
    public void dial(String phoneNumber){
        System.out.println(getOwner()+"'s phone is calling " + phoneNumber);
    }
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
