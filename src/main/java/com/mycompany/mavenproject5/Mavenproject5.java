
package com.mycompany.mavenproject5;

import java.util.Scanner;

public class Mavenproject5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//      First object of Student
        MyComputer c1 = new MyComputer();
        c1.powerOn();
        System.out.println("Do you want to update your system?");
        char response = input.next().charAt(0);
        if (response == 'y') {
            c1.update();
        } else {
            System.out.println("Thank You!");
        }
    }
}
