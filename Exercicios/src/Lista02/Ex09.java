package Lista02;

import java.util.Scanner;

public class Ex09 {

    private static class LISTA {

        public int codigo;
        public String nome;
        public double salario;
        public LISTA proximo;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA auxiliar = null;
        LISTA anterior = null;
        int contador = 0;
        int opcao = 0;

        while (opcao != 7) {

            System.out.println("1 - Inserir no inicio da lista");
            System.out.println("2 - Mostrar lista");
            System.out.println("3 - Remover da lista");
            System.out.println("4 - Limpar lista");
            System.out.println("5 - Media e maior salário");
            System.out.println("6 - Funcionário acima de valor estipulado");
            System.out.println("7 - Sair");
            System.out.println("Opção:");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 7) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                LISTA novo = new LISTA();

                System.out.println("Informe o Códifo: ");
                novo.codigo = input.nextInt();

                System.out.println("Informe o Nome: ");
                novo.nome = input.nextLine();

                System.out.println("Informe o Salário: ");
                novo.salario = input.nextDouble();

                if (inicio == null) {

                    inicio = novo;
                    fim = novo;
                    novo.proximo = null;

                } else {

                    novo.proximo = inicio;
                    inicio = novo;

                }

                System.out.println("Inserido");

                contador++;

            }

            if (opcao == 2) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    System.out.println("Lista completa, quantidade de elementos: " + contador);

                    auxiliar = inicio;

                    int contador02 = 1;

                    while (auxiliar != null) {

                        System.out.println("Funcionario "+contador+":");
                        System.out.println("Codigo: "+auxiliar.codigo);
                        System.out.println("Nome: "+auxiliar.nome);
                        System.out.println("Salario: "+auxiliar.salario);
                        System.out.println("\n");

                        auxiliar = auxiliar.proximo;
                        contador++;

                    }

                }
            }

            if (opcao == 3) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    int numero;
                    int encontrado = 0;

                    System.out.println("Informe o codigo a ser removido");
                    numero = input.nextInt();

                    auxiliar = inicio;
                    anterior = null;

                    while (auxiliar != null) {

                        if (auxiliar.codigo == numero) {

                            encontrado++;

                            if (auxiliar == inicio) {

                                inicio = auxiliar.proximo;
                                auxiliar = inicio;

                            } else if (auxiliar == fim) {

                                anterior.proximo = null;
                                fim = anterior;
                                auxiliar = null;

                            } else {

                                anterior.proximo = auxiliar.proximo;
                                auxiliar = auxiliar.proximo;

                            }

                            contador--;

                        } else {

                            anterior = auxiliar;
                            auxiliar = auxiliar.proximo;

                        }

                    }

                    if (encontrado == 0) {

                        System.out.println("Não encontrado");

                    } else {

                        System.out.println("Número removido " + encontrado + " vezes");

                    }

                }

            }

            if (opcao == 4) {

                if (inicio == null) {

                    System.out.println("Vazio");

                } else {

                    inicio = null;
                    System.out.println("Lista limpa");

                }

                contador = 0;

            }

            if (opcao == 5) {

                double media = 0;
                double maior = 0;
                int contadorMedia = 0;
                String funcionarioComMaiorSalario = "";

                auxiliar = inicio;

                while (auxiliar != null) {

                    media = media + auxiliar.salario;

                    if (auxiliar.salario >= maior) {

                        if (auxiliar.salario > maior) {

                            funcionarioComMaiorSalario = "Código: " + auxiliar.codigo + ", nome: " + auxiliar.nome + ", salário: " + auxiliar.salario;

                        } else {

                            funcionarioComMaiorSalario = "\n  Código: " + auxiliar.codigo + ", nome: " + auxiliar.nome + ", salário: " + auxiliar.salario;

                        }

                        maior = auxiliar.salario;

                    }

                    auxiliar = auxiliar.proximo;

                    contadorMedia++;

                }

                media = media / contadorMedia;

                System.out.println("Média salarial: " + media);
                System.out.println("Funcionário com maior salário: ");
                System.out.println(funcionarioComMaiorSalario);

            }

            if (opcao == 6) {

                System.out.println("Informe o valor: ");
                double valorEstipulado = input.nextDouble();

                auxiliar = inicio;
                int contadorValorEstipulado = 0;

                while (auxiliar != null) {

                    if (auxiliar.salario >= valorEstipulado) {

                        contadorValorEstipulado++;

                    }

                    auxiliar = auxiliar.proximo;

                }

                if (contadorValorEstipulado > 0) {

                    System.out.println("Némero de funcionários com salário acima de " + valorEstipulado + ": " + contadorValorEstipulado);

                } else {

                    System.out.println("Nenhum funcionário possui salário acima de: " + valorEstipulado);
                }

            }

        }

    }

}