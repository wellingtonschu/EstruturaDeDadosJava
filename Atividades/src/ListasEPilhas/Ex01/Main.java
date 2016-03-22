package ListasEPilhas.Ex01;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        SalaDeAula s = new SalaDeAula();

        int opcao;

        System.out.println(s.menu());

        opcao = input.nextInt();

        if (opcao < 1 || opcao > 7) {

            System.out.println(s.mensagemOpcaoInvalida());

        } else if (opcao == 2) {



        }


    }

}
