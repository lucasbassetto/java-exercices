package org.example.Poo;

public class ExProdutoValidacao {

    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Celular");
        p.setPreco(-53);

        System.out.format("Produto: %s %nPreço: %.2f%n", p.getNome(), p.getPreco());

    }
}
