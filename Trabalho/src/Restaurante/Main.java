package Restaurante;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        OrgRestaurante res = new OrgRestaurante();

        int opcao;
        int numero;
        String nome;
        String resultado;
        float conta;
        int listagem;

        res.insereMesas();
        res.adicionarPratos();

        do {

            System.out.println("=========RESTAURANTE=========");
            System.out.println("Opções: ");
            System.out.println("1 - Repor Pratos");
            System.out.println("2 - Entrada fila Restaurante");
            System.out.println("3 - Entrada fila Buffet");
            System.out.println("4 - Escolha de mesa");
            System.out.println("5 - Entrada fila caixa");
            System.out.println("6 - Pagamento");
            System.out.println("0 - Sair");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:

                    input.nextLine();
                    System.out.println("Numero de pratos: ");
                    numero = input.nextInt();

                    System.out.println(res.reposicaoPratos(numero));

                    break;

                case 2:

                    input.nextLine();
                    System.out.println("Nome cliente: ");
                    nome = input.nextLine();

                    System.out.println(res.inserirFilaEspera(nome));

                    break;

                case 3:



                    if (res.checaPilhaPratos() == false) {

                        System.out.println("Sem pratos");

                    //} else if (res.checaFilaBuffet() == false) {

                        //System.out.println("Não está na fila");

                    } else {

                        System.out.println(res.inserirFilaBuffet(res.selecionaPrimeiroElementoFilaEspera()));
                        res.removerFilaEspera();
                        res.retirarPrato();

                    }

                    break;

                case 4:

                    input.nextLine();

                    if (res.checaFilaBuffet() == false) {

                        System.out.println("Aguardando cliente");

                    } else {

                        System.out.println("Numero de mesas desocupadas: ");
                        System.out.println(res.numeroMesasLiberadas());
                        System.out.println("Número da mesa para o cliente " + res.selecinaPrimeiroElementoFilaBuffet() + ": ");

                        numero = input.nextInt();

                        resultado = res.ocuparMesa("Mesa: " + numero);

                        if (resultado.equals("LIVRE")) {

                            res.removerFilaBuffet();

                        } else {

                            System.out.println("Mesa indisponivel");

                        }

                    }

                    break;

                case 5:

                    input.nextLine();

                    System.out.println("Mesa: ");
                    numero = input.nextInt();

                    resultado = res.liberaMesa("Mesa: " + numero);

                    if (resultado.equals("LIVRE")) {

                        input.nextLine();

                        System.out.println("Nome do cliente: ");
                        nome = input.nextLine();
                        System.out.println(res.inserirFilaCaixa(nome));

                    } else {

                        System.out.println("Mesa não encontrada");

                    }

                    break;

                case 6:

                    input.nextLine();

                    if (res.checaFilaCaixa() == false) {

                        System.out.println("Aguardando cliente: ");

                    } else {

                        System.out.println("Gastos do cliente: " + res.selecinaPrimeiroElementoFilaCaixa() + ": ");
                        conta = input.nextFloat();
                        System.out.println(res.removerFilaCaixa());

                    }

                    break;

            }

        } while (opcao != 0);

    }

}
