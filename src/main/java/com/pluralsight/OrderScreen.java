package com.pluralsight;

import java.util.Scanner;
import java.util.ArrayList;

public class OrderScreen {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList <ItemScreen> orderItems = new ArrayList<>();

    public static void startOrder(){
        System.out.println(Colors.GREEN + "\uD83C\uDF56♨\uFE0F===========Welcome to Zellie's menu what can we get you!===========\uD83C\uDF56♨\uFE0F" + Colors.RESET);
        boolean ordering = true;
        while (ordering) {
            System.out.println(Colors.CYAN + "1) Meats");
            System.out.println(Colors.CYAN + "2) Sides");
            System.out.println(Colors.CYAN + "3) Drinks");
            System.out.println(Colors.CYAN + "4) Rice");
            System.out.println(Colors.CYAN + "5) View Order");
            System.out.println(Colors.CYAN + "0) Checkout");
            System.out.print(Colors.PURPLE + "Enter your choice: " + Colors.RESET);
            String choice = scanner.nextLine();
            switch (choice) {
                case ("1"):
                    break;
                case ("2"):
                    break;
                case ("3"):
                    break;
                case ("4"):
                    break;
                case ("5"):
                    break;
                case ("0"):
                    



            }
        }

    }

}
