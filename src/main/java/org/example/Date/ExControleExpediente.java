package org.example.Date;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExControleExpediente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horário de entrada (formato HH:mm): ");
        LocalTime entrada = LocalTime.parse(sc.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        int cargaHoraria = sc.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(sc.next(), formatter);

        //Calculo saida previsa
        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        // Cálculo da diferença entre saída real e prevista
        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        // Exibição dos resultados formatados
        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("\nSaldo de horas: 0h 0min");
        } else {
            String sinal;

            if(horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("\nSaldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }
    }
}
