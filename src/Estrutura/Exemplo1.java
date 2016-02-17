package Estrutura;

import tad.aritmetica;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {

        aritmetica minhasContas = new aritmetica();
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;

        System.out.println("Digite dois números:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        resultado =  minhasContas.soma(num1, num2);

        int multiplicacao = minhasContas.multiplicacao(num1, num2);

        System.out.println("Soma = " + resultado);
        System.out.println("Multiplicação = " + multiplicacao);

    }

}
