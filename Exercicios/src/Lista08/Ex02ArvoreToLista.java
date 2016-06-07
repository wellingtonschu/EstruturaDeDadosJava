package Lista08;

public class Ex02ArvoreToLista {

    public static Ex02LISTA arvoreToLista (Ex02ARVORE auxiliar) {

        Ex02LISTA lista = arvoreToLista(auxiliar, new Ex02LISTA());
        Ex02LISTA aux = lista;

        while (aux.proximo.proximo != null) {

            aux = aux.proximo;

        }

        aux.proximo = null;

        return lista;

    }

    private static Ex02LISTA arvoreToLista (Ex02ARVORE auxiliar, Ex02LISTA lista) {

        while (lista.proximo != null) {

            lista = lista.proximo;

        }

        if (auxiliar != null) {

            lista.valor = auxiliar.valor;
            lista.proximo = new Ex02LISTA();

            arvoreToLista(auxiliar.esquerda, lista.proximo);
            arvoreToLista(auxiliar.direita, lista.proximo);

        }

        return lista;

    }

}
