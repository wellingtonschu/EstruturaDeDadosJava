package Lista07;

/**
 * Created by welli on 26/04/2016.
 */
public class Ex07 {

    public static void Hanoi(int n, int a, int b, int c) {

        if (n >  0) {

            Hanoi(n - 1, a, b, c);

            System.out.println(a + " -> " + c);

            Hanoi(n - 1, b, c, a);

        }

    }

}
