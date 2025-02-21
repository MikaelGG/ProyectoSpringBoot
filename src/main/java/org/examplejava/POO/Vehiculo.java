package org.examplejava.POO;

abstract class Vehiculo {

    private String nombre;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();

    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }
}
