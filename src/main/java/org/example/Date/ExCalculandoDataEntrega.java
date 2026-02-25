package org.example.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExCalculandoDataEntrega {

    public static void main(String[] args) {

        LocalDate dataInicio = LocalDate.of(2026,3,15);
        LocalDate dataFim = dataInicio.plusDays(15);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Data Entrega: " + dataFim.format(formatter));
    }
}
