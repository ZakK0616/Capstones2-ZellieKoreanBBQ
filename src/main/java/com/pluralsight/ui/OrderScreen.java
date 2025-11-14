package com.pluralsight.ui;

import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;
import com.pluralsight.util.RemoveItem;

import java.util.Scanner;
import java.util.ArrayList;

public class OrderScreen {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList <Items> orderItems = new ArrayList<>();

    public static void startOrder(){
        System.out.println(Colors.GREEN + "\uD83C\uDF56♨\uFE0F===========Welcome to Zellie's menu what can we get you!===========\uD83C\uDF56♨\uFE0F" + Colors.RESET);
        boolean ordering = true;
        while (ordering) {
            System.out.println(Colors.CYAN + "1) ItemsScreen");
            System.out.println(Colors.CYAN + "2) Sides");
            System.out.println(Colors.CYAN + "3) Drinks");
            System.out.println(Colors.CYAN + "4) Rice");
            System.out.println(Colors.CYAN + "5) Checkout");
            System.out.println(Colors.CYAN + "6) Remove an Item");
            System.out.println(Colors.CYAN + "0) Cancel back to Home screen");
            System.out.print(Colors.PURPLE + "Enter your choice: " + Colors.RESET);
            String choice = scanner.nextLine();
            switch (choice) {
                case ("1"):
                    ItemsScreen.show(orderItems);
                    break;
                case ("2"):
                    SideMenu.show(orderItems);
                    break;
                case ("3"):
                    DrinksMenu.show(orderItems);
                    break;
                case ("4"):
                    RiceMenu.show(orderItems);
                    break;
                case ("5"):
                    if (orderItems.isEmpty()) {
                        System.out.println(Colors.RED + "⚠\uFE0F⚠\uFE0FAdd at least one item please.⚠\uFE0F⚠\uFE0F" + Colors.RESET);
                    }
                    else {
                        CheckoutScreen.process(orderItems);
                    }
                    break;
                case ("6"):
                    RemoveItem.show(orderItems);
                    break;
                case ("0"):
                    orderItems.clear();
                    System.out.println(Colors.PURPLE + "Items in your cart is now clear back to home screen thank you have a great day!" + Colors.RESET);
                    HomeScreen.main(null);
                    ordering = false;
                    break;




            }
        }

    }

}
