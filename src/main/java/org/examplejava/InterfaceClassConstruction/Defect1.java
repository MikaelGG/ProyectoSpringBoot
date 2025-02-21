package org.examplejava.InterfaceClassConstruction;

public interface Defect1 {

    public void method();

    default void codear() {
        System.out.println("Preparandose para codear");
    }

}
