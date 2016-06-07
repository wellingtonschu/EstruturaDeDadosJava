package Lista08;

public class Ex01PreFixadoEsquerda {

    public static void preFixadoEsquerda(Ex01ARVORE auxiliar) {

        if(auxiliar != null) {

            System.out.println(auxiliar.valor);
            preFixadoEsquerda(auxiliar.esquerda);
            preFixadoEsquerda(auxiliar.direita);

        }

    }

}
