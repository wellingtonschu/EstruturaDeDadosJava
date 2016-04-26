package Recursividade;

public class Exemplo {

    static int somaRecursiva(int n) {

        if (n == 1)

            return 1;

        else

            return n + somaRecursiva(n-1);

    }

    static int fatorialRecursivo(int n) {

        if (n == 1)

            return 1;

        else

            return n * somaRecursiva(n-1);

    }

}
