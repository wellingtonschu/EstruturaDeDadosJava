package Lista08;

public class Ex02Main {

    public static void main(String[] args) {

        Ex02ARVORE arvore = new Ex02ARVORE();
        arvore.valor = 6;

        arvore.direita = new Ex02ARVORE();
        arvore.direita.valor = 8;

        arvore.direita.direita = new Ex02ARVORE();
        arvore.direita.direita.valor = 12;

        arvore.direita.esquerda = new Ex02ARVORE();
        arvore.direita.esquerda.valor = 7;

        arvore.direita.direita.esquerda = new Ex02ARVORE();
        arvore.direita.direita.esquerda.valor = 10;

        arvore.esquerda = new Ex02ARVORE();
        arvore.esquerda.valor = 2;

        arvore.esquerda.esquerda = new Ex02ARVORE();
        arvore.esquerda.esquerda.valor = 1;

        arvore.esquerda.direita = new Ex02ARVORE();
        arvore.esquerda.direita.valor = 4;

        arvore.esquerda.direita.esquerda = new Ex02ARVORE();
        arvore.esquerda.direita.esquerda.valor = 3;

        arvore.esquerda.direita.direita = new Ex02ARVORE();
        arvore.esquerda.direita.direita.valor = 5;

        System.out.println("\nMaior Número: " + Ex02MaiorNumero.maiorNumero(arvore));

        System.out.println("\nMenor Número: " + Ex02MenorNumero.menorNumero(arvore));

        System.out.println("\nNúmero de folhas: ");
        Ex02Folhas.folhas(arvore);

        System.out.println("\nNúmero de ancestraris do nó 5: ");
        Ex02NodesAncestrais.ancestrais(arvore, arvore.esquerda.direita.direita);

        System.out.println("\nNúmero de descendentes do nó 2: ");
        Ex02NodesDescendentes.nodesDescendentes(arvore.esquerda);

        System.out.println("\nSub-árvore da direita do nó 6: ");
        Ex02SubArvoreDireita.subArvoreDireita(arvore);

        System.out.println("\nSub-árvore da esquerda do nó 6: ");
        Ex02SubArvoreEsquerda.subArvoreEsquerda(arvore);

        System.out.println("\nQuantidade de elementos: " + Ex02QuantTotalElementos.quantTotalElementos(arvore));

        Ex02LISTA lista = Ex02ArvoreToLista.arvoreToLista(arvore);
        System.out.println("\nLista da arvore: ");
        while (lista != null) {

            System.out.println(lista.valor + " ");
            lista = lista.proximo;

        }

    }

}
