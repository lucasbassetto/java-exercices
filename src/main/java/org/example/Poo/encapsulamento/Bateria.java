package org.example.Poo.encapsulamento;

public class Bateria {

    private int nivelBateria;

    public int getBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria > 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        } else {
            System.out.println("Nível de bateria deve ser entre 1 e 100.");
        }
    }

    public String exibirStatus() {
        if (this.nivelBateria <= 20) {
            return "Nível de bateria baixo";
        } else if (this.nivelBateria <= 50) {
            return "Nível de bateria médio";
        } else {
            return "Nível de bateria alto";
        }
    }
}
