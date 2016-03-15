package Lista02;

import java.util.Date;

public class TadGeradorDeAleatorios {

    Date data = new Date();

    public long aleatorio() {

        long mili = new Date().getTime();
        long incognita = (mili % 1000) * 1103515245 + 12345;

        return incognita % 32768;
    }

    public int intervaloAleatorio (long entrada, long fim) {

        if (entrada > fim) {

            long incognita = fim;
            fim = entrada;
            entrada = incognita;

        }

        long mili = new Date().getTime();
        long numero = fim - entrada + 1;
        long random = entrada + mili % numero;

        return (int) random;
    }

}
