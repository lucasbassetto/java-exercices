package org.example.Date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //Use LocalDate.of quando você já tem os valores numéricos de ano, mês e dia separados (por exemplo, vindos de variáveis ou cálculos).
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2026, 2, 10);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        System.out.println("Data da compra: " + dataCompra);
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        // Formatar a data da compra para o formato "dd/MM/yyyy"
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataCompraFormatada = dataCompra.format(formato);
        System.out.println("Data da compra formatada: " + dataCompraFormatada + "\n");

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        ZonedDateTime dataConclusaoCompraNewYork = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Data e hora da conclusão da compra: " + dataConclusaoCompra);
        System.out.println("Data e hora da conclusão da compra em Nova York: " + dataConclusaoCompraNewYork);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

        System.out.println("Data e hora da conclusão da compra formatada: " + dataConclusaoCompra.format(formatter));
        System.out.println("Data e hora da conclusão da compra em Nova York formatada: " + dataConclusaoCompraNewYork.format(formatter) + "\n");

        LocalTime horaInicio = LocalTime.of(9, 0);
        LocalTime horaFim = LocalTime.of(17, 30);
        Duration duration = Duration.between(horaInicio, horaFim);
        String resultado = String.format("Duração entre %s e %s: %d horas e %d minutos\n", horaInicio, horaFim, duration.toHours(), duration.toMinutesPart());
        System.out.println(resultado);


        // Use LocalDate.parse quando você recebe a data como uma String (por exemplo, entrada do usuário, arquivo, banco de dados)
        // e precisa convertê-la para um objeto LocalDate. Lembre-se de usar um DateTimeFormatter se a string não estiver no formato padrão (yyyy-MM-dd).
        LocalDate dataCompraCarro = LocalDate.parse("2026-02-11");
        LocalDate dataVencimentoCarro = LocalDate.parse("2026-02-12");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de vencimento: " + dataVencimentoCarro);
        System.out.println("Data de vencimento formatada: " + dataVencimentoCarro.format(formatter1));

        Period period = Period.between(dataCompraCarro, dataVencimentoCarro);
        System.out.println("Diferença em dias: " + period.getDays());


        String dataRecebidaDoFront = "25/02/2026";

        // Define o formato esperado
        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converte a String para LocalDate
        LocalDate dataConvertida = LocalDate.parse(dataRecebidaDoFront, formatters);

        System.out.println("\nData convertida: " + dataConvertida);
        System.out.println("Data formatada: " + dataConvertida.format(formatters));
    }
}
