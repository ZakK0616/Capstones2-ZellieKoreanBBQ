package com.pluralsight.ui;
import com.pluralsight.models.ItemScreen;

import java.util.Scanner;
import java.util.ArrayList;
public class RiceMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<ItemScreen> orderItems) {
        boolean choosing = true;

        while (choosing) {
            System.out.println("\n Would you like to add rice?");
            System.out.println("1) Yes - $1.99");
            System.out.println("2) No");
            System.out.println("Choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    orderItems.add(new ItemScreen("Rice", "Side", 1.99));
                    System.out.println("Added Rice. ");
                    break;
                case "2":
                case "0":
                    choosing = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

    }
}
