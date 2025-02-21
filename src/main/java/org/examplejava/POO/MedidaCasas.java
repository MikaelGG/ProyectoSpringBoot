package org.examplejava.POO;

public class MedidaCasas implements Casa, Lote, CasaLote {

    @Override
    public void alto() {
        System.out.println("El alto es 24");
    }

    @Override
    public void ancho() {
        System.out.println("El ancho es 78");
    }


    public static void main(String[] args) {
        Casa casa = new MedidaCasas();
        Lote lote = new MedidaCasas();
        CasaLote CL = new MedidaCasas();


        casa.alto();
        lote.ancho();
        CL.alto();

    }
}
