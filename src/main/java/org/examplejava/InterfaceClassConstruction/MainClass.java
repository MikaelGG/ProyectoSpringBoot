package org.examplejava.InterfaceClassConstruction;

import java.util.SortedMap;

public class MainClass implements Defect1, Defect2 {

    private String nombre;
    private int estatura;
    private int peso;

    public MainClass() {}

    public MainClass(String nombre, int estatura, int peso) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
    }

    public MainClass(int estatura, int peso) {
        this("Anonimo", estatura, peso);
    }

    public MainClass(String nombre, int estatura) {
        this(nombre, estatura, 00);
    }

    public void showInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura);
        System.out.println("Peso: " + peso);
    }

    @Override
    public void method() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Metodo anónimo corriendo");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {

        MainClass main = new MainClass();

        main.codear();
        main.codear2();
        main.method();

        MainClass m1 = new MainClass("Mikael", 173, 70);
        MainClass m2 = new MainClass(205, 89);
        MainClass m3 = new MainClass("Fonky", 167);

        m1.showInfo();
        System.out.println();

        m2.showInfo();
        System.out.println();

        m3.showInfo();
        System.out.println();


    }


}
