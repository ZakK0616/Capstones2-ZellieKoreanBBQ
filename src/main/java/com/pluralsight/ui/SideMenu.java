package com.pluralsight.ui;
import com.pluralsight.models.ItemScreen;

import java.util.Scanner;
import java.util.ArrayList;

public class SideMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<ItemScreen> orderItems) {
        boolean choosing = true;
        while (choosing) {
            System.out.println("\nSelect a side:");
            System.out.println("1) Kimchi - 4.99");
            System.out.println("2) Seaweed Salad - 3.99");
            System.out.println("3) Bean Sprouts - 3.49");
            System.out.println("4) Cucumber Salad - 2.99");
            System.out.println("0) Done choosing sides");
            System.out.println("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    orderItems.add(new ItemScreen("Kimchi", "Side",4.99));
                    break;
                case "2":
                    orderItems.add(new ItemScreen("Seaweed Salad", "Side",3.99));
                    break;
                case "3":
                    orderItems.add(new ItemScreen("Bean Sprouts", "Side",3.49));
                    break;
                case "4":
                    orderItems.add(new ItemScreen("Cucumber Salad", "Side",2.99));
                    break;
                case"0":
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
