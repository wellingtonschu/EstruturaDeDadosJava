package Ordenacao;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sort s = new Sort();

        int arr[] = {10,7,3,1,9,7,4,3};

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        s.BubbleSort(arr);

        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arr));
        s.selectionSort(arr);

    }

}
