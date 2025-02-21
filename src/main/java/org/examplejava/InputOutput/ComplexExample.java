package org.examplejava.InputOutput;

import java.io.*;

public class ComplexExample {

    public void complexFiles() throws IOException {

        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("complex.ser"))) {
            ComplexObject usuario = new ComplexObject("Mikael", "noverokill", "secretamasquelaotra");
            out.writeObject(usuario);
            System.out.println("Objeto serializado: " + usuario);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream("complex.ser"))) {
            ComplexObject userDescerialize = (ComplexObject) in.readObject();
            System.out.println("Objeto descerializado: " + userDescerialize.getNombre() + userDescerialize.getPassword() + userDescerialize.getCreditCard());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        ComplexExample complex = new ComplexExample();

        try {
            complex.complexFiles();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
