package Lista07;

public class Ex02 {

    public static double fib(double n) {

        if (n == 0)

            return 0;

        else if (n == 1)

            return 1;

        else

            return fib(n - 1) + fib(n - 2);

    }

}
