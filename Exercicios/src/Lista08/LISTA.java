package Lista08;

public class LISTA {

    int numero;
    LISTA proximo;

    public static LISTA TransformarEmLista(ARVORE auxiliar, LISTA inicio, LISTA fim) {

        while (auxiliar != null) {

            TransformarEmLista(auxiliar.esquerda, inicio, fim);

            LISTA novo = new LISTA();
            novo.numero = auxiliar.numero;

            if (inicio == null) {

                inicio = novo;
                fim = novo;

            } else {

                fim.proximo = novo;
                fim = novo;
                fim.proximo = null;

            }

            TransformarEmLista(auxiliar.direita, inicio, fim);

        }

        return inicio;

    }

}
