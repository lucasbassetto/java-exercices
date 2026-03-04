package org.example.Poo.encapsulamento;

import java.util.Scanner;

public class ExValidacaoLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User aluno = new User("aluno2025", "escola@123");
        int tentativasRestantes = 3;


        while(tentativasRestantes > 0) {
            System.out.print("Digite o login: ");
            String login = sc.nextLine();
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if(aluno.validarSenha(login, senha)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + aluno.getLogin() + "!");
                break;
            } else {
                tentativasRestantes--;
                if(tentativasRestantes == 0) {
                    System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
                } else {
                    System.out.println("Login ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
    }
}
