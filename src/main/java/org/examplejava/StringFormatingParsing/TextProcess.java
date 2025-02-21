package org.examplejava.StringFormatingParsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcess {

    private void str() {

        String ejstr = "";
        long time1 = System.currentTimeMillis();
        for (int i = 0 ; i < 20 ; i++) {
            ejstr += "Txt1" + "txt2" + "txt3";
            System.out.println(ejstr);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Tiempo de respuesta: ");
        System.out.println(time2 - time1);

    }

    private void strBuilder() {

        StringBuilder ejstrb = new StringBuilder();
        long time1 = System.currentTimeMillis();
        for (int i = 0 ; i < 20 ; i++) {
            ejstrb.append("Txt1")
                    .append("txt2")
                    .append("txt3");
            System.out.println(ejstrb);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Tiempo de respuesta: ");
        System.out.println(time2 - time1);

    }

    private void strBuffer() {

        StringBuffer ejstrbf = new StringBuffer();
        long time1 = System.currentTimeMillis();
        for (int i = 0 ; i < 20 ; i++) {
            ejstrbf.append("Txt1")
                    .append("txt2")
                    .append("txt3");
            System.out.println(ejstrbf);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Tiempo de respuesta: ");
        System.out.println(time2 - time1);

    }

    public void regularExpresions() {
        // Separador de palabras por espacio
        String txt = "Mikael Pedro Hernando";
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(txt);
        for (String s : strings) {
            System.out.println(s);
        }

        // Buscador de números
        String txt2 = "asd123213gawe2asd0";
        Pattern pattern2 = Pattern.compile("\\d+");
        Matcher matcher = pattern2.matcher(txt2);
        while (matcher.find()){
            System.out.println("Números: " + matcher.group());
        }

        // Encontrar email
        Pattern pattern3 = Pattern.compile("([a-zA-Z0-9._%-]+)@([a-zA-Z0-9.-]+).([a-zA-Z]{2,6})");
        Matcher matcher2 = pattern3.matcher("*****$$$%%$$#mikael@gmail.com¡¡¡¡¿¿¿¿&&%$$");
        while (matcher2.find()) {
            System.out.println("Correo: " + matcher2.group());
        }
    }

    // Uselo 1 ó más veces para comparar tiempos
    public static void main(String[] args) {

        TextProcess tp = new TextProcess();
        tp.str();
        tp.strBuilder();
        tp.strBuffer();
        tp.regularExpresions();
    }


}
