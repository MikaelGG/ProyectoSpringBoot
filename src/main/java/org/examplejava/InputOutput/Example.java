package org.examplejava.InputOutput;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class Example {

    public void ejemploArchivos() throws IOException {

        Path path = Paths.get("Ejemplo.csv");

        Files.lines(path).forEach(System.out::println);

        Path path2 = Paths.get("Ejemplo3.csv");

        try {
            List<String> lines = Files.readAllLines(Paths.get("Ejemplo.csv"));
            StringBuilder contenido = new StringBuilder();
            for (String line : lines) {
                contenido.append(line).append("\n");
            }
            Files.write(path2, contenido.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Example example = new Example();

        try {
            example.ejemploArchivos();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
