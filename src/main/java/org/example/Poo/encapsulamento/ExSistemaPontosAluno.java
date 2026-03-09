package org.example.Poo.encapsulamento;

public class ExSistemaPontosAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
