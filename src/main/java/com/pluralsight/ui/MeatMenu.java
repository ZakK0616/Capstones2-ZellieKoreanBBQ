package com.pluralsight.ui;
import com.pluralsight.models.ItemScreen;
import com.pluralsight.util.Colors;

import java.util.ArrayList;
import java.util.Scanner;

public class MeatMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<ItemScreen> orderItems) {
        boolean choosing = true;

        while (choosing){
            System.out.println(Colors.CYAN + "\nSelect a meat you want: "+ Colors.RESET);
            System.out.println(Colors.CYAN + "1) Bulgogi - $12.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "2) Pork Belly - $10.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "3) Spicy Chicken - $11.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "0) Done picking meats!" + Colors.RESET);
            System.out.println(Colors.PURPLE + "Choice: " + Colors.RESET);
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                orderItems.add(new ItemScreen("Bulgogi", "Meat", 12.99));
                    System.out.println(Colors.BLUE + "Added Bulgogi" + Colors.RESET);
                break;
                case "2":
                    orderItems.add(new ItemScreen("Pork Belly", "Meat", 10.99));
                    System.out.println(Colors.BLUE + "Added Pork Belly" + Colors.RESET);
                    break;
                case "3":
                    orderItems.add(new ItemScreen("Spicy Chicken", "Meat", 11.99));
                    System.out.println(Colors.BLUE + "Added Spicy Chicken" + Colors.RESET);
                    break;
                case "0":
                    choosing = false;
                    break;
                default:
                    System.out.println(Colors.RED + "⚠\uFE0F⚠\uFE0FInvalid option.⚠\uFE0F⚠\uFE0F" + Colors.RESET);




            }
        }
    }

}
