package org.examplejava.Internationalization;

import java.text.NumberFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Multilingüe {

    public static void main(String[] args) {

        // Multilingüe usando ResourceBundle

        ResourceBundle resourceBundle = ResourceBundle.getBundle("Label_es", new Locale("es"));
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("Label", Locale.US);
        ResourceBundle resourceBundle3 = ResourceBundle.getBundle("Label", new Locale("pt", "BR"));

        System.out.println("Idioma en Español: \n" + resourceBundle.getString("Saludo") + "\n" + resourceBundle.getString("Despedirse") + "\n" + resourceBundle.getString("Desplazarse") + "\n");

        System.out.println("Idioma en Ingles: \n" + resourceBundle2.getString("Saludo") + "\n" + resourceBundle2.getString("Despedirse") + "\n" + resourceBundle2.getString("Desplazarse") + "\n");

        System.out.println("Idioma en Portugués: \n" + resourceBundle3.getString("Saludo") + "\n" + resourceBundle3.getString("Despedirse") + "\n" + resourceBundle3.getString("Desplazarse"));

        // Formateo de fechas y números según Locale

        System.out.println("\nDates:");

        System.out.println("Date (iso) " + DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ZonedDateTime.now()));
        System.out.println("Date (en) " + DateTimeFormatter.ofPattern("EEEE d, LLLL YYYY", Locale.ENGLISH).format(ZonedDateTime.now()));
        System.out.println("Date (es) " + DateTimeFormatter.ofPattern("EEEE d, LLLL YYYY", new Locale("es")).format(ZonedDateTime.now()));

        System.out.println("\nMoney: ");

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        System.out.println("Importando a moneda Japonesa " + numberFormat.format(9080308));
        System.out.println("Importando a moneda Española " + numberFormat2.format(8000909099.00002));
        System.out.println("Importando a moneda Colombiana " + numberFormat3.format(9090002));


    }


}
