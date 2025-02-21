package org.examplejava.JavaFundamentalClasses;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

public class OptionalSpliteratorClassLoader {

    public void optional() {

        List<Persona> p = new ArrayList<Persona>();

        p.add(new Persona("Mikael", 21));
        p.add(new Persona("Saori", 34));
        p.add(new Persona("Mikasa", 20));


        Optional<Persona> op = buscarNombre(p);
        if (op.isPresent()) {
            Persona po = op.get();
            System.out.println("\nOptional con nombre: ");
            System.out.println("Nombre: " + po.getNombre() + "   Sufijo: " + "sa");
        }


    }

    public static Optional<Persona> buscarNombre(List<Persona> nombre) {

        for (Persona n : nombre) {
            if (n.getNombre().contains("sa")) {
                return Optional.of(n);
            }
        }
        return Optional.empty();
    }


    public void spliterator() {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(123123);
        al.add(34213);
        al.add(5342);
        al.add(6546);
        al.add(657547);
        al.add(9868324);

        Spliterator<Integer> s = al.spliterator();
        Spliterator<Integer> si = s.trySplit();

        System.out.println("Spliterator con 2 hilos: ");

        s.forEachRemaining(n -> System.out.println("Thread 1: " + n));
        si.forEachRemaining(n -> System.out.println("Thread 2: " + n));

    }

    public void classLoader() {
        try {
            ClassLoader loader = getClass().getClassLoader();
            Class<?> clase = loader.loadClass("org.examplejava.Concurrency.ForkJoin");

            System.out.println("Nombre de la clase: " + clase.getName());

            Object instancia = clase.getDeclaredConstructor().newInstance();
            Method metodo = clase.getMethod("completableFuture");
            metodo.invoke(instancia);
            System.out.println();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        OptionalSpliteratorClassLoader j = new OptionalSpliteratorClassLoader();

        j.classLoader();

        j.spliterator();

        j.optional();

    }


}
