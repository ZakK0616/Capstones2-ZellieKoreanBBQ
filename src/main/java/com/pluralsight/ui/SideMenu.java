package com.pluralsight.ui;
import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;

import java.util.Scanner;
import java.util.ArrayList;

public class SideMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<Items> orderItems) {
        boolean choosing = true;
        while (choosing) {
            System.out.println(Colors.YELLOW + "\nSelect a side:" + Colors.RESET);
            System.out.println(Colors.CYAN + "1) Kimchi - 4.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "2) Seaweed Salad - 3.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "3) Bean Sprouts - 3.49" + Colors.RESET);
            System.out.println(Colors.CYAN + "4) Cucumber Salad - 2.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "0) Done choosing sides" + Colors.RESET);
            System.out.println(Colors.PURPLE + "Choice: " + Colors.RESET);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    orderItems.add(new Items("Kimchi", "Side",4.99));
                    System.out.println(Colors.BLUE + "Added Kimchi" + Colors.RESET);
                    break;
                case "2":
                    orderItems.add(new Items("Seaweed Salad", "Side",3.99));
                    System.out.println(Colors.BLUE + "Added seaweed Salad" + Colors.RESET);
                    break;
                case "3":
                    orderItems.add(new Items("Bean Sprouts", "Side",3.49));
                    System.out.println(Colors.BLUE + "Added Bean Sprouts" + Colors.RESET);
                    break;
                case "4":
                    orderItems.add(new Items("Cucumber Salad", "Side",2.99));
                    System.out.println(Colors.BLUE + "Added Cucumber Salad" + Colors.RESET);
                    break;
                case"0":
                    choosing = false;
                    break;
                default:
                    System.out.println(Colors.RED + "⚠\uFE0F⚠\uFE0FInvalid option.⚠\uFE0F⚠\uFE0F"+ Colors.RESET);
            }
        }
    }
}
