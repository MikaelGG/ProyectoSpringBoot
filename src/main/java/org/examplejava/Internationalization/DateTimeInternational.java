package org.examplejava.Internationalization;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeInternational {

    public static void main(String[] args) {

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        System.out.println("\nEscriba la zona horaria del pais en donde va a reservar ej: Africa/Cairo");
        Scanner scanner = new Scanner(System.in);
        String zone = scanner.nextLine();

        ZoneId zoneId = ZoneId.of(zone);
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println("\nFecha y hora: ");
        System.out.println(time);

        long hours = time.getHour();
        long hours2 = ZonedDateTime.now().getHour();
        long th = hours - hours2;
        long minutes = time.getMinute();
        long minutes2 = ZonedDateTime.now().getMinute();
        long tm = minutes - minutes2;
        System.out.println(ZonedDateTime.now());

        System.out.println("\nDiferencia entre el pais escogido y el local en su sistema es: \n" + th + " horas "  + tm + " " + "minutos");

        System.out.println("\nEscoja la fecha para su reserva ej (2025/04/18 14:30)");
        String dateR = scanner.nextLine();

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime ldt = LocalDateTime.parse(dateR, inputFormatter);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd 'of' MMMM',' yyyy 'at' HH:mm");
        String ff = ldt.format(dtf);
        System.out.println("\nSu cita queda programada para la fecha \n" + ff);

        scanner.close();

    }

}
