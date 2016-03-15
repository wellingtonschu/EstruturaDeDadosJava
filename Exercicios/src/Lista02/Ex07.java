package Lista02;

import java.util.Scanner;

public class Ex07 {

    private static class LISTA {

        public int numero;
        public LISTA proximo;
        public LISTA anterior;

    }

    public static void main (String[]arg) {

        Scanner input = new Scanner(System.in);

        LISTA inicioLista01 = null;
        LISTA fimLista01 = null;
        LISTA auxiliar01 = null;

        LISTA inicioLista02 = null;
        LISTA fimLista02 = null;
        LISTA auxiliar02 = null;

        int opcao = 0;

        while (opcao != 9) {

            System.out.println("1 - Inserir no inicio da lista 01");
            System.out.println("2 - Inserir no fim da lista 01");
            System.out.println("3 - Mostrar lista 01");
            System.out.println("4 - Inserir no inicio da lista 02");
            System.out.println("5 - Inserir no fim da lista 02");
            System.out.println("6 - Mostrar lista 02");
            System.out.println("7 - Limpar listas");
            System.out.println("8 - Comparar listas");
            System.out.println("9 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 9) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                LISTA novo = new LISTA();

                System.out.println("Informe o numero: ");

                novo.numero = input.nextInt();

                if (inicioLista01 == null) {

                    inicioLista01 = novo;
                    fimLista01 = novo;
                    novo.proximo = null;
                    novo.anterior = null;

                } else {

                    novo.proximo = inicioLista01;
                    inicioLista01.anterior = novo;
                    novo.anterior = null;
                    inicioLista01 = novo;

                }

                System.out.println("Número Inserido");

            }

            if (opcao == 2) {

                LISTA novo = new LISTA();

                System.out.println("Insira o numero para a posição final da lista");

                novo.numero = input.nextInt();

                if (inicioLista01 == null) {

                    inicioLista01 = novo;
                    fimLista01 = novo;
                    novo.proximo = null;
                    novo.anterior = null;

                } else {

                    fimLista01.proximo = novo;
                    novo.anterior = fimLista01;
                    novo.proximo = null;
                    fimLista01 = novo;

                }

                System.out.println("Número inserido");

            }

            if (opcao == 3) {

                if (inicioLista01 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 01");
                    auxiliar01 = inicioLista01;

                    while (auxiliar01 != null) {

                        System.out.println(auxiliar01.numero);

                    }

                }

            }

            if (opcao == 4) {

                LISTA novo = new LISTA();

                System.out.println("Informe o numero: ");

                novo.numero = input.nextInt();

                if (inicioLista01 == null) {

                    inicioLista02 = novo;
                    fimLista02 = novo;
                    novo.proximo = null;
                    novo.anterior = null;

                } else {

                    novo.proximo = inicioLista02;
                    inicioLista02.anterior = novo;
                    novo.anterior = null;
                    inicioLista02 = novo;

                }

                System.out.println("Número Inserido");

            }

            if (opcao == 5) {

                LISTA novo = new LISTA();

                System.out.println("Insira o numero para a posição final da lista");

                novo.numero = input.nextInt();

                if (inicioLista02 == null) {

                    inicioLista02 = novo;
                    fimLista02 = novo;
                    novo.proximo = null;
                    novo.anterior = null;

                } else {

                    fimLista02.proximo = novo;
                    novo.anterior = fimLista02;
                    novo.proximo = null;
                    fimLista02 = novo;

                }

                System.out.println("Número inserido");

            }

            if (opcao == 6) {

                if (inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 01");
                    auxiliar01 = inicioLista02;

                    while (auxiliar02 != null) {

                        System.out.println(auxiliar02.numero);

                    }

                }

            }

            if (opcao == 7) {

                if (inicioLista01 == null || inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    inicioLista01 = null;
                    inicioLista02 = null;

                    System.out.println("Listas limpas");

                }

            }

            if (opcao == 8) {

                auxiliar01 = inicioLista01;
                auxiliar02 = inicioLista02;

                boolean igualdade = true;

                while ( auxiliar01 != null && igualdade) {

                    if (auxiliar01.numero != auxiliar02.numero) {

                        igualdade = false;

                    }

                    auxiliar01 = auxiliar01.proximo;
                    auxiliar02 = auxiliar02.proximo;

                }

                if (igualdade) {

                    System.out.println("Listas iguais");

                } else {

                    System.out.println("Listas diferentes");

                }

            }

        }

    }

}
