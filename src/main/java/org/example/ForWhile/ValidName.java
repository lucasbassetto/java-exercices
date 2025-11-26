package org.example.ForWhile;

import java.util.Scanner;

public class ValidName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            try {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();

                if (name.isBlank()) {
                    throw new IllegalArgumentException("Name can't be blank.");
                }

                if (name.length() < 3) {
                    throw new IllegalArgumentException("Name must have at least 3 characters.");
                }

                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        System.out.println("Valid name entered: " + name);
    }
}
