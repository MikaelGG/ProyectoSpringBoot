package org.examplejava.ExceptionHandling;

import java.io.*;

public class ExceptionHandling {

    public void catchHandling(String path) throws PersonalizeException {

        try (FileWriter fw = new FileWriter(path) ; PrintWriter pw = new PrintWriter(fw)) {

            for (int i = 0 ; i < 10 ; i++) {
                pw.println(i + 1);
                System.out.println(i + 1);
            }

            System.out.println("Archivo creado con los digitos del bucle");

        } catch (IOException e) {
            throw new PersonalizeException("Error procesando archivo", e);
        }

    }

    public static void main(String[] args) {
        ExceptionHandling eh = new ExceptionHandling();
        try {
            eh.catchHandling("texto.csv");
        } catch (PersonalizeException p) {
            System.out.println("Manejando excepcion: " + p.getMessage());
            System.out.println(p.getCause());
        }

    }

}
