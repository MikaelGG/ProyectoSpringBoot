package org.examplejava.OperatorFlowControls;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los número a calcular");

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        System.out.println("Elija operador aritmético ( -  +  /  * )");

        char arit = scanner.next().charAt(0);

        switch (arit) {
            case '-':
                System.out.println("Resta: " + (numb1 - numb2));
                break;
            case '+':
                System.out.println("Suma: " + (numb1 + numb2));
                break;
            case '*':
                System.out.println("Multiplicación: " + (numb1 * numb2));
                break;
            case '/':
                System.out.println("División: " + (numb1 / numb2));
                break;
            default:
                System.out.println("No está disponible ese operador");
        }


    }


}
