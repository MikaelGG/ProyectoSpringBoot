package org.examplejava.Personalize;

import java.util.ArrayList;
import java.util.List;

public class MainExample {

    public static void main(String[] args) {

        List<String> nombre = new ArrayList<>();

        nombre.add("Maria");
        nombre.add("Juanita");
        nombre.add("Mikael");

        nombre.forEach(System.out::println);

    }

}
