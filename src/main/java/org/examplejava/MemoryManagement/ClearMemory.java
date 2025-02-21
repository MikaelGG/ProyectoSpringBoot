package org.examplejava.MemoryManagement;

public class ClearMemory {

    public static void main(String[] args) {

        Obj1 TV1 = new Obj1();
        Obj1 TV2 = new Obj1();

        TV1.pulgadas = 64;
        TV1.costo = 1500;
        TV2.pulgadas = 122;
        TV2.costo = 3500;

        System.gc();

    }

}
