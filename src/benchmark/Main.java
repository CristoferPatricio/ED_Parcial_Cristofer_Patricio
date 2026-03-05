package benchmark;
import algorithms.OrdenamientoBurbuja;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tamanos = {100, 500, 1000, 5000, 10000};
        System.out.println("============================================================");
        System.out.println("  ESTRUCTURA DE DATOS — BENCHMARK BURBUJA");
        System.out.println("============================================================");

        for (int n : tamanos) {
            int[] arrI = new int[n];
            for(int i=0; i<n; i++) arrI[i] = n - i; // Peor caso (descendente)

            long inicioI = System.nanoTime();
            OrdenamientoBurbuja.iterativo(arrI);
            long finI = System.nanoTime();
            System.out.printf("n=%-6d | Iterativo: %.6f ms\n", n, (finI - inicioI)/1_000_000.0);
        }
    }
}