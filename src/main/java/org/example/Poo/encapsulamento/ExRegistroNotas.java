package org.example.Poo.encapsulamento;

public class ExRegistroNotas {

    public static void main(String[] args) {

        Disciplina disciplina = new Disciplina("Matematica");

        disciplina.adicionaNota(10);
        disciplina.adicionaNota(-2);
        disciplina.adicionaNota(5);
        disciplina.calcularMedia();

        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Notas: " + disciplina.getNotas());
        System.out.println("Média: " + disciplina.calcularMedia());
        System.out.println("Notas validas: " + disciplina.getNotas().size());
    }
}
