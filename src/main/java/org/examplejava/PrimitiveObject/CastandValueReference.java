package org.examplejava.PrimitiveObject;

import java.util.List;

public class CastandValueReference {

    // Bloques de iniciación.
    static {
        System.out.println("Bloque de inicialización estático");
    }

    {
        System.out.println("Bloque de inicialización de instancia");
    }

    // Casting entre tipos
    //implicito
    int n = 123123;
    double nd = n;

    {
        System.out.println(nd);
    }

    // Explicito
    double d = 123.23132;
    int dn = (int) d;

    {
        System.out.println(dn);
    }

    public void cambiartxt(String txt) {
        txt = "Cambiar texto";
    }

    public void cambiarNum(int[] num) {
        num[0] = 1231254;
        num[1] = 21312312;
        num[2] = 72656522;
        num[3] = 99999999;
    }

    public static void main(String[] args) {

        CastandValueReference c = new CastandValueReference();

        //Parametros por valor
        String txt = "hola";
        c.cambiartxt(txt);
        System.out.println(txt);
        System.out.println("No cambia debido a que es la copia en la instancia y no la original.");

        //Parametros por referencia
        int[] num = {123123123, 123123123, 12312354, 322313211};
        c.cambiarNum(num);
        for (Integer l : num){
            System.out.println(l);
        }



    }




}
