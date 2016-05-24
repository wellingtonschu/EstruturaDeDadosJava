package Ordenacao;

import java.util.Arrays;

import static Ordenacao.MergeSort.*;
import static Ordenacao.QuickSort.*;

public class Main {

    public static void main(String[] args) {

        Sort s = new Sort();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();

        int arr[] = {10,8,3,1,9,7,4,3};

        int tamanhoArray2 = 100000;

        int auxVetorCr2 = 0;
        int[] array2Crescentes = new int[tamanhoArray2];
        for (int y = 0; y < array2Crescentes.length; y++)
        {
            array2Crescentes[y] = auxVetorCr2++;
        }

        /*System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        s.BubbleSort(arr);

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        s.selectionSort(arr);

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        s.insertionSort(arr);

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);*/

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(array2Crescentes));
        quickSort(array2Crescentes,0,array2Crescentes.length-1);


    }

}
