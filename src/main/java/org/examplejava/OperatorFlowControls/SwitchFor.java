package org.examplejava.OperatorFlowControls;

import java.util.Scanner;

public class SwitchFor {

    public static void main(String[] args) {

            String[] dias = {"Lunes", "Martes", "Viernes", "Sabados"};
        System.out.println("Días disponibles");
            for (String dia : dias) {
                System.out.println(dia);
            }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el día preferido");
            String diaElg = scanner.nextLine();

            switch (diaElg) {
                case "Lunes":
                    System.out.println("Primer día de la semana");
                    break;
                case "Martes":
                    System.out.println("Segundo día de la semana");
                    break;
                case "Viernes":
                    System.out.println("Quinto día de la semana");
                    break;
                case "Sabados":
                    System.out.println("Sexto día de la semana");
                    break;
                default:
                    System.out.println("Diferente día");
            }

    }


}
