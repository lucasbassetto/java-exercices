package org.example.Date;

import java.time.Duration;
import java.time.LocalTime;

public class ExDiferencaEntreHoras {

    public static void main(String[] args) {

        LocalTime horaInicio = LocalTime.parse("10:30");
        LocalTime horaFim = LocalTime.parse("15:45");

        Duration duration = Duration.between(horaInicio, horaFim);
        System.out.println("Duração entre " + horaInicio + " e " + horaFim + ": " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos");


        LocalTime horaInicio1 = LocalTime.of(10, 30);
        LocalTime horaFim1 = LocalTime.of(15,45);

        Duration duration1 = Duration.between(horaInicio1, horaFim1);
        String resultado = String.format("Duração entre %s e %s: %d horas e %d minutos", horaInicio1, horaFim1, duration1.toHours(), duration1.toMinutesPart());
        System.out.println(resultado);
    }
}
