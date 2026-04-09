package com.pluralsight;

import java.util.Scanner;

public class SandwichPrice {
    public static void main(String[] args) {

        double regularPrice = 5.45;
        double largePrice = 8.95;
        double discount = 0;

        Scanner user = new Scanner(System.in);

        System.out.print("How old are you?: ");
        int age = user.nextInt();

        if (age <= 17) {
            discount = .10;
        } else if (age >= 65) {
            discount = .20;
        }

        System.out.println("\nWhat size \n(1) Regular \n(2) Large");
        int size = user.nextInt();

        if (size == 1) {
            System.out.printf("That is " + "%.2f", (regularPrice * (1 - discount)));
        } else if (size == 2) {
            System.out.printf("That is " + "%.2f", (largePrice * (1 - discount)));
        } else {
            System.out.println("Not an option");
        }

        user.close();
    }
}
