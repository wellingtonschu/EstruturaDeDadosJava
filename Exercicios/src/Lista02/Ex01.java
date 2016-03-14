package Lista02;

public class Ex01 {

    private static class LISTA {

        public int num;
        public LISTA proximo;
        public LISTA anterior;

    }

    LISTA inicio = null;
    LISTA fim = null;
    LISTA aux = null;

    public String Exerc01(LISTA inicio, int valor) {

        aux = inicio;
        int NumTotal = 0;
        int NumContemNumero = 0;
        int NumContemMaiorQueNumero = 0;
        String NumContemPosicao = "";

        while (aux != null) {

            NumTotal++;
            if (aux.num == valor) {
                NumContemNumero++;
                NumContemPosicao = NumContemPosicao + NumTotal + " ";

            }

            if (aux.num > valor) {
                NumContemMaiorQueNumero++;

            }

            aux = aux.proximo;

        }

        return ("Numero total de nodos é: " + NumTotal + ", Número de nodos que possuem o valor: " + NumContemNumero + ", Posição dos nodos que possuem o numero maior que o valor " + NumContemMaiorQueNumero);

    }

}
