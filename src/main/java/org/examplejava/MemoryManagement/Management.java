package org.examplejava.MemoryManagement;

public class Management {

    public static void metodh() {
        Obj1 TV1 = new Obj1();
        Obj1 TV2 = new Obj1();
        Obj1 TV3 = new Obj1();
        Obj1 TV4 = new Obj1();

        TV1.costo = 3000;
        TV1.pulgadas = 102;
        TV2.costo = 4000;
        TV2.pulgadas = 122;
        TV3.costo = 1500;
        TV3.pulgadas = 62;
        TV4.costo = 40000;
        TV4.pulgadas = 840;
    }

    public static void main(String[] arg) {

    Runtime runtime = Runtime.getRuntime();

    System.out.println("Memoria libre antes de objetos: " + runtime.freeMemory());

    metodh();

    System.out.println("Memoria libre despues de objetos: " + runtime.freeMemory());

    System.gc();

    System.out.println("Memoria libre despues de objetos: " + runtime.maxMemory());
    }
}
