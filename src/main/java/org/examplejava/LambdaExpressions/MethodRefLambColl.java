package org.examplejava.LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefLambColl {
    public static void main(String[] args) {

        // Función de la interfaz personalizada usando method reference con listas y lambda

        FuncPersonalizedInterface suma = (a, b) -> a + b;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 12, 10);

        int res = list.stream().reduce(0, suma::operacion);

        System.out.println("Resultado de la suma: \n" + res);

        System.out.println("\nOrdenamiento de longitud:");

        FunctPersonalizedInterface ordenar = (String a, String b) -> Integer.compare(a.length(), b.length()) ;

        List<String> list2 = Arrays.asList("Maria", "Juanita", "Ana", "Mikael", "Pedro", "Juan");

        System.out.println(list2.stream().sorted(ordenar::operacion2).collect(Collectors.toList()));

    }
}
