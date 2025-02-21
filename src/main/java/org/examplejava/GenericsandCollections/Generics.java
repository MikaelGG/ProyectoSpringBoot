package org.examplejava.GenericsandCollections;

import java.util.ArrayList;
import java.util.List;

public class Generics{

    public <T> void TypeGeneric(T... Generic) {
        for (T gen : Generic) {
            System.out.println("Datos guardados son: " + gen);
        }
    }

    public void ProccessList(List<? extends Number> numeros) {
        numeros.forEach(System.out::println);
    }

    public static  <T> List<T> TypeInference() {
        return new ArrayList<>();
    }


    public static void main(String[] args) {
        try {
            Generics gen = new Generics();

            gen.TypeGeneric("Hola", 1234, "Numeros", 42432423, "Letras");

            List<Integer> listaNumeros = new ArrayList<>();
            listaNumeros.add(21312);
            listaNumeros.add(12312312);
            listaNumeros.add(100000);
            gen.ProccessList(listaNumeros);

            List<Integer> numbers = TypeInference();
            numbers.add(000000);
            numbers.add(123457890);
            numbers.add(12344333);

            System.out.println(numbers);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
