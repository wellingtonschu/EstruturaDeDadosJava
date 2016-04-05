package Pesquisa;

import static Pesquisa.PesquisaSeqBin.buscaBinaria;

public class PesquisaBin {

    public static void main(String[] args) {

        int V[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71};

        System.out.println("Pesquisa binária");
        System.out.println("Número encontrado na posição: " + buscaBinaria(V,5));

    }

}
