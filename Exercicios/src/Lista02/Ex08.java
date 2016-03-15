package Lista02;

import java.util.Scanner;

public class Ex08 {

    private static class LISTA {

        public int numero;
        public LISTA proximo;
        public LISTA anterior;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA auxiliar01 = null;
        LISTA auxiliar02 = null;
        int contador = 0;
        int opcao = 0;

        while (opcao != 8) {

            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Mostrar lista");
            System.out.println("4 - Mostrar lista invertida");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Limpar lista");
            System.out.println("7 - Inserir na posição central");
            System.out.println("8 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 8) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                System.out.println("Informe o número da posição inicial: ");
                LISTA novo = new LISTA();
                novo.numero = input.nextInt();

                if (inicio == null) {

                    inicio = novo;
                    fim = novo;
                    novo.proximo = inicio;
                    novo.anterior = inicio;
                    contador++;

                } else {

                    novo.proximo = inicio;
                    inicio.anterior = novo;
                    novo.anterior = fim;
                    fim.proximo = novo;
                    inicio = novo;
                    contador++;

                }

                System.out.println("Número inserido");

            }

            if (opcao == 2) {

                System.out.println("Insira o numero para a posição final da lista");
                LISTA novo = new LISTA();
                novo.numero = input.nextInt();

                if (inicio == null) {

                    inicio = novo;
                    fim = novo;
                    novo.proximo = inicio;
                    novo.anterior = inicio;
                    contador++;

                } else {

                    fim.proximo = novo;
                    novo.anterior = fim;
                    fim = novo;
                    fim.proximo = inicio;
                    inicio.anterior = fim;
                    contador++;

                }

                System.out.println("Número inserido");

            }

            if (opcao == 3) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista comopleta: ");
                    auxiliar01 = inicio;

                    do {

                        System.out.print("|" + auxiliar01.numero + "|");
                        auxiliar01 = auxiliar01.proximo;

                    } while (auxiliar01 != inicio);

                    System.out.println();

                }

            }

            if (opcao == 4) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista comopleta: ");
                    auxiliar01 = fim;

                    do {

                        System.out.print("|" + auxiliar01.numero + "|");
                        auxiliar01 = auxiliar01.anterior;

                    } while (auxiliar01 != fim);

                    System.out.println();

                }

            }

            if (opcao == 5) {

                int encontrado = 0;
                int numero;

                if (inicio == null) {

                    System.out.println("Vazio");

                }

                System.out.println("Informe o numero: ");
                numero = input.nextInt();

                auxiliar01 = inicio;
                int quantidade = 0;

                do {

                    quantidade++;
                    auxiliar01 = auxiliar01.proximo;

                }while (auxiliar01 != inicio);

                int elemento = 1;

                do {

                    if (inicio == fim && inicio.numero == numero) {

                        inicio = null;
                        encontrado++;

                    } else {

                        if (auxiliar01.numero == numero) {

                            encontrado++;

                            if (auxiliar01 == inicio) {

                                inicio = auxiliar01.proximo;
                                inicio.anterior = fim;
                                fim.proximo = inicio;
                                auxiliar01 = inicio;
                                contador--;

                            } else if (auxiliar01 == fim) {

                                fim = fim.anterior;
                                fim.proximo = inicio;
                                inicio.anterior = fim;
                                auxiliar01 = null;
                                contador--;
                            } else {

                                auxiliar01.anterior.proximo = auxiliar01.proximo;
                                auxiliar01.proximo.anterior = auxiliar01.anterior;
                                auxiliar01 = auxiliar01.proximo;
                                contador--;

                            }

                        } else {

                            auxiliar01 = auxiliar01.proximo;

                        }

                    }

                    elemento++;

                } while (elemento <= quantidade);

                if (encontrado == 0) {

                    System.out.println("Não encontrado");

                } else {

                    System.out.println("Numero removido " + encontrado + " vezes");

                }

            }

            if (opcao == 6) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    inicio = null;
                    System.out.println("Lista limpa");
                    contador = 0;

                }

            }

            if (opcao == 7) {

                System.out.println("Posição:");
                int posicao = input.nextInt();

                if (posicao <= 1) {

                    System.out.println("Posição inválida");

                } else if (posicao > contador) {

                    System.out.println("Posição inválida");

                } else {

                    System.out.println("Informe o número a ser inserido na posição " + posicao);
                    LISTA novo = new LISTA();
                    novo.numero = input.nextInt();

                    auxiliar01 = inicio;
                    boolean controleDeEntrada = true;
                    int contadorDePosicao = 1;

                    while (controleDeEntrada) {

                        if (contadorDePosicao == posicao--) {

                            auxiliar02 = auxiliar01;
                            auxiliar01 = auxiliar02.proximo;
                            auxiliar02.proximo = novo;
                            novo.anterior = auxiliar02;
                            novo.proximo = auxiliar01;
                            auxiliar01.anterior = novo;
                            controleDeEntrada = false;

                        } else {

                            contadorDePosicao++;
                            auxiliar01 = auxiliar01.proximo;

                        }

                    }

                    System.out.println("Número inserido");
                    contador++;

                }

            }

        }

    }

}
