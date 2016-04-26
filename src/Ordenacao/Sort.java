package Ordenacao;

import java.util.Arrays;

public class Sort {

    public static void BubbleSort (int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {

                    int auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;

                }

            }

            System.out.println("Após passo " + (i + 1));
            //Imprime arry após cada passo
            System.out.println(Arrays.toString(array));

        }

    }

    public static void selectionSort(int arr[]){

        int N = arr.length;

        for (int i = 0; i < N; i++){

            int menor = arr[i];
            int posicao = i;

            for (int j = i +1 ; j < N; j++){

                if (arr[j] < menor) {

                    menor = arr[j];
                    posicao = j;

                }

            }

            int temp = arr[posicao];

            arr[posicao]=arr[i];
            arr[i]=temp;
            System.out.println("Depois da iteração "+(i+1));

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {

        int N=arr.length;
        for(int i=1;i<N;i++) {

            int j=i-1;
            int temp=arr[i];

            while(j>=0&&temp<arr[j]) {

                arr[j+1]=arr[j];
                j--;;

            }

            arr[j+1]=temp;
            System.out.println("After pass "+i);
            //Printing array after pass
            System.out.println(Arrays.toString(arr));

        }

    }

}
