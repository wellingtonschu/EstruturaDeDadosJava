package Criptografia;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        TadCifraDeCesar tad = new TadCifraDeCesar();

        System.out.print("Frase: ");
        String palavra = input.nextLine();
        System.out.print("Chave: ");
        int key = input.nextInt();
        String cifrada = tad.cifrar(palavra,key);
        String descifrada = tad.decifrar(cifrada,key);

        System.out.println();
        System.out.println("Entrdas");
        System.out.println();
        System.out.println("Palavra: " + palavra);
        System.out.println("Chave: " + key);
        System.out.println("----------------------");
        System.out.println("Saidas");
        System.out.println();
        System.out.println("Encriptada: " + cifrada);
        System.out.println("Decriptada: " + descifrada);

    }

}
