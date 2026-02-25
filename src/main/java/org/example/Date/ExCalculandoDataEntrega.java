package org.example.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExCalculandoDataEntrega {

    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = dataInicio.plusDays(15);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataFim.format(formatter);
        System.out.println("Data Entrega: " + dataFormatada);
    }
}
