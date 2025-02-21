package org.examplejava.InterfaceClassConstruction;

public class TV implements RemoteControl{

    @Override
    public void on() {
        System.out.println("Televisor encendido");
    }

    class battery {
        private int V;

        public battery(int v) {
            this.V = v;
        }

        public void battery() {
            System.out.println("La batería son: " + V + "v");
        }

    }

}
