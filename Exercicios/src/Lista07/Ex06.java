package Lista07;

public class Ex06 {

    public static int Menor(int v[], int i, int menor) {

        if (i == 0)

            return menor;

        else

            if (v[i - 1] < menor)

                menor = v[i - 1];

        return Menor(v, i - 1, menor);

    }

    public static int Maior(int v[], int i, int maior) {

        if (i == 0)

            return maior;

        else

            if (v[i - 1] > maior)

                maior = v[i - 1];

        return Maior(v, i - 1, maior);

    }

}
