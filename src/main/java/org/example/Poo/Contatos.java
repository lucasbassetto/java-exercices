package org.example.Poo;

public class Contatos {

    private final String nome;
    private final String telefone;

    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
