package org.examplejava.JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapCollection {

    public static void main(String[] args) {
        System.out.println("Promedio con filter y collect:");
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 10);
        double averaging = list.stream().filter(n -> n % 2 == 0).collect(Collectors.averagingInt(e -> e));
        System.out.println(averaging);

        // Map
        System.out.println("\nLista de objetos filtrados por nombre que contenga 'e' y mayor a 25 años: ");
        List<Persona> listobj = new ArrayList<>();
        Persona p1 = new Persona("Mikael", 21);
        Persona p2 = new Persona("Juliana", 32);
        Persona p3 = new Persona("Catherin", 27);
        Persona p4 = new Persona("Alberto", 33);
        listobj.add(p1);
        listobj.add(p2);
        listobj.add(p3);
        listobj.add(p4);

        listobj.stream().filter(persona -> persona.getNombre().contains("e") && persona.getEdad() > 25).map(persona -> persona.getNombre() + " - " + persona.getEdad()).collect(Collectors.toList()).forEach(System.out::println);

        //FlatMap
        System.out.println("\nLista de lista para objetos con FlatMap:");
        List<List<Persona>> ldl = Arrays.asList(
                Arrays.asList(new Persona("Maria", 34)),
                Arrays.asList(new Persona("Juanita", 21)),
                Arrays.asList(new Persona("Anonimo", 88)),
                Arrays.asList(new Persona("Camila", 30))
        );

        ldl.stream().flatMap(personas -> personas.stream().map(p -> p.getNombre() + " - " + p.getEdad())).collect(Collectors.toList()).forEach(System.out::println);

    }

}
