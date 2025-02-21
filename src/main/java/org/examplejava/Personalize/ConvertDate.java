package org.examplejava.Personalize;

import java.util.Scanner;

public class ConvertDate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Writte a number for convert in double");
            int number = scanner.nextInt();

            double numberConvert = number;

            System.out.println("Number writted in double: " + numberConvert);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
