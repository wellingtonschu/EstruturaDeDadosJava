package Lista08;

public class Ex02MenorNumero {

    public static int menorNumero(Ex02ARVORE auxiliar) {

        while (auxiliar.esquerda != null) {

            auxiliar = auxiliar.esquerda;

        }

        return auxiliar.valor;

    }

}
