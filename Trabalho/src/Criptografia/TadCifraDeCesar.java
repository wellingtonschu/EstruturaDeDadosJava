package Criptografia;

import java.text.Normalizer;

public class TadCifraDeCesar {

    private static String removerAcentos (String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public char substituirCifrar (char letraInicial, int key){
        char let = (char) (letraInicial + key);

        if (letraInicial == ' ')
            return ' ';

        if (let > 'z') {
            int delta = let - 'z';
            let = (char) ('a' + delta - 1);
        }
        return let;
    }

    public char substituirDecifrar (char letraInicial, int key) {
        char let = (char) (letraInicial - key);

        if (letraInicial == ' ')
            return ' ';

        if (let < 'a') {
            int delta  = 'a' - let;
        }
        return let;
    }

    public String cifrar (String palavra, int key) {
        String result = "";
        char temp[] = removerAcentos(palavra).toCharArray();

        for (int a = 0; a < palavra.length(); a++) {
            result += substituirCifrar(temp[a], key);
        }
        return result;
    }

    public String decifrar (String palavra, int key) {
        String result = "";
        char temp[] = removerAcentos(palavra).toCharArray();

        for (int a = 0; a < palavra.length(); a++) {
            result += substituirDecifrar(temp[a], key);
        }
        return result;
    }

}
