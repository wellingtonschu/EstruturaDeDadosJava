package Restaurante;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        Restaurante r = new Restaurante();

        System.out.println("entrada de cliente");

        r.inserirClienteListaDeEspera(input.nextInt());

    }

}
