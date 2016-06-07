package Lista08;

public class Ex01PreFixadoDireita {

    public static void preFixadoDireita(Ex01ARVORE auxiliar) {

        if(auxiliar != null) {

            System.out.println(auxiliar.valor);
            preFixadoDireita(auxiliar.direita);
            preFixadoDireita(auxiliar.esquerda);

        }

    }

}
