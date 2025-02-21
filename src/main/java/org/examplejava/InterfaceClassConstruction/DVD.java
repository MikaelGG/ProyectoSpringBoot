package org.examplejava.InterfaceClassConstruction;

public class DVD implements RemoteControl{

    @Override
    public void on() {
        System.out.println("DVD encendido");
    }

    static class CDDVD{

        public void insertCD(String cd) {
            System.out.println("CD insertado con exito: " + cd);
        }

    }

}
