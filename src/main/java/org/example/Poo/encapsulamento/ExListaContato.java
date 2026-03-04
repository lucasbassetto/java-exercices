package org.example.Poo.encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class ExListaContato {

    public static void main(String[] args) {
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("João", "123456789"));
        contatos.add(new Contatos("Maria", "987654321"));
        contatos.add(new Contatos("Lucas", "4399876621"));

        System.out.println("Contatos:");
        int indice = 1;
        for(Contatos contato : contatos) {
            System.out.format("%d. %s - %s%n", indice, contato.getNome(), contato.getTelefone());
            indice++;
        }
    }
}
