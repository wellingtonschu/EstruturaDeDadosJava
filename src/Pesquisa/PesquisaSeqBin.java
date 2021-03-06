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

    public static int buscaBinaria(int vetor[], int numero) {

        int min = 0;
        int max = vetor.length - 1;
        int meio = 0;

        while (min <= max) {

            meio = (min + max) / 2;

            if (vetor [meio] == numero) {

                return meio;

            } else if (vetor[meio] < numero){

                min = meio + 1;

            } else {

                max = meio - 1;

            }

        }

        return -1;

    }

}
