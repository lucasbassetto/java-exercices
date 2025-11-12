package org.example.Condicionais;

import java.util.Locale;
import java.util.Scanner;

public class AprovacaoDisciplina {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if(nota >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

    }
}
