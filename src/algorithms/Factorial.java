package algorithms;

public class Factorial {
    // Versión Iterativa O(n)
    public static long iterativo(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Versión Recursiva O(n)
    public static long recursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursivo(n - 1);
    }
}