package org.example.Condicionais;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DescontoCompra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Total purchase amount: R$ ");
        double purschaseAmount = sc.nextDouble();

        double amountWithDiscount = calculaDesconto(purschaseAmount);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Final purchase amount: " + currencyFormat.format(amountWithDiscount));
    }

    private static double calculaDesconto(double purschaseAmount) {
        if (purschaseAmount > 100) {
            System.out.println("Discount of 10% applied for purchases over R$ 100.");
            double discount = purschaseAmount * 0.1;
            purschaseAmount -= discount;
        }

        return purschaseAmount;
    }
}
