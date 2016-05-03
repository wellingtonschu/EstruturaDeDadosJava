package Lista07;

public class Main {

    public static void main (String[] args) {

        double valor = 1;
        int vetor[] = {10, 5, 7, 4, 9, 3, 1, 8, 6, 2};

        Ex01 exercicio01 = new Ex01();
        System.out.println("\nExercicio 01: " + exercicio01.R(valor));

        Ex02 exercicio02 = new Ex02();
        System.out.println("\nExercicio 02: " + exercicio02.fib(valor));

        Ex03 exercicio03 = new Ex03();
        System.out.println("\nExercicio 03: " + exercicio03.sum(valor));

        Ex04 exercicio04 = new Ex04();
        System.out.println("\nExercicio 04: " + exercicio04.sum(valor));

        Ex06 exercicio06 = new Ex06();
        System.out.println("\nExercicio 06: ");
        System.out.println("Menor: " + exercicio06.Menor(vetor, vetor.length, vetor[0]));
        System.out.println("Maior: " + exercicio06.Maior(vetor, vetor.length, vetor[0]));

        Ex07 exercicio07 = new Ex07();

    }

}
