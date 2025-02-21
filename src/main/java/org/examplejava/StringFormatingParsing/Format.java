package org.examplejava.StringFormatingParsing;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Format {

    public void formatTypes() {

        int n = 199093938;
        System.out.println(String.format("Number: %,d", n));

        System.out.printf("¡Esto es un formato de %s con diferentes %s! y diferentes numeros como %s", "Strings", "Parametros",
                88888888);

        System.out.printf("\nFormateando número 58 a hexadecimal: %x", 58);
        System.out.printf("\nFormateando número 808 a hexadecimal: %x", 808);

        System.out.println("\n" + new DecimalFormat("###,###,###.##").format(989657324.21312));

        Date d = new Date();
        System.out.printf("Fecha: " + "%1$td %1$tB %1$tY de %1$tH:%1$tM:%1$tS", d);

    }

    public void formatRegex() {

        Scanner s = new Scanner(System.in);
        System.out.println("\n \n" + "Ingrese un correo electronico");
        String correo = s.nextLine();

        if (correo.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("Correo electrónico válido");
        } else {
            System.out.println("Correo electrónico inválido");
        }

        System.out.println("\n" + "Ingrese una fecha (DD/MM/YYYY): ");
        String fe = s.nextLine();

        if (fe.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
            try {
                SimpleDateFormat forent = new SimpleDateFormat("dd/MM/yyyy");
                Date d = forent.parse(fe);

                SimpleDateFormat fs = new SimpleDateFormat("EEEE, dd MMMM yyyy");
                String ff = fs.format(d);
                System.out.println("Fecha válida: " + ff);
            } catch (Exception e) {
                System.out.println("Error al convertir la fecha");
            }
        } else {
            System.out.println("Formato de fecha inválido");
        }

    }

    public void formatCurrency() {

        double m = 989765432.21323;
        NumberFormat fm = NumberFormat.getCurrencyInstance(Locale.US);
        String Currency = fm.format(m);
        System.out.println("\n" + "Moneda en US: " + Currency);

        double m2 = 182738009.7529;
        NumberFormat fm2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        String Currency2 = fm2.format(m2);
        System.out.println("\n" + "Moneda en ITALY: " + Currency2);

    }

    public static void main(String[] args) {

        Format f = new Format();

        f.formatTypes();
        f.formatRegex();
        f.formatCurrency();

    }


}
