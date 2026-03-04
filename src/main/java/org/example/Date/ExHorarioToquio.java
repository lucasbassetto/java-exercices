package org.example.Date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ExHorarioToquio {

    public static void main(String[] args) {

        ZonedDateTime horarioToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("Horário atual em Tóquio: " + horarioToquio);
        System.out.println("Horário atual em Tóquio formatado: " + horarioToquio.format(formatter));
    }
}
