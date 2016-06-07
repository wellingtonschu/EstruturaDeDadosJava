package Lista08;

public class Ex01CentralEsquerda {

    public static void centralEsquerda(Ex01ARVORE auxiliar) {

        if (auxiliar != null) {

            centralEsquerda(auxiliar.esquerda);
            System.out.println(auxiliar.valor);
            centralEsquerda (auxiliar.direita);

        }

    }

}
