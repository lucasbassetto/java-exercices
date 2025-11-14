package org.example.Condicionais;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double sideA = sc.nextDouble();

        System.out.print("Enter the length of side B: ");
        double sideB = sc.nextDouble();

        System.out.println("Enter the lenght of side C: ");
        double sideC = sc.nextDouble();

        if(sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("The lengths can form a triangle.");
        } else {
            System.out.println("The lengths cannot form a triangle.");
        }
    }
}
