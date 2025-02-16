package com.mycompany.mavenproject5;

import java.util.Scanner;

//Class Definition of MyComputer
public class MyComputer {

    Scanner input = new Scanner(System.in);

//  Attributes
    String name = "EliteX840";
    String processor = "Intel(R) Core(TM) i7-8650U CPU @ 1.90GHz   2.11 GHz";
    String ram = "16.0 GB (15.8 GB usable)";
    String deviceID = "9750F5E3-8776-4994-9F95-7613A3D02D32";
    String productID = "00330-51729-89913-AAOEM";
    String systemType = "64-bit operating system, x64-based processor";

//  Methods
    void powerOn() {
        System.out.println("Do you want to turn the computer on?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            System.out.println("Loading...");
            showConfig();
        } else {
            System.out.println("Program Terminated!");
        }
    }

    void showConfig() {
        System.out.println("Device name:" + name);
        System.out.println("Processor:" + processor);
        System.out.println("Installed RAM:" + ram);
        System.out.println("Device ID:" + deviceID);
        System.out.println("Product ID:" + productID);
        System.out.println("System type:" + systemType);
    }

    void update() {
        System.out.println("What do you want to update?");
        char response = input.next().charAt(0);
        input.nextLine();
        switch (response) {
            case 'n':
                System.out.println("Enter the updated value:");
                name = input.nextLine();
                break;
            case 'r':
                System.out.println("Enter the updated value:");
                ram = input.nextLine();
                break;
            case 'd':
                System.out.println("Enter the updated value:");
                deviceID = input.nextLine();
                break;
            case 'p':
                System.out.println("Enter the updated value:");
                productID = input.nextLine();
                break;
            case 's':
                System.out.println("Enter the updated value:");
                systemType = input.nextLine();
                break;
            default:
                System.out.println("Invalid input!");
        }
                        showConfig();
    }
}
