package Lista08;

public class Ex02SubArvoreEsquerda {

    public static void subArvoreEsquerda(Ex02ARVORE node) {

        if (node != null) {

            descendentes(node.esquerda);

        }

    }

    private static void descendentes(Ex02ARVORE node) {

        if (node != null) {

            descendentes(node.esquerda);
            System.out.println(node.valor + " ");

        }

    }

}
