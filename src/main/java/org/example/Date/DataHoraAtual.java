package org.example.Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataHoraAtual {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime horaAgora = LocalTime.now();
        System.out.println("\nData atual: " + date);
        System.out.println("Hora agora: " + horaAgora);
    }
}
