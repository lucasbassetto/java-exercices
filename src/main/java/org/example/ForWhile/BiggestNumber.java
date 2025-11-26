package org.example.ForWhile;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a series of integers separated by spaces: ");
        String[] n = scanner.nextLine().split(" ");
        int biggest = Integer.MIN_VALUE;

        for(String numberStr : n){
            try {
                int number = Integer.parseInt(numberStr);
                if(number > biggest){
                    biggest = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid: " + numberStr + " isn't a integer number.");
            }
        }
    }
}
