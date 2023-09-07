/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import static com.mycompany.main.AlgoritmosDeOrdenamiento.generarArregloAleatorio;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tamaños = {100, 500, 1000, 5000, 10000};

        System.out.println("Tamaño del arreglo         \tBurbuja   \tInserción\tSelección\tMergeSort");

        for (int tamaño : tamaños) {
            double[] arr = generarArregloAleatorio(tamaño);

            long tiempoBurbuja = AlgoritmosDeOrdenamiento.ordenarPorBurbuja(Arrays.copyOf(arr, arr.length));
            long tiempoInsercion = AlgoritmosDeOrdenamiento.ordenarPorInsercion(Arrays.copyOf(arr, arr.length));
            long tiempoSeleccion = AlgoritmosDeOrdenamiento.ordenarPorSeleccion(Arrays.copyOf(arr, arr.length));
            long tiempoMergeSort = AlgoritmosDeOrdenamiento.ordenarPorMergeSort(Arrays.copyOf(arr, arr.length));

            System.out.printf("%d\t\t\t\t%d\t\t%d\t\t%d\t\t%d%n", tamaño, tiempoBurbuja, tiempoInsercion, tiempoSeleccion, tiempoMergeSort);
        }

        System.out.println("Tiempos en nanosegundos");
    }
}

