package org.examplejava.InputOutput;

import java.io.Serializable;

public class ComplexObject implements Serializable {

    private static final Long serialVersionUID = 1L;

    private String nombre;
    private transient String password;
    private transient String creditCard;

    public ComplexObject(String nombre, String password, String creditCard) {
        this.nombre = nombre;
        this.password = password;
        this.creditCard = creditCard;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }
}
