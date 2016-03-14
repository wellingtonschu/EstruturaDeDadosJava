package Lista02;

import java.util.*;

public class Ex04 {

    private static class LISTA1 {

        public int numeroLista1;
        public LISTA1 proximoLista1;

    }

    private static class LISTA2 {

        public int numeroLista2;
        public LISTA2 proximoLista2;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LISTA1 inicio1 = null;
        LISTA1 fim1 = null;
        LISTA1 aux1 = null;
        LISTA1 anterior1 = null;

        LISTA2 inicio2 = null;
        LISTA2 fim2 = null;
        LISTA2 aux2 = null;
        LISTA2 anterior2 = null;

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("1 - Inserir lista 1");
            System.out.println("2 - Inserir lista 1");
            System.out.println("3 - Mostrar Uniao");
            System.out.println("4 - Mostrar Intersecção");
            System.out.println("5 - Mostrar Diferença");
            System.out.println("6 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 6) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                System.out.println("Número para lista 1:");
                LISTA1 novo1 = new LISTA1();
                novo1.numeroLista1 = input.nextInt();

                if (inicio1 == null) {

                    inicio1 = novo1;
                    fim1 = novo1;
                    novo1.proximoLista1 = null;

                } else {

                    novo1.proximoLista1 = inicio1;
                    inicio1 = novo1;

                }

                System.out.println("Número inicial inserido");

            }

            if (opcao == 2) {

                System.out.println("Número para lista 2:");
                LISTA2 novo2 = new LISTA2();
                novo2.numeroLista2 = input.nextInt();

                if (inicio2 == null) {

                    inicio2 = novo2;
                    fim2 = novo2;
                    novo2.proximoLista2 = null;

                } else {

                    novo2.proximoLista2 = inicio2;
                    inicio2 = novo2;

                }

                System.out.println("Número inicial inserido");

            }

            if (opcao == 3) {

                System.out.println("Mostramdo lista");
                aux1 = inicio1;

                while (aux1 != null) {

                    int flag = 0;

                    while (aux2 != null) {

                        if (aux1.numeroLista1 == aux2.numeroLista2){

                            System.out.println(aux1.numeroLista1);
                            flag = 1;

                        }

                        aux2 = aux2.proximoLista2;

                    }

                    if (flag == 0) {

                        System.out.println(aux1.numeroLista1);

                    }

                    aux1 = aux1.proximoLista1;

                }

                while (aux2 != null) {

                    int flag = 0;

                    while (aux1 != null) {

                        if (aux1.numeroLista1 == aux2.numeroLista2){

                            flag = 1;

                        }

                        aux1 = aux1.proximoLista1;

                    }

                    if (flag == 0) {

                        System.out.println(aux2.numeroLista2);

                    }

                    aux2 = aux2.proximoLista2;

                }

            }

            if (opcao == 4) {

                aux1 = inicio1;

                while (aux1 != null) {

                    while (aux2 != null) {

                        if (aux1.numeroLista1 == aux2.numeroLista2) {

                            System.out.println(aux1.numeroLista1);

                        }

                        aux2 = aux2.proximoLista2;

                    }

                    aux1 = aux1.proximoLista1;

                }

            }

            if (opcao == 5) {

                System.out.println("Lista completa");

                aux1 = inicio1;

                while (aux1 != null) {

                    int flag = 0;

                    while (aux2 != null) {

                        if (aux1.numeroLista1 == aux2.numeroLista2) {

                            flag = 1;

                        }

                    }

                    if (flag == 0) {

                        System.out.println(aux1.numeroLista1);

                    }

                    aux1 = aux1.proximoLista1;

                }

                while (aux2 != null) {

                    int flag = 0;

                    while (aux1 != null) {

                        if (aux1.numeroLista1 == aux2.numeroLista2) {

                            flag = 1;

                        }

                    }

                    if (flag == 0) {

                        System.out.println(aux2.numeroLista2);
                    }

                    aux2 = aux2.proximoLista2;

                }

            }

        }

    }

}
