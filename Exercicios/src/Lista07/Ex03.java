package Lista07;

public class Ex03 {

    public static double sum(double i) {

        if (i == 1)

            return 2 * Math.pow(i,2) + 2 * i + 8;

        else

            return (2 * Math.pow(i,2) + 2 * i + 8) + sum(i - 1);

    }

}
