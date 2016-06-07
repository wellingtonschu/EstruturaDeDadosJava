package Lista08;

public class Ex02NodesAncestrais {

    public static void ancestrais(Ex02ARVORE auxiliar, Ex02ARVORE node) {

        do {

            System.out.println(auxiliar.valor + " ");

            if (node.valor < auxiliar.valor) {

                auxiliar = auxiliar.esquerda;

            } else {

                auxiliar = auxiliar.direita;

            }

        } while (auxiliar.valor != node.valor);

    }

}
