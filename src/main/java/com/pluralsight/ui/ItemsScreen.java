package com.pluralsight.ui;

import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemsScreen {
    private static Scanner scanner = new Scanner(System.in);

    public static void start(ArrayList<Items> orderItems) {
        System.out.println(Colors.GREEN + "\n===== ADD KOREAN BBQ ITEM =====" + Colors.RESET);

        // 1) Select meat type
        System.out.println("Select meat:");
        System.out.println("1) Bulgogi - $12.99");
        System.out.println("2) Pork Belly - $10.99");
        System.out.println("3) Spicy Chicken - $11.99");
        String meatChoice = scanner.nextLine();

        String meat = "";
        double basePrice = 0.0;
        switch (meatChoice) {
            case "1" -> { meat = "Bulgogi"; basePrice = 12.99; }
            case "2" -> { meat = "Pork Belly"; basePrice = 10.99; }
            case "3" -> { meat = "Spicy Chicken"; basePrice = 11.99; }
            default -> { meat = "Custom Meat"; basePrice = 12.00; }
        }

        // 2) Select size
        System.out.println("Select size:");
        System.out.println("1) Small");
        System.out.println("2) Medium (+$2.00)");
        System.out.println("3) Large (+$4.00)");
        String sizeChoice = scanner.nextLine();

        String size = switch (sizeChoice) {
            case "1" -> "Small";
            case "2" -> "Medium";
            case "3" -> "Large";
            default -> "Medium";
        };

        double finalPrice = basePrice;
        switch (size) {
            case "Medium" -> finalPrice += 2.00;
            case "Large" -> finalPrice += 4.00;
        }

        // 3) Add toppings / sides
        ArrayList<String> toppings = new ArrayList<>();
        boolean addingToppings = true;
        while (addingToppings) {
            System.out.println("Enter a topping/side to add (or 0 to finish):");
            String topping = scanner.nextLine();
            if (topping.equals("0")) {
                addingToppings = false;
            } else {
                toppings.add(topping);
                System.out.println(Colors.BLUE + topping + " added." + Colors.RESET);
                finalPrice += 1.00; // example: add price for extra topping
            }
        }

        // 4) Special options
        System.out.println("Would you like the item specialized? (toasted/stuffed/deep fried/none)");
        String specialOption = scanner.nextLine();
        if (specialOption.equalsIgnoreCase("none") || specialOption.isEmpty()) {
            specialOption = "";
        } else {
            finalPrice += 1.50; // price for special option
        }

        // 5) Create item and add to order
        Items item = new Items(meat, "Korean BBQ", finalPrice, size, specialOption);
        orderItems.add(item);

        System.out.println(Colors.BLUE + item + " added to your order!" + Colors.RESET);
    }
}

