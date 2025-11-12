package org.example.Condicionais;

import java.util.Scanner;

public class WeekDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weekday: ");
        String day = scanner.nextLine().toLowerCase();

        try {
            if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
                System.out.println("It's a weekday.");
            } else if (day.equals("saturday") || day.equals("sunday")) {
                System.out.println("It's the weekend!");
            } else {
                System.out.println("Invalid input. Please enter a valid weekday.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. Please try again.");
        }
    }
}

