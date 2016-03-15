package Lista02;

import java.util.Scanner;

public class Ex06 {

    private static class LISTA {

        public int numero;
        public LISTA proximo;

    }

    public static void main (String[]arg) {

        Scanner input = new Scanner(System.in);

        LISTA inicioLista01 = null;
        LISTA fimLista01 = null;
        LISTA auxiliar01 = null;
        int contadorLista01 = 0;

        LISTA inicioLista02 = null;
        LISTA fimLista02 = null;
        LISTA auxiliar02 = null;
        int contadorLista02 = 0;

        LISTA anterior = null;

        int opcao = 0;

        while (opcao != 6) {

            System.out.println("1 - Inserir na  lista 01");
            System.out.println("2 - Mostrar lista 01");
            System.out.println("3 - Inserir na lista 02");
            System.out.println("4 - Mostrar lista 02");
            System.out.println("5 - Juntar listas");
            System.out.println("6 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 6) {

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

                } else {

                    auxiliar01 = inicioLista01;
                    boolean controleDeEntrada = true;
                    boolean estouro = false;

                    if (novo.numero <= auxiliar01.numero) {

                        inicioLista01 = novo;
                        novo.proximo = auxiliar01;
                        contadorLista01++;

                    } else if (novo.numero > fimLista01.numero) {

                        fimLista01.proximo = novo;
                        fimLista01 = novo;
                        fimLista01.proximo = null;
                        contadorLista01++;

                    } else {

                        int incognita = 0;

                        while (controleDeEntrada && !estouro) {

                            if (incognita < contadorLista01) {

                                if (novo.numero < auxiliar01.numero) {

                                    controleDeEntrada = false;

                                } else {

                                    auxiliar01 = auxiliar01.proximo;

                                }

                            } else {

                                estouro = true;

                            }

                            incognita++;

                        }

                        if (estouro) {

                            fimLista01.proximo = novo;
                            fimLista01 = novo;
                            fimLista01.proximo = null;
                            contadorLista01++;

                        } else if (!controleDeEntrada) {

                            controleDeEntrada = true;
                            int contadorPosicao = 1;
                            auxiliar01 = inicioLista01;

                            while (controleDeEntrada) {

                                if (contadorPosicao == incognita--) {

                                    anterior = auxiliar01;
                                    auxiliar01 = anterior.proximo;
                                    anterior.proximo = novo;
                                    novo.proximo = auxiliar01;
                                    contadorLista01++;
                                    controleDeEntrada = false;

                                } else {

                                    contadorPosicao++;
                                    auxiliar01 = auxiliar01.proximo;

                                }

                            }

                        }

                    }

                }

                System.out.println("Número inserido");

            }

            if (opcao == 2) {

                if (inicioLista01 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 01, número de elementos: " + contadorLista01);
                    auxiliar01 = inicioLista01;

                    while (auxiliar01 != null) {

                        System.out.print("|" + auxiliar01.numero + "|");
                        auxiliar01 = auxiliar01.proximo;

                    }

                    System.out.println();

                }

            }

            if (opcao == 3) {

                LISTA novo = new LISTA();

                System.out.println("Informe o numero: ");

                novo.numero = input.nextInt();

                if (inicioLista02 == null) {

                    inicioLista02 = novo;
                    fimLista02 = novo;
                    novo.proximo = null;

                } else {

                    auxiliar01 = inicioLista01;
                    boolean controleDeEntrada = true;
                    boolean estouro = false;

                    if (novo.numero <= auxiliar02.numero) {

                        inicioLista02 = novo;
                        novo.proximo = auxiliar01;
                        contadorLista02++;

                    } else if (novo.numero > fimLista02.numero) {

                        fimLista02.proximo = novo;
                        fimLista02 = novo;
                        fimLista02.proximo = null;
                        contadorLista02++;

                    } else {

                        int incognita = 0;

                        while (controleDeEntrada && !estouro) {

                            if (incognita < contadorLista01) {

                                if (novo.numero < auxiliar02.numero) {

                                    controleDeEntrada = false;

                                } else {

                                    auxiliar02 = auxiliar02.proximo;

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
                            contadorLista02++;

                        } else if (!controleDeEntrada) {

                            controleDeEntrada = true;
                            int contadorPosicao = 1;
                            auxiliar02 = inicioLista02;

                            while (controleDeEntrada) {

                                if (contadorPosicao == incognita--) {

                                    anterior = auxiliar02;
                                    auxiliar02 = anterior.proximo;
                                    anterior.proximo = novo;
                                    novo.proximo = auxiliar02;
                                    contadorLista02++;
                                    controleDeEntrada = false;

                                } else {

                                    contadorPosicao++;
                                    auxiliar02 = auxiliar02.proximo;

                                }

                            }

                        }

                    }

                }

                System.out.println("Número inserido");

            }

            if (opcao == 4) {

                if (inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista 02, número de elementos: " + contadorLista01);
                    auxiliar02 = inicioLista01;

                    while (auxiliar02 != null) {

                        System.out.print("|" + auxiliar02.numero + "|");
                        auxiliar01 = auxiliar02.proximo;

                    }

                    System.out.println();

                }

            }

            if (opcao == 5) {

                if (inicioLista01 == null && inicioLista02 == null) {

                    System.out.println("Vazio");

                } else {

                    auxiliar01 = inicioLista01;
                    auxiliar02 = inicioLista02;

                    while (auxiliar01 != null) {

                        while (auxiliar02 != null) {

                            if (auxiliar01 != null) {

                                if (auxiliar01.numero < auxiliar02.numero) {

                                    System.out.println("|" + auxiliar01.numero + "|");
                                    auxiliar01 = auxiliar01.proximo;

                                } else {

                                    System.out.println("|" + auxiliar02.numero + "|");
                                    auxiliar02 = auxiliar02.proximo;

                                }

                            } else {

                                System.out.println("|" + auxiliar02.numero + "|");
                                auxiliar02 = auxiliar02.proximo;

                            }

                        }

                        auxiliar01 = auxiliar01.proximo;

                    }

                }

            }

        }

    }

}
