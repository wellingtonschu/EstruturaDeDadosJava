package Ordenacao;

import java.util.*;
import java.io.*;

public class MergeSort {

    static void mergeSort(int[] array, int inicio, int fim) {

        int meio = 0;

        if (inicio < fim) {

            meio = (inicio + fim) / 2;

            mergeSort(array, inicio, meio);
            mergeSort(array, meio + 1, fim);

            merge(array, inicio, meio, fim);

        }

    }

    private static void merge(int[] array, int inicio, int meio, int fim) {

        System.out.println("Parte da esquerda: " + Arrays.toString(Arrays.copyOfRange(array, inicio, meio + 1)));
        System.out.println("Parte da direita: " + Arrays.toString(Arrays.copyOfRange(array, meio + 1, fim + 1)));

        int temp[] = new int[array.length];
        int l = inicio;
        int r = fim;
        int m = meio + 1;
        int k = l;

        while (l <= meio && m <= r) {

            if (array[l] <= array[m]) {

                temp[k++] = array[l++];

            } else {

                temp[k++] = array[m++];

            }

        }

        while (l <= meio) {

            temp[k++] = array[l++];

        }

        while (m <= r) {

            temp[k++] = array[m++];

        }

        for (int i1 = 1; i1 <= fim; i1++) {

            array[i1] = temp[i1];

        }

        System.out.println("Após junção: " + Arrays.copyOfRange(array, inicio, fim + 1));

    }

}
