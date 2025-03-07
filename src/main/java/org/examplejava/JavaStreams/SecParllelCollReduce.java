package org.examplejava.JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SecParllelCollReduce {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(85);
        list.add(98);
        list.add(24);
        list.add(324);
        list.add(24123);
        list.add(224);
        list.add(324);
        list.add(524);
        list.add(124);
        list.add(204);
        list.add(14);
        list.add(40);
        list.add(55);
        list.add(54);
        list.add(98);

        int min =  list.stream().reduce(Integer.MAX_VALUE, Integer::min);
        int max =  list.stream().reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println("Minimo: " + min + "   Maximo: " + max);

        long ti = System.currentTimeMillis();
        double prom = list.stream().collect(Collectors.averagingInt(n -> n));
        long tf = System.currentTimeMillis();
        System.out.println("\nTiempo: " + (tf - ti));
        System.out.println("Promedio por collect: " + prom);

        long ti2 = System.currentTimeMillis();
        double prom2 = list.parallelStream().collect(Collectors.averagingInt(n -> n));
        long tf2 = System.currentTimeMillis();
        System.out.println("\nTiempo: " + (tf2 - ti2));
        System.out.println("Promedio por collect en paralelo: " + prom2);

        // Sistema secuencial y paralelo con reduce() y collect()
        list.add(45);
        list.add(85);
        list.add(98);
        list.add(24);
        list.add(324);
        list.add(24123);
        list.add(224);
        list.add(324);
        list.add(524);
        list.add(124);
        list.add(204);
        list.add(14);
        list.add(40);
        list.add(55);
        list.add(54);
        list.add(98);
        list.add(32);
        list.add(43);
        list.add(65);
        list.add(75);
        list.add(67);
        list.add(87);
        list.add(99);
        list.add(90);
        list.add(87);
        list.add(91);
        list.add(21);
        list.add(12);
        list.add(23);
        list.add(43);
        list.add(10);
        list.add(8);
        list.add(8);

        System.out.println("\nSecuencial con reduce");
        long ti3 = System.currentTimeMillis();
        long sec = list.stream().reduce(0,(ac, n) -> ac + n);
        long tf3 = System.currentTimeMillis();
        System.out.println("Tiempo: " + (tf3 - ti3) + "ms");
        System.out.println("Total: " + sec);

        System.out.println("\nParalelo con reduce");
        long ti4 = System.currentTimeMillis();
        long sec2 = list.parallelStream().reduce(0,(ac, n) -> ac + n);
        long tf4 = System.currentTimeMillis();
        System.out.println("Tiempo: " + (tf4 - ti4) + "ms");
        System.out.println("Total: " + sec2);

        System.out.println("\nSecuencial con collect");
        long ti5 = System.currentTimeMillis();
        long sec3 = list.stream().collect(Collectors.summingLong(n -> n));
        long tf5 = System.currentTimeMillis();
        System.out.println("Tiempo: " + (tf5 - ti5) + "ms");
        System.out.println("Total: " + sec3);

        System.out.println("\nParalelo con collect");
        long ti6 = System.currentTimeMillis();
        long sec4 = list.parallelStream().collect(Collectors.summingLong(n -> n));
        long tf6 = System.currentTimeMillis();
        System.out.println("Tiempo: " + (tf6 - ti6) + "ms");
        System.out.println("Total: " + sec4);

    }

}
