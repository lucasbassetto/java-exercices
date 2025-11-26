package org.example.ForWhile;

import java.util.Scanner;

public class SafeLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final String PASSWORD = "admin123";


        for(int  attempts = 3; attempts > 0; attempts--) {
            System.out.print("Enter your password: ");
            String input = scanner.nextLine();

            if(input.equals(PASSWORD)) {
                System.out.println("Login successful!");
                break;
            } else if(attempts > 1) {
                System.out.println("Incorrect password. Try again. You have " + (attempts - 1) + " attempts left.");
            } else {
                System.out.println("Incorrect password. Your account is locked.");
            }
        }
    }
}
