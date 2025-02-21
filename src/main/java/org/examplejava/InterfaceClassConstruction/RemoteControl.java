package org.examplejava.InterfaceClassConstruction;

public interface RemoteControl {

    void on();

    default void changeChanel(int c) {
        System.out.println("Cambio de canal al: " + c);
    }

}
