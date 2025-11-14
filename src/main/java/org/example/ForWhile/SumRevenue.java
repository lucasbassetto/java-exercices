package org.example.ForWhile;

import java.util.Scanner;

public class SumRevenue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[2];
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        for (int value : valores) {
            soma += value;
        }
        System.out.println("Total Revenue: " + soma);

        System.out.println("--------------------------------");

        int[] values = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        System.out.println("Total Revenue: " + sum);
    }
}
