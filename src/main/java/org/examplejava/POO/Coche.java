package org.examplejava.POO;

public class Coche extends Vehiculo{

    public Coche(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Run Run");
    }

    public void hacerSonido(int veces) {
        for (int i = 0; i < veces; i++ ) {
            System.out.println("Run");
        }
    }

}
