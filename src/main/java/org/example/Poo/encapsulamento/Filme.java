package org.example.Poo.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String titulo;
    private List<Integer> avaliacoes = new ArrayList<>();

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarAvaliacao(int nota) {
        if (nota >= 0 && nota <= 10) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota deve ser entre 0 e 10.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for(double nota : avaliacoes) {
            soma += nota;
        }
        return soma / avaliacoes.size();
    }

    public String getTitulo() {
        return titulo;
    }
}
