package Lista07;

public class Ex01 {

    public static double R (double x) {

        if (x > 0)

            return 2 * R(x - 1) - 4;

        else

            return 2;

    }

}
