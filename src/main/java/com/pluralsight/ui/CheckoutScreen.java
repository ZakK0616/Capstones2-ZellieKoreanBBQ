package com.pluralsight.ui;
import com.pluralsight.models.Items;
import com.pluralsight.util.Colors;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckoutScreen {
    public static void process(ArrayList<Items> orderItems) {
        if (orderItems.isEmpty()) {
            System.out.println(Colors.RED + "Your order is empty!" + Colors.RESET);
            return;
        }

        System.out.println(Colors.GREEN + "\n===== CHECKOUT =====" + Colors.RESET);

        double total = 0.0;
        for (Items item : orderItems) {
            System.out.printf("%s (%s) - $%.2f%n", item.getName(), item.getCategory(), item.getPrice());
            total += item.getPrice();
        }

        System.out.println(Colors.CYAN + "-----------------------------" + Colors.RESET);
        System.out.printf(Colors.YELLOW + "TOTAL: $%.2f%n" + Colors.RESET, total);
        System.out.println(Colors.CYAN + "-----------------------------" + Colors.RESET);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nConfirm order? (Y/N)");
        String confirm = scanner.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            generateReceipt(orderItems, total);
            orderItems.clear();
            System.out.println(Colors.BLUE + "Order complete! Receipt saved. Returning to Home Screen..." + Colors.RESET);
        } else {
            orderItems.clear();
            System.out.println(Colors.RED + "Order canceled. Returning to Home Screen..." + Colors.RESET);
        }
    }

    private static void generateReceipt(ArrayList<Items> orderItems, double total) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String filename = "Receipt" + LocalDateTime.now().format(formatter) + ".txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("===== ZELLIE KOREAN BBQ RECEIPT =====\n\n");

            for (Items item : orderItems) {
                writer.write(String.format("%s (%s) - $%.2f%n", item.getName(), item.getCategory(), item.getPrice()));
            }

            writer.write("\n-----------------------------\n");
            writer.write(String.format("TOTAL: $%.2f%n", total));
            writer.write("-----------------------------\n");

        } catch (IOException e) {
            System.out.println(Colors.RED + "Error generating receipt: " + e.getMessage() + Colors.RESET);
        }
            }

        }
