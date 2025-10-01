package com.pluralsigth;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CellPhone phone1 = new CellPhone(123456, "Iphone 16 Pro Max", "verizon","555-606-1234","Sasha" );
        CellPhone phone2 = new CellPhone(987654, "One Plus 7 Pro", "mint","333-111-8978","Rita" );
        CellPhone.display(phone1);
        System.out.println();
        CellPhone.display(phone2);
        System.out.println();
        phone1.dial(phone2.getPhoneNumber());
//        System.out.println("Welcome to Cell Phone Service");
//        System.out.println("Please provide following information");
//        System.out.println("What is the serial number: ");
//        newPhone.setSerialNumber(Integer.parseInt(in.nextLine()));
//        System.out.println("What model is the phone: ");
//        newPhone.setModel(in.nextLine());
//        System.out.println("What is your phone number? ");
//        newPhone.setPhoneNumber(in.nextLine());
//        System.out.println("What is your carrier? ");
//        newPhone.setCarrier(in.nextLine());
//        System.out.println("What is your name? ");
//        newPhone.setOwner(in.nextLine());
//
//        System.out.println("Thank you! Please check if everything correct");
//        System.out.println("The owner is " + newPhone.getOwner());
//        System.out.println("The model is " + newPhone.getModel());
//        System.out.println("The carrier is " + newPhone.getCarrier());
//        System.out.println("The phone number is " + newPhone.getPhoneNumber());
//        System.out.println("Is it right?(yes/no)");
//        if(in.nextLine().equals("yes")){
//            System.out.println("Great! Your phone is in work.");
//        }
//        else {
//            System.out.println("Please rerun the program.");
//        }

    }
}

