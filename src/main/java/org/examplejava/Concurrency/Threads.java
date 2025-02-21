package org.examplejava.Concurrency;

import java.util.Scanner;
import java.util.concurrent.*;


public class Threads implements Runnable{

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de carros a procesar: ");
        int n = scanner.nextInt();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= n; i++) {
            int index = i;
            Future<?> future = executor.submit(() -> {
                System.out.println("Carro #" + index + " procesado por -> " + Thread.currentThread().getName());
            });
            try {
                future.get(); // Espera a que termine el procesamiento de cada carro antes de avanzar
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }

    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.run();
    }

}
