package com.pluralsight;


    import java.util.Scanner;


    public class HomeScreen {
        private static Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                System.out.println(Colors.YELLOW + " __        __   _                                   " + Colors.RESET);
                System.out.println(Colors.YELLOW + " \\ \\      / /__| | ___ ___  _ __ ___   ___   " + Colors.RESET);
                System.out.println(Colors.YELLOW + "  \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ " + Colors.RESET);
                System.out.println(Colors.YELLOW + "   \\ V  V /  __/ | (_| (_) | | | | | |  __/ " + Colors.RESET);
                System.out.println(Colors.YELLOW + "    \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  " + Colors.RESET);
                System.out.println("Hello and thank you for picking Zellie Korean BBQ!!!");
                System.out.println("Now what can I help you with??");
            boolean running = true;

            while (running) {
                System.out.println(Colors.YELLOW + "1) To MAKE ORDER: " + Colors.RESET);
                System.out.println(Colors.RED + "0) To CANCEL ORDER: " + Colors.RESET);
                System.out.println(Colors.PURPLE + "Enter your choice: " + Colors.RESET);
                String choice = scanner.nextLine();

                switch (choice) {
                    case ("1"):
                        break;

                    case ("0"):
                        running = false;
                        System.out.println(Colors.RED + "Thank you please come back soon! \uD83D\uDE34 \uD83D\uDE34 \uD83D\uDE34");
                }
            }
        }
        }