package org.example.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExLembretePagamento {

    public static void main(String[] args) {

        LocalDate dataPagamento = LocalDate.of(2026,2,26);

        LocalDate lembretePagamento = dataPagamento.minusDays(5);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data do pagamento: " + dataPagamento.format(formatter));
        System.out.println("Lembrete de pagamento: " + lembretePagamento.format(formatter));
    }
}
