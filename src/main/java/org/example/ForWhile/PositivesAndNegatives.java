package org.example.ForWhile;

import java.util.Scanner;

public class PositivesAndNegatives {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;

        while(true) {
            System.out.print("Enter a number (or 'end' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'end' to stop.");
            }
        }

        System.out.println("Total positive numbers: " + positiveCount);
        System.out.println("Total negative numbers: " + negativeCount);
    }
}
