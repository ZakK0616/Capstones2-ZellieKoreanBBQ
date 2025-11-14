package com.pluralsight.util;

import com.pluralsight.models.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveItem {private static Scanner scanner = new Scanner(System.in);

    public static void show(ArrayList<Items> orderItems) {
        if(orderItems.isEmpty()) {
            System.out.println("No items to remove!");
            return;
        }

        System.out.println("Select item to remove:");
        for(int i = 0; i < orderItems.size(); i++) {
            System.out.println((i+1) + ") " + orderItems.get(i));
        }
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if(choice > 0 && choice <= orderItems.size()) {
            Items removed = orderItems.remove(choice - 1);
            System.out.println("Removed: " + removed.getName());
        } else {
            System.out.println("Invalid choice!");
        }
    }

}
