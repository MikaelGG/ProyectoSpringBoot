package org.examplejava.ExceptionHandling;

public class DiferentExceptions implements AutoCloseable{

    private String session;

    public DiferentExceptions(String session) {
        this.session = session;
        System.out.println("Nombre de la sesión creada: " + session);
    }

    public void countDown(Integer n) throws IllegalArgumentException, PersonalizeException {
        if (n > 10){
            throw new PersonalizeException("El número para la cuenta regresiva es muy grande");
        }

        if (n == null || n <= 0) {
            throw new IllegalArgumentException("El número no puede ser 0 o null");
        }

        while (n >= 0) {
            System.out.println("Count down: " + n);
            n--;
        }

    }

    @Override
    public void close() {
        System.out.println();
    }
}
