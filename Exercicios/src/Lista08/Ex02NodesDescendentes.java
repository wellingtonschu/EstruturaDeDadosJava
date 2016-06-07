package Lista08;

public class Ex02NodesDescendentes {

    public static void nodesDescendentes(Ex02ARVORE node) {

        descendentes(node.esquerda);
        descendentes(node.direita);

    }

    private static void descendentes(Ex02ARVORE node) {

        if (node != null) {

            descendentes(node.esquerda);
            descendentes(node.direita);
            System.out.println(node.valor + " ");

        }

    }

}
