package com.pluralsight.ui;
import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;

import java.util.Scanner;
import java.util.ArrayList;
public class RiceMenu {
    private static Scanner scanner = new Scanner(System.in);
    public static void show(ArrayList<Items> orderItems) {
        boolean choosing = true;

        while (choosing) {
            System.out.println(Colors.YELLOW + "\n Would you like to add rice?");
            System.out.println(Colors.CYAN + "1) Yes - $1.99" + Colors.RESET);
            System.out.println(Colors.CYAN + "2) No" + Colors.RESET);
            System.out.println(Colors.PURPLE + "Choice: " + Colors.RESET);
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    orderItems.add(new Items("Rice", "Side", 1.99));
                    System.out.println(Colors.BLUE + "Added Rice" + Colors.RESET);
                    break;
                case "2":
                case "0":
                    choosing = false;
                    break;
                default:
                    System.out.println(Colors.RED + "⚠\uFE0F⚠\uFE0FInvalid option.⚠\uFE0F⚠\uFE0F" + Colors.RESET);
            }
        }

    }
}
