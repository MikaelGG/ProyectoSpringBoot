package org.examplejava.InputOutput;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
