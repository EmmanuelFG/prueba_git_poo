package org.example;

public class Busqueda {
    public static int buscar(int[] lista, int valor) {
        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            int medio = bajo + (alto - bajo) / 2;
            if (lista[medio] == valor) return medio;
            if (lista[medio] < valor) bajo = medio + 1;
            else alto = medio - 1;
        }
        return -1;
    }

    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public void sort2(int[] arr) {
        if (inicio < fin) {
            // Encontrar el punto medio
            int medio = inicio + (fin - inicio) / 2;

            // Ordenar la primera y segunda mitad
            mergeSort(arr, inicio, medio);
            mergeSort(arr, medio + 1, fin);

            // Fusionar las mitades ordenadas
            merge(arr, inicio, medio, fin);
        }
    }
}
