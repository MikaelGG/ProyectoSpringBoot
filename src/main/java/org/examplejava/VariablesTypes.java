package org.examplejava;

import javax.management.modelmbean.ModelMBean;
import java.sql.SQLOutput;

public class VariablesTypes {

    private static final String txt = "hola";
    private static final short number = 88;

    private int number2 = 1255;
    private String txt2 = "como estas";
    private float flt = 2.5F;

    int binary = 0b1000000;

    Long credit_card = 43534_3443_3434_34534L;

    public void ejemploMetodo() {
        int number3 = 12342134;
        System.out.println(number3);
    }


    public void parameters(int n, ModelMBean model, String[] arr) {
        System.out.println("n es: " +  n + "Model es: " + model + "Arreglo es: " + arr);
    }
}
