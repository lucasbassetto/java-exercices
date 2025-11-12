package org.example.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ComparandoNumeros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double numero1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2) {
            System.out.println("Biggest number: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("Biggest number: " + numero2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
