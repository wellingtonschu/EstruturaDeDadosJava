package Lista02;

import java.util.Scanner;

public class Ex05 {

    private static class LISTA {

        public int numero;
        public LISTA proximo;

    }

    public static void main (String[]arg){

        Scanner input = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux = null;
        LISTA anterior = null;
        int contador = 0;
        int opcao = 0;

        while (opcao != 8){

            System.out.println("1 - Inserir na posição inicial");
            System.out.println("2 - Inserir na posição final");
            System.out.println("3 - Inserir na posição central");
            System.out.println("4 - Mostrar tudo");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Esvaziar lista");
            System.out.println("7 - Mostrar lista invertida");
            System.out.println("Opção:");

        }
    }
}
