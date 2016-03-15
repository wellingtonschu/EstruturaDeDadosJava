package Lista02;

import java.util.Scanner;

public class Ex10 {

    private static class LISTA {

        public int numero;
        public LISTA proximo;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LISTA inicioLista01 = null;
        LISTA fimLista01 = null;

        LISTA inicioLista02 = null;
        LISTA fimLista02 = null;

        LISTA auxiliar = null;
        LISTA anterior = null;
        int contador = 0;

        final int QUANTIDADE = 100;

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("1 - Limpar e adicionar números aleatórios");
            System.out.println("2 - Mostrar lista 01");
            System.out.println("3 - Mostrar lista 02");
            System.out.println("4 - Media, moda e mediana da lista 02");
            System.out.println("5 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 5) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                inicioLista01 = null;
                inicioLista02 = null;
                contador = QUANTIDADE;

                System.out.println("GERADOR DE NÚMEROS");

                for (int i = 0; i < QUANTIDADE; i++) {

                    LISTA novo = new LISTA();
                    TadGeradorDeAleatorios Aleatorios = new TadGeradorDeAleatorios();

                    int numero = Aleatorios.intervaloAleatorio(-50, 50);

                    novo.numero = numero;

                    try {

                        Thread.sleep((Math.abs(novo.numero % 10) + 30));

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                    if (inicioLista01 == null) {

                        inicioLista01 = novo;
                        fimLista01 = novo;
                        novo.proximo = null;

                    } else {

                        fimLista01.proximo = novo;
                        fimLista01 = novo;
                        fimLista01.proximo = null;

                    }

                    novo = new LISTA();

                    novo.numero = numero;

                    if (inicioLista02 == null) {

                        inicioLista02 = novo;
                        fimLista02 = novo;
                        novo.proximo = null;
                        contador++;

                    } else {

                        auxiliar = inicioLista02;

                        boolean controleDeEntrada = true;
                        boolean estouro = false;

                        if (novo.numero <= auxiliar.numero) {

                            inicioLista02 = novo;
                            novo.proximo = auxiliar;
                            contador++;

                        } else if (novo.numero > fimLista02.numero) {

                            fimLista02.proximo = novo;
                            fimLista02 = novo;
                            fimLista02.proximo = null;
                            contador++;

                        } else {

                            int incognita = 0;

                            while (controleDeEntrada && !estouro) {

                                if (incognita < contador) {

                                    if (novo.numero <= auxiliar.numero) {

                                        controleDeEntrada = false;

                                    } else {

                                        auxiliar = auxiliar.proximo;

                                    }

                                } else {

                                    estouro = true;

                                }

                                incognita++;

                            }

                            if (estouro) {

                                fimLista02.proximo = novo;
                                fimLista02 = novo;
                                fimLista02.proximo = null;
                                contador++;

                            } else if (!controleDeEntrada) {

                                controleDeEntrada = true;
                                int contadorDePosicao = 1;
                                auxiliar = inicioLista02;

                                while (controleDeEntrada) {

                                    if (contadorDePosicao == incognita--) {

                                        anterior = auxiliar;
                                        auxiliar = anterior.proximo;
                                        anterior.proximo = novo;
                                        novo.proximo = auxiliar;
                                        contador++;
                                        controleDeEntrada = false;

                                    } else {

                                        contadorDePosicao++;
                                        auxiliar = auxiliar.proximo;

                                    }

                                }

                            }

                        }

                    }

                }

            }

            if (opcao == 2) {

                if (inicioLista01 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 01");

                    auxiliar = inicioLista01;

                    while (auxiliar != null) {

                        System.out.println(" " + auxiliar.numero + "; ");
                        auxiliar = auxiliar.proximo;

                    }

                    System.out.println();

                }

            }

            if (opcao == 3) {

                if (inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 02");

                    auxiliar = inicioLista02;

                    while (auxiliar != null) {

                        System.out.println(" " + auxiliar.numero + "; ");
                        auxiliar = auxiliar.proximo;

                    }

                    System.out.println();

                }

            }

            if (opcao == 4) {

                if (inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 02");
                    auxiliar = inicioLista02;

                    int matriz[][] = new int[101][2];
                    int contadorMatriz01 = 0;
                    int soma = 0;
                    int media01 = 0;
                    int media02 = 0;

                    while (auxiliar != null) {

                        soma = soma + auxiliar.numero;
                        matriz[contadorMatriz01][0] = auxiliar.numero;

                        if (contadorMatriz01 == 50) {

                            media01 = auxiliar.numero;

                        }

                        if (contadorMatriz01 == 51) {

                            media02 = auxiliar.numero;

                        }

                        contadorMatriz01++;
                        auxiliar = auxiliar.proximo;

                    }

                    contadorMatriz01 = 0;

                    int contadorMatriz02 = 0;

                    while (contadorMatriz01 < contadorMatriz01) {

                        contadorMatriz02 = 0;

                        while (contadorMatriz02 < contadorMatriz01) {

                            if (matriz[contadorMatriz01][0] == matriz[contadorMatriz02][0]) {

                                matriz[contadorMatriz02][1]++;

                            }

                            contadorMatriz02++;
                        }

                        contadorMatriz01++;

                    }

                    int maior = 0;
                    int quantidadeNumeroMaior = 0;

                    for (int i = 0; i <= 100; i++) {

                        if (matriz[i][1] > maior) {

                            maior =  matriz[i][1];
                            quantidadeNumeroMaior = matriz[i][0];

                        }

                    }

                    int media = soma / 100;

                    System.out.println("Media: " + media + "; Moda: " + quantidadeNumeroMaior + "; Mediana: " + ((media01 + media02) / 2));

                }

            }

        }

    }

}