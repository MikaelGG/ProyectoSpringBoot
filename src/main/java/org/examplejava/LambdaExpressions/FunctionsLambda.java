package org.examplejava.LambdaExpressions;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionsLambda {

    public static void main(String[] args) {

        //Comparación anonimas y lambdas

        System.out.println("Lambda: ");
        Operacion suma = (a, b) -> a + b;
        System.out.println("Suma: " + suma.calcular(24, 24));

        Operacion resta = (int a, int b) -> a - b;
        System.out.println("Resta: " + resta.calcular(112, 67));

        Operacion operacionS = new Operacion() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        Operacion operacionR = new Operacion() {
            @Override
            public int calcular(int a, int b) {
                return a - b;
            }
        };

        System.out.println("\nClases anónimas: ");
        System.out.println("Suma: " + operacionS.calcular(35, 50));
        System.out.println("Resta: " + operacionR.calcular(240, 123));

        // Composición de funciones

        Predicate<Integer> mod = x -> x%2 == 0;
        Predicate<Integer> mayor = x -> x > 0;
        Predicate<Integer> ParPos = mod.and(mayor);

        System.out.println("\nEs divisible por 2 y positivo:\n" + ParPos.test(12));

        Function<Integer, Integer> cuadrado = x -> x * x;
        Function<Integer, String> conver = x -> "Resultado: " + x;
        Function<Integer, String> resconv = cuadrado.andThen(conver);

        System.out.println("\nConvertir entero a texto\n" + resconv.apply(123));

        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("\nSuma con dos argumentos: \n" + sum.apply(32, 40));

        BinaryOperator<Integer> op2 = BinaryOperator.maxBy((a, b) -> a > b ? 1 : (a == b) ? 0 : -1);
        System.out.println("\nMayor entre dos argumentos: \n" + op2.apply(1231, 3233));

        BinaryOperator<Integer> op3 = BinaryOperator.minBy((a, b) -> a > b ? 1 : (a == b) ? 0 : -1);
        System.out.println("\nMenor entre dos argumentos: \n" + op3.apply(42, 9));

    }
}
