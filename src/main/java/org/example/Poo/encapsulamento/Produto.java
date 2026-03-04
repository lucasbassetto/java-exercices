package org.example.Poo.encapsulamento;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double valor) {
        if(valor >= 0) {
            this.preco = valor;
        } else {
            System.out.println("Valor do preço não pode ser negativo.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
