package Lista08;

public class Ex02MaiorNumero {

    public static int maiorNumero(Ex02ARVORE auxiliar) {

        while (auxiliar.direita != null) {

            auxiliar = auxiliar.direita;

        }

        return auxiliar.valor;

    }

}
