package Lista08;

public class Ex02SubArvoreDireita {

    public static void subArvoreDireita(Ex02ARVORE node) {

        if (node != null) {

            descendentes(node.direita);

        }

    }

    private static void descendentes(Ex02ARVORE node) {

        if (node != null) {

            descendentes(node.direita);
            System.out.println(node.valor + " ");

        }

    }

}
