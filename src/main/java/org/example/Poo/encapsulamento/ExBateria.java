package org.example.Poo.encapsulamento;

public class ExBateria {

    public static void main(String[] args) {

        Bateria bateria = new Bateria();
        bateria.setNivelBateria(21);
        System.out.println("Status: " + bateria.exibirStatus());
    }
}
