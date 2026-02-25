package com.Farahnaz;

import com.Farahnaz.model.User;
import com.Farahnaz.repository.InMemoryUserRepository;
import com.Farahnaz.service.AuthService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =======================================
        // 1️⃣ ساخت سرویس و repository
        // =======================================
        AuthService authService = new AuthService(new InMemoryUserRepository());
        Scanner scanner = new Scanner(System.in);

        // ============================
        // 2️⃣ loop اصلی منو
        // ============================
        boolean running = true;
        while (running) {
            System.out.println("\n=== AUTH SYSTEM ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    handleRegister(scanner, authService);
                    break;

                case "2":
                    handleLogin(scanner, authService);
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    running = false; // loop تمام می‌شود
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close(); // بستن Scanner
    }

    // ============================
    // متد handleRegister
    // ============================
    private static void handleRegister(Scanner scanner, AuthService authService) {
        try {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            authService.register(email, password);
            System.out.println("Registration successful!");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // ============================
    // متد handleLogin
    // ============================
    private static void handleLogin(Scanner scanner, AuthService authService) {
        try {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User user = authService.login(email, password);
            System.out.println("Login successful! Welcome " + user.getEmail());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}