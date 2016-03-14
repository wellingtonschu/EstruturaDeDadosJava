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

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 8){

                System.out.println("Opção inválida");

            }

            if (opcao == 1){

                System.out.println("Informe o número da posição inicial: ");
                LISTA novo = new LISTA();
                novo.numero = input.nextInt();

                if (inicio == null){

                    inicio = novo;
                    fim = novo;
                    novo.proximo = null;

                } else {

                    novo.proximo = inicio;
                    inicio = novo;

                }

                System.out.println("Número inserido");

                contador++;

            }

            if (opcao == 2){

                System.out.println("Insira o numero para a posição final da lista");
                LISTA novo = new LISTA();
                novo.numero = input.nextInt();

                if (inicio == null){

                    inicio = novo;
                    fim = novo;
                    novo.proximo = null;

                } else {

                    fim.proximo = novo;
                    fim = novo;
                    fim.proximo = null;

                }

                System.out.println("Número inserido");

                contador++;

            }

            if (opcao == 3){

                System.out.println("Posição a ser inserido: ");
                int posicao = input.nextInt();

                if (posicao <= 1 || posicao > contador ){

                    System.out.println("Posição inválida");

                } else {

                    System.out.println("Informe o valor a ser inserido na posição " + posicao + " da lista.");
                    LISTA novo = new LISTA();
                    novo.numero = input.nextInt();

                    aux = inicio;
                    boolean controleDeEntrada = true;
                    int contadorPosicao = 1;

                    while (controleDeEntrada){

                        if (contadorPosicao == posicao - 1){

                            anterior = aux;
                            aux = anterior.proximo;
                            anterior.proximo = novo;
                            novo.proximo = aux;
                            controleDeEntrada = false;

                        } else {

                            contadorPosicao++;

                            aux = anterior.proximo;

                        }

                    }

                    System.out.println("Número inserido");

                    contador++;

                }

            }

            if (opcao == 4){

                if (inicio == null){

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista completa, número de elementos: " + contador);

                    aux = inicio;

                    while (aux != null){

                        System.out.print("|" + aux.numero + "|");
                        aux = aux.proximo;

                    }

                    System.out.println();

                }

            }

            if (opcao == 5){

                if (inicio == null){

                    System.out.println("Vazio");

                } else {

                    int numero;
                    int encontrado = 0;

                    System.out.println("Valor a ser removido: ");
                    numero = input.nextInt();

                    aux = inicio;
                    anterior = null;

                    while (aux != null){

                        if (aux.numero == numero){

                            encontrado++;

                            if (aux == inicio){

                                inicio = aux.proximo;
                                aux = inicio;

                            } else if (aux == fim){

                                anterior.proximo = null;
                                fim = anterior;
                                aux = null;

                            } else {

                                anterior.proximo = aux.proximo;
                                aux = aux.proximo;

                            }

                            contador--;

                        } else {

                            anterior.proximo = aux.proximo;
                            aux = aux.proximo;

                        }

                    }

                    if (encontrado == 0){

                        System.out.println("Não encontrado");

                    } else {

                        System.out.println("Número removido " + encontrado + "vezes");

                    }
                }
            }

            if (opcao == 6){

                if(inicio == null){

                    System.out.println("Vazio");

                } else {

                    int[] vetor = new int[contador];
                    int auxVetor  = contador--;

                    System.out.println("Lista completa, número de elementos: " + contador);

                    aux = inicio;

                    while (aux != null){

                        vetor[auxVetor] = aux.numero;
                        aux = aux.proximo;
                        auxVetor--;

                    }

                    for (int i = 0; i < vetor.length; i++){

                        System.out.print("|" + vetor[i] + "|");

                    }

                    System.out.println();

                }

            }

        }

    }

}