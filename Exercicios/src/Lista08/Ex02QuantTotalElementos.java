package Lista08;

public class Ex02QuantTotalElementos {

    public static int quantTotalElementos(Ex02ARVORE auxiliar) {

        if (auxiliar == null) {

            return 0;

        } else {

            return quantTotalElementos(auxiliar.esquerda) + quantTotalElementos(auxiliar.direita) + 1;

        }

    }

}
