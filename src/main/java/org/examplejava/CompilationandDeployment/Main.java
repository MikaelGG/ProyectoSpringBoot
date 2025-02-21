package org.examplejava.CompilationandDeployment;

public class Main {

    public static void main(String[] args) {

        PiezaMethods pieza = new PiezaMethods();

        try {

            pieza.setAncho(80);
            pieza.setAlto(80);
            var ancho = pieza.getAncho();
            var alto = pieza.getAlto();
            pieza.getObject(alto, ancho);
            System.out.println("Url imagen: " + "https://ethic.es/wp-content/uploads/2023/03/imagen.jpg");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
