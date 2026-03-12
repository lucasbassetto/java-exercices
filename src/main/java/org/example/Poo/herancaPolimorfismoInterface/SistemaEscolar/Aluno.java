package org.example.Poo.herancaPolimorfismoInterface.SistemaEscolar;

public class Aluno extends Pessoa {

    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + getNome() + ", Idade: " + getIdade() + ", Nota: " + nota);
    }
}
