package Lista08;

public class Ex01PosFixadoEsquerda {

    public static void posFixadoEsquerda(Ex01ARVORE auxiliar) {

        if(auxiliar != null) {

            posFixadoEsquerda(auxiliar.esquerda);
            posFixadoEsquerda(auxiliar.direita);
            System.out.println(auxiliar.valor);

        }

    }

}
