package org.examplejava.PrimitiveObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Diferentiation {

    //Object
    Integer integer = 123123;
    Boolean bool = true;

    //Primitives
    int privint = 12312312;
    boolean boo = false;

    //Autoboxing
    int ip2 = 123312312;
    Integer o = ip2;

    boolean bp = true;
    Boolean bo = bp;

    public void autoboxing(List<Integer> list) {
        int sum = 0;
        for (Integer l : list) {
            if (l % 2 == 0) {
                sum += l;
                System.out.println("Numero: " + sum);
            }
        }
    }



    //Unboxing
    Integer i = 45323423;
    int ip = i;

    Double d = 3.192;
    double dp = d;

    public void unboxing(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(213);
        list.add(123);
        list.add(322);
        int suma = list.get(0) + list.get(1) + list.get(2);
        System.out.println("La suma es: " + suma);
    }


    //Referencias a metodos

    public String getMessage() {
        return "Holaaa, este es un mensaje";
    }


    public static void main(String[] args) {

        Diferentiation diferentiation = new Diferentiation();

        List<Integer> autobox = new ArrayList<>();
        autobox.add(123123);
        autobox.add(2);
        autobox.add(4);

        diferentiation.autoboxing(autobox);

        diferentiation.unboxing();

        Supplier<String> supplier = diferentiation::getMessage;
        System.out.println(supplier.get());

        List<String> nombres = Arrays.asList("Mikael", "Ana", "Sofia");
        nombres.forEach(System.out::println);

    }

}
