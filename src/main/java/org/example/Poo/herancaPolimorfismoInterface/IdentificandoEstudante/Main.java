package org.example.Poo.herancaPolimorfismoInterface.IdentificandoEstudante;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", "Regular");
        Bolsista bolsista = new Bolsista("Pedro");

        aluno.identificar();
        bolsista.identificar();
    }
}
