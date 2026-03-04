package org.example.Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ExHoraSistemaAustralia {

    public static void main(String[] args) {


        ZonedDateTime horarioSistema = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioSistema.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Horário do sistema: " + horarioSistema.format(formatter));
        System.out.println("Horário em Sydney: " + horarioSydney.format(formatter));
    }
}
