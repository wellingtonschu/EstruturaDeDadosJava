package Lista02;

import java.util.Scanner;

public class Ex03 {

    private static class LISTA{

        public int numero;
        public LISTA proximo;
        public LISTA anterior;

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux = null;
        int opcao = 0;
        int numero;
        int achou;

        while (opcao != 7){

            System.out.println("1 - Inserir na posição inicial");
            System.out.println("2 - Listar maior menor e média");
            System.out.println("3 - Sair");
            System.out.println("Opção: ");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 3){

                System.out.println("Opção inválida");

            }

            if (opcao == 1){

                System.out.println("Informe o número do inicio da lista: ");
                LISTA novo = new LISTA();

                if (inicio == null){

                    inicio = novo;
                    fim = novo;
                    novo.proximo = null;
                    novo.anterior = null;

                } else {

                    novo.proximo = inicio;
                    inicio.anterior = novo;
                    novo.anterior = null;
                    inicio = novo;

                }

                System.out.println("Valor inserido");

            }

            if (opcao == 2){

                if (inicio == null){

                    System.out.println("Lista vazia");

                } else {

                    int soma = 0;
                    int quantidade = 0;
                    int maior = -999999;
                    int menor = 999999;

                    aux = inicio;

                    while (aux != null){

                        quantidade++;

                        soma = soma + aux.numero;

                    }

                    if (aux.numero < menor) {

                        menor = aux.numero;

                    }

                    aux = aux.proximo;

                    System.out.println("Média: " + soma / quantidade);
                    System.out.println("Maior: " + maior);
                    System.out.println("Menor: " + menor);
                    System.out.println("\n");

                }

            }

        }

    }

}
