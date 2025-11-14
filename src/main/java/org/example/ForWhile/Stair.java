package org.example.ForWhile;

import java.util.Scanner;

public class Stair {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels for the staircase: ");
        int levels = sc.nextInt();

        for (int i = 1; i <= levels; i++) {
            System.out.println("Level " + (i));
        }
        System.out.println("Staircase completed!");
    }
}
