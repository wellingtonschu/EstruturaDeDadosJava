package Lista02;

import java.util.Scanner;

public class Ex02 {

    private static class LISTA {

        public int numero;
        public int quantidade;
        public double preco;
        public LISTA proximo;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux = null;
        LISTA anterior = null;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("1 - Inserir produto");
            System.out.println("2 - Inserir desconto");
            System.out.println("3 - Listagem");
            System.out.println("4 - Sair");
            System.out.println("Opção: ");

            opcao = input.nextInt();

            if (opcao < 1 || opcao > 4) {

                System.out.println("Opção inválida");

            }

            if (opcao == 1) {

                LISTA novo = new LISTA();

                System.out.println("Informe o numero do iniciop da lista: ");

                System.out.println("Código: ");
                novo.numero = input.nextInt();

                System.out.println("Valor: ");
                novo.preco = input.nextDouble();

                System.out.println("Quantidade: ");
                novo.quantidade = input.nextInt();

                if (inicio == null) {

                    inicio = novo;
                    fim = novo;
                    fim.proximo = inicio;

                } else {

                    novo.proximo = inicio;
                    inicio = novo;
                    fim.proximo = inicio;

                }

                System.out.println("Cadastro realizado com sucesso");

            }

            if (opcao == 2) {

                System.out.println("Desconto: ");
                double desconto = input.nextDouble();
                aux = inicio;

                do {
                    aux.preco = aux.preco - (aux.preco * desconto) / 100;
                    aux = aux.proximo;
                }
                while (aux != inicio);

            }

            if (opcao == 3) {

                if (inicio == null) {

                    System.out.println("A lista está vazia");

                } else {

                    aux = inicio;

                    do {

                        System.out.println("Código: " + aux.numero);
                        System.out.println("Novo valor: " + aux.preco);
                        System.out.println("\n");

                        if (aux.quantidade > 100) {

                            System.out.println("Quantidade: " + aux.quantidade);

                        }

                        aux = aux.proximo;

                    }

                    while (aux != inicio);

                }

            }

        }

    }

}
