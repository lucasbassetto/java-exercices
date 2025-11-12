package org.example.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ComparandoNumeros {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
