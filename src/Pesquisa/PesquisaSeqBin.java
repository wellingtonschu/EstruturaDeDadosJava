package Pesquisa;

public class PesquisaSeqBin {

    public static int buscaSequencia(int vetor[], int numero) {

        int pos = 0;

        while (pos < vetor.length) {

            if (vetor[pos] == numero) {

                return pos;

            } else {

                pos++;

            }

        }

        return -1;

    }

}
