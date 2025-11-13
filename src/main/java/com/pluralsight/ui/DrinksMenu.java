package com.pluralsight.ui;
import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;

import java.util.Scanner;
import java.util.ArrayList;
public class DrinksMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<Items> orderItems) {
        boolean choosing = true;

        while (choosing) {
            System.out.println("\nSelect a drink: ");
            System.out.println("1) Milkis - $2.99");
            System.out.println("2) Soda - $1.99");
            System.out.println("3) Iced Tea- $2.49");
            System.out.println("0) Done choosing drinks");
            System.out.println("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    orderItems.add(new Items("Milkis", "Drink",2.99));
                    System.out.println(Colors.BLUE + "Added Milkis" + Colors.RESET);
                    break;
                case "2":
                    orderItems.add(new Items("Soda", "Drink",1.99));
                    System.out.println(Colors.BLUE + "Added Soda" + Colors.RESET);
                    break;
                case "3":
                    orderItems.add(new Items("Iced Tea", "Drink",2.49));
                    System.out.println(Colors.BLUE + "Added Iced Tea" + Colors.RESET);
                    break;
                case "0":
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid Option.");
            }

        }
    }

}
