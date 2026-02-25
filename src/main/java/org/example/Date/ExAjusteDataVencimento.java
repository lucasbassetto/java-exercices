package org.example.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExAjusteDataVencimento {

    public static void main(String[] args) {

        LocalDate dataVencimentoOriginal = LocalDate.of(2026,2,25);
        LocalDate dataVencimento = dataVencimentoOriginal.plusMonths(2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataVencimentoFormatada = dataVencimento.format(formatter);
        System.out.println("Data de vencimento ajustada: " + dataVencimentoFormatada);

    }
}
