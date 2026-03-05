package algorithms;

public class BusquedaLineal {
    
    // Versión Iterativa O(n)
    public static int iterativo(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }

    // Versión Recursiva O(n)
    public static int recursivo(int[] arreglo, int objetivo, int indice) {
        if (indice >= arreglo.length) {
            return -1;
        }
        if (arreglo[indice] == objetivo) {
            return indice;
        }
        return recursivo(arreglo, objetivo, indice + 1);
    }
}