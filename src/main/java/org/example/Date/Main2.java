package org.example.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main2 {
    public static void main(String[] args) {

        LocalDate actualDateOf = LocalDate.of(2026,2,11);
        LocalDate actualDateParse = LocalDate.parse("2026-02-11");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data atual: " + actualDateOf);
        System.out.println("Data atual formatada: " + actualDateOf.format(formatter));

        System.out.println("\nData atual parse: " + actualDateParse);
        System.out.println("Data atual parse formatada: " + actualDateParse.format(formatter));
    }
}
