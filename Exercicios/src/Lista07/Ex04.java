package Lista07;

public class Ex04 {

    public static double sum(double i) {

        double soma = 0;

        for (double aux = i; i >= 1; i--) {

            soma = soma + 2 * Math.pow(i,2) + 2 * i + 8;

        }

        return soma;

    }

}
