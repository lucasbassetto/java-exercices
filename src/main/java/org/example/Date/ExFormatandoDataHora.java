package org.example.Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExFormatandoDataHora {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        LocalTime hora = LocalTime.now();

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data formatada: " + data.format(dataFormatada));
        System.out.println("Hora formatada: " + hora.format(horaFormatada));

    }
}
