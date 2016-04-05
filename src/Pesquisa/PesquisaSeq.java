package Pesquisa;

import static Pesquisa.PesquisaSeqBin.buscaSequencia;

public class PesquisaSeq {

    public static void main(String[] args) {

        int V[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71};

        System.out.println("Pesquisa sequencial");
        System.out.println("Número encontrado na posição: " + buscaSequencia(V,5));

    }
}
