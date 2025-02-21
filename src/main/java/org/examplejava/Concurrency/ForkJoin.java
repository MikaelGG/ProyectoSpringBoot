package org.examplejava.Concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.RecursiveTask;

public class ForkJoin {

    public final class InmutableObject extends RecursiveTask<Long>{
        private final long[] arr;
        private final int start;
        private final int end;

        public InmutableObject(long[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            if (end - start <= arr.length) {
                long sum = 0;
                for (int i = start ; i <= end ; i++) {
                    sum += arr[i];
                }
                return sum;
            } else {

                int mid = (start + end) / 2;

                InmutableObject left = new InmutableObject(arr, start, mid);
                InmutableObject right = new InmutableObject(arr, mid, end);

                left.fork();

                return right.compute() + left.join();

            }


        }

    }

    public void completableFuture() {
        CompletableFuture<?> cf = CompletableFuture.supplyAsync(() -> "Iniciando procesamiento... \n").thenApply(i -> i +
                "Se " +
                "empieza a ejecutar en este momento").thenAccept(System.out::println);
    }

    public static void main(String[] args) {
        ForkJoin c = new ForkJoin();
        c.completableFuture();

        long[] arr = new long[2000];
        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = i + 1;
        }

        InmutableObject io = c.new InmutableObject(arr, 1, 1999);
        long resultado = io.compute();
        System.out.println("Suma del arreglo: " + resultado);

    }

}
