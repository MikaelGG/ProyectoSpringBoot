package org.examplejava.InterfaceClassConstruction;

public interface Defect2 {

    public void method();

    default void codear2() {
        System.out.println("Preparandose para codear 2");
    }

}
