package org.example.Condicionais;

import java.util.Scanner;

public class VerificandoSenha {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();
        String senhaCorreta = "12345";

        if(senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
