package Criptografia;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        TadCifraDeCesar tad = new TadCifraDeCesar();

        System.out.println("Frase: ");

        tad.cifrar("teste", 2);

        System.out.println();

    }

}
