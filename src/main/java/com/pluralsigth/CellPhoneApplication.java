package com.pluralsigth;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CellPhone newPhone = new CellPhone();

        System.out.println("Welcome to Cell Phone Service");
        System.out.println("Please provide following information");
        System.out.println("What is the serial number: ");
        newPhone.setSerialNumber(Integer.parseInt(in.nextLine()));
        System.out.println("What model is the phone: ");
        newPhone.setModel(in.nextLine());
        System.out.println("What is your phone number? ");
        newPhone.setPhoneNumber(in.nextLine());
        System.out.println("What is your carrier? ");
        newPhone.setCarrier(in.nextLine());
        System.out.println("What is your name? ");
        newPhone.setOwner(in.nextLine());

        System.out.println("Thank you! Please check if everything correct");
        System.out.println("The owner is " + newPhone.getOwner());
        System.out.println("The model is " + newPhone.getModel());
        System.out.println("The carrier is " + newPhone.getCarrier());
        System.out.println("The phone number is " + newPhone.getPhoneNumber());
        System.out.println("Is it right?(yes/no)");
        if(in.nextLine().equals("yes")){
            System.out.println("Great! Your phone is in work.");
        }
        else {
            System.out.println("Please rerun the program.");
        }
    }
}

