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
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);


    }

}
