package org.example.ForWhile;

public class SumRevenue {

    public static void main(String[] args) {

        int[] values = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        System.out.println("Total Revenue: " + sum);
    }
}
