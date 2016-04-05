package Lista04Pesquisa;

public class PesquisaBinaria {

    public static int buscaBinaria(int vetor[], int numero) {

        int min = 0;
        int max = vetor.length - 1;
        int meio = 0;

        int intercoes = 0;

        while (min <= max) {

            meio = (min + max) / 2;
            intercoes ++;
            System.out.println("Iterações" + intercoes);

            if (vetor [meio] == numero) {

                intercoes++;
                System.out.println("Iterações" + intercoes);
                return meio;

            } else if (vetor[meio] < numero){

                intercoes++;
                min = meio + 1;
                System.out.println("Iterações" + intercoes);

            } else {

                intercoes++;
                max = meio - 1;
                System.out.println("Iterações" + intercoes);

            }

        }

        return -1;

    }

}
