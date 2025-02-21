package org.examplejava.ExceptionHandling;

import org.examplejava.PrimitiveObject.Diferentiation;

public class CountDown {

    public static void main(String[] args) {

        try (DiferentExceptions d = new DiferentExceptions("Sesión #1")){
            d.countDown(8);

        } catch (PersonalizeException e) {
            System.out.println("Excepción: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción: " + e.getMessage());
        } finally {
            System.out.println("Finalizando con autocloseable");
        }
    }
}
