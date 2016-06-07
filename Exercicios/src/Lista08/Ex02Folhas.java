package Lista08;

public class Ex02Folhas {

    public static void folhas(Ex02ARVORE auxiliar) {

        if (auxiliar != null) {

            if (auxiliar.esquerda == null && auxiliar.direita == null) {

                System.out.println(auxiliar.valor + " ");

            } else {

                folhas(auxiliar.esquerda);
                folhas(auxiliar.direita);

            }

        }

    }

}
