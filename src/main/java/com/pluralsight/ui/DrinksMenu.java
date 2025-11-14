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
            System.out.println( "\nSelect a drink: " + Colors.RESET);
            System.out.println(Colors.CYAN + "1) Milkis - $2.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "2) Soda - $1.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "3) Iced Tea- $2.49" + Colors.RESET);
            System.out.println(Colors.CYAN + "0) Done choosing drinks" + Colors.RESET);
            System.out.println(Colors.PURPLE + "Choice: " + Colors.RESET);
            String choice = scanner.nextLine();
            String drinkName = "";

            if (choice.equals("0")) {
                choosing = false;
                continue;
            }

            switch (choice) {
                case "1" -> drinkName = "Milkis";
                case "2" -> drinkName = "Soda";
                case "3" -> drinkName = "Iced Tea";
                default -> {
                    System.out.println(Colors.RED + "⚠\uFE0F⚠\uFE0FInvalid option.⚠\uFE0F⚠\uFE0F" + Colors.RESET);
                    continue;
                }
            }


            System.out.println(Colors.YELLOW + "Select size for " + drinkName + ":" + Colors.RESET);
            System.out.println(Colors.CYAN + "1) Small - $1.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "2) Medium - $2.49" + Colors.RESET);
            System.out.println(Colors.CYAN + "3) Large - $2.99" + Colors.RESET);
            System.out.print(Colors.PURPLE + "Enter your choice: " + Colors.RESET);
            String sizeChoice = scanner.nextLine();

            double price = switch (sizeChoice) {
                case "1" -> 1.99;
                case "2" -> 2.49;
                case "3" -> 2.99;
                default -> 2.49;
            };
            String size = switch (sizeChoice) {
                case "1" -> "Small";
                case "2" -> "Medium";
                case "3" -> "Large";
                default -> "Medium";
            };


            Items drinkItem = new Items(drinkName, "Drink", price, size, "");
            orderItems.add(drinkItem);

            System.out.println(Colors.BLUE + "Added " + drinkName + " (" + size + ") - $" + String.format("%.2f", price) + Colors.RESET);

        }
    }

}
