package Lista08;

public class Ex01PosFixadoDireita {

    public static void posFixadoDireita(Ex01ARVORE auxiliar) {

        if (auxiliar != null) {

            posFixadoDireita(auxiliar.direita);
            posFixadoDireita(auxiliar.esquerda);
            System.out.println(auxiliar.valor);

        }

    }

}
