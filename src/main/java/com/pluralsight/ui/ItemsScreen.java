package com.pluralsight.ui;

import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemsScreen {
    private static Scanner scanner = new Scanner(System.in);

    public static void show(ArrayList<Items> orderItems) {
        System.out.println(Colors.GREEN + "\n=== Build Your Korean BBQ Plate ===" + Colors.RESET);

        System.out.println(Colors.YELLOW + "Choose your plate size:" + Colors.RESET);
        System.out.println(Colors.CYAN + "1) Small - $9.99" + Colors.RESET);
        System.out.println(Colors.CYAN + "2) Medium - $12.99" + Colors.RESET);
        System.out.println(Colors.CYAN + "3) Large - $15.99" + Colors.RESET);
        System.out.print(Colors.PURPLE + "Enter your choice: " + Colors.RESET);
        String sizeChoice = scanner.nextLine();

        double basePrice = switch (sizeChoice) {
            case "1" -> 9.99;
            case "2" -> 12.99;
            case "3" -> 15.99;
            default -> 12.99;
        };
        String size = switch (sizeChoice) {
            case "1" -> "Small";
            case "2" -> "Medium";
            case "3" -> "Large";
            default -> "Medium";
        };


        System.out.println(Colors.YELLOW + "\nChoose your meat(s):" + Colors.RESET);
        System.out.println(Colors.CYAN + "1) Bulgogi (+$3.00)" + Colors.RESET);
        System.out.println(Colors.CYAN + "2) Pork Belly (+$2.50)" + Colors.RESET);
        System.out.println(Colors.CYAN + "3) Spicy Chicken (+$2.00)" + Colors.RESET);
        System.out.println(Colors.CYAN + "4) Galbi Short Ribs (+$4.00)" + Colors.RESET);
        System.out.println(Colors.CYAN + "0) Done choosing meats" + Colors.RESET);
        double meatCost = 0;
        boolean choosingMeats = true;
        ArrayList<String> meatsChosen = new ArrayList<>();

        while (choosingMeats) {
            System.out.print(Colors.PURPLE + "Choice: " + Colors.RESET);
            String meatChoice = scanner.nextLine();

            switch (meatChoice) {
                case "1":
                    meatCost += 3.00;
                    meatsChosen.add("Bulgogi");
                    System.out.println(Colors.CYAN + "Added Bulgogi!" + Colors.RESET);
                    break;
                case "2":
                    meatCost += 2.50;
                    meatsChosen.add("Pork Belly");
                    System.out.println(Colors.CYAN + "Added Pork Belly!" + Colors.RESET);
                    break;
                case "3":
                    meatCost += 2.00;
                    meatsChosen.add("Spicy Chicken");
                    System.out.println(Colors.CYAN + "Added Spicy Chicken!" + Colors.RESET);
                    break;
                case "4":
                    meatCost += 4.00;
                    meatsChosen.add("Galbi Short Ribs");
                    System.out.println(Colors.CYAN + "Added Galbi Short Ribs!"+ Colors.RESET );
                    break;
                case "0":
                    choosingMeats = false;
                    break;
                default:
                    System.out.println(Colors.RED + "Invalid choice." + Colors.RESET);
            }
        }


        System.out.println(Colors.YELLOW + "\nAdd any premium toppings?" + Colors.RESET);
        System.out.println(Colors.CYAN + "1) Cheese (+$1.00)" + Colors.RESET);
        System.out.println(Colors.CYAN + "2) Fried Egg (+$1.50)" + Colors.RESET);
        System.out.println( Colors.CYAN + "3) Extra Kimchi (+$0.75)" + Colors.RESET);
        System.out.println(Colors.CYAN + "0) None or done adding toppings" + Colors.RESET);
        double premiumCost = 0;
        ArrayList<String> premiumToppings = new ArrayList<>();
        boolean addingToppings = true;

        while (addingToppings) {
            System.out.print(Colors.PURPLE + "Choice: " + Colors.RESET);
            String toppingChoice = scanner.nextLine();

            switch (toppingChoice) {
                case "1":
                    premiumCost += 1.00;
                    premiumToppings.add("Cheese");
                    System.out.println(Colors.BLUE + "Added Cheese!" + Colors.RESET);
                    break;
                case "2":
                    premiumCost += 1.50;
                    premiumToppings.add("Fried Egg");
                    System.out.println(Colors.BLUE + "Added Fried Egg!" + Colors.RESET);
                    break;
                case "3":
                    premiumCost += 0.75;
                    premiumToppings.add("Extra Kimchi");
                    System.out.println(Colors.BLUE + "Added Extra Kimchi!" + Colors.RESET);
                    break;
                case "0":
                    addingToppings = false;
                    break;
                default:
                    System.out.println(Colors.RED + "Invalid option." + Colors.RESET);
            }
        }


        System.out.println(Colors.YELLOW + "\nChoose your sauce:" + Colors.RESET);
        System.out.println(Colors.CYAN + "1) Gochujang (Spicy Chili)" + Colors.RESET);
        System.out.println(Colors.CYAN + "2) Soy Garlic"  + Colors.RESET);
        System.out.println(Colors.CYAN + "3) Sesame Oil with Salt" + Colors.RESET);
        System.out.println(Colors.CYAN + "4) No Sauce" + Colors.RESET);
        System.out.print(Colors.PURPLE + "Choice: " + Colors.RESET);
        String sauceChoice = scanner.nextLine();
        String sauce = switch (sauceChoice) {
            case "1" -> "Gochujang";
            case "2" -> "Soy Garlic";
            case "3" -> "Sesame Oil";
            default -> "No Sauce";
        };


        System.out.println(Colors.YELLOW + "\nWould you like it prepared a special way?" + Colors.RESET);
        System.out.println(Colors.CYAN + "1) Extra Charred (+$1.00)" + Colors.RESET);
        System.out.println(Colors.CYAN + "2) Extra Sauce (+$0.50)" + Colors.RESET);
        System.out.println(Colors.CYAN + "3) None or done picking" + Colors.RESET);
        System.out.print(Colors.PURPLE + "Choice: " + Colors.RESET);
        String specialChoice = scanner.nextLine();
        String special = "Regular";
        double specialCost = 0;

        switch (specialChoice) {
            case "1" -> {
                special = "Extra Charred";
                specialCost = 1.00;
            }
            case "2" -> {
                special = "Extra Sauce";
                specialCost = 0.50;
            }
        }


        double totalPrice = basePrice + meatCost + premiumCost + specialCost;


        String details = String.join(", ", meatsChosen);
        if (!premiumToppings.isEmpty()) details += " + " + String.join(", ", premiumToppings);
        details += " with " + sauce + " (" + special + ")";

        Items customBBQ = new Items("Korean BBQ Plate", "Meal", totalPrice, size, details);
        orderItems.add(customBBQ);

        System.out.println(Colors.GREEN + "\n✅ Added " + customBBQ.getName() + " (" + size + ") - $" + String.format("%.2f", totalPrice) + Colors.RESET);
    }
}

