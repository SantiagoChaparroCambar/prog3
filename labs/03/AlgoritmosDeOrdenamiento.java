/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Arrays;

public class AlgoritmosDeOrdenamiento {
    public static double[] generarArregloAleatorio(int tamaño) {
        double[] arr = new double[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arr[i] = Math.random() * 1000; // Números aleatorios entre 0 y 1000
        }
        return arr;
    }

    public static long ordenarPorBurbuja(double[] arr) {
        double[] copia = Arrays.copyOf(arr, arr.length);
        long inicio = System.nanoTime();

        for (int i = 0; i < copia.length - 1; i++) {
            for (int j = 0; j < copia.length - i - 1; j++) {
                if (copia[j] > copia[j + 1]) {
                    double temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }

        long fin = System.nanoTime();
        return fin - inicio;
    }

    public static long ordenarPorInsercion(double[] arr) {
        double[] copia = Arrays.copyOf(arr, arr.length);
        long inicio = System.nanoTime();

        for (int i = 1; i < copia.length; i++) {
            double clave = copia[i];
            int j = i - 1;

            while (j >= 0 && copia[j] > clave) {
                copia[j + 1] = copia[j];
                j = j - 1;
            }
            copia[j + 1] = clave;
        }

        long fin = System.nanoTime();
        return fin - inicio;
    }

    public static long ordenarPorSeleccion(double[] arr) {
        double[] copia = Arrays.copyOf(arr, arr.length);
        long inicio = System.nanoTime();

        for (int i = 0; i < copia.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < copia.length; j++) {
                if (copia[j] < copia[minIdx]) {
                    minIdx = j;
                }
            }
            double temp = copia[minIdx];
            copia[minIdx] = copia[i];
            copia[i] = temp;
        }

        long fin = System.nanoTime();
        return fin - inicio;
    }

    public static long ordenarPorMergeSort(double[] arr) {
        double[] copia = Arrays.copyOf(arr, arr.length);
        long inicio = System.nanoTime();
        mergeSort(copia, 0, copia.length - 1);
        long fin = System.nanoTime();
        return fin - inicio;
    }

    private static void mergeSort(double[] arr, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            mergeSort(arr, izquierda, medio);
            mergeSort(arr, medio + 1, derecha);
            merge(arr, izquierda, medio, derecha);
        }
    }

    private static void merge(double[] arr, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        double[] izq = new double[n1];
        double[] der = new double[n2];

        for (int i = 0; i < n1; i++)
            izq[i] = arr[izquierda + i];
        for (int i = 0; i < n2; i++)
            der[i] = arr[medio + 1 + i];

        int i = 0, j = 0, k = izquierda;
        while (i < n1 && j < n2) {
            if (izq[i] <= der[j]) {
                arr[k] = izq[i];
                i++;
            } else {
                arr[k] = der[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = izq[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = der[j];
            j++;
            k++;
        }
    }
}


