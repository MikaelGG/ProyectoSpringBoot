package org.examplejava;

public interface Example1 {

    public default void example() {
        System.out.println("e");
    }

    public static void example2() {
        System.out.println("o");
    }

    String txt = "Hi";

}
