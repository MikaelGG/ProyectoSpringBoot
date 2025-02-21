package org.examplejava.Personalize;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number");
        int number2 = scanner.nextInt();

        System.out.println("Result is: " + (number1 + number2));

    }


}
