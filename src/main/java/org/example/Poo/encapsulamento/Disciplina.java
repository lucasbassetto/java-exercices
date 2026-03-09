package org.example.Poo.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void adicionaNota(double nota) {
        if(nota >= 0 && nota <= 10) {
            this.notas.add(nota);
        } else {
            System.out.println("Nota inválida: " + nota);
        }
    }

    public double calcularMedia(){
        double soma = 0;

        if(notas.isEmpty()) return 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }


}
