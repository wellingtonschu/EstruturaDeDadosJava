package Criptografia;

import java.text.Normalizer;
import java.util.Scanner;

public class CifraDeCesar {

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    //**************************************************************
    public char substituirCifrar(char letraInicial, int k){
        char let = (char)(letraInicial + k);

        if(letraInicial == ' ') return ' ';

        if(let > 'z'){
            int delta =  let - 'z';
            let = (char) ('a' + delta - 1);
        }
        return let;
    }
    //**************************************************************
    public char substituirDecifrar(char letraInicial, int k){
        char let = (char)(letraInicial - k);

        if(letraInicial == ' ') return ' ';

        if(let < 'a'){
            int delta =  'a' - let;
            let = (char) ('z' - delta + 1);
        }
        return let;
    }
    //**************************************************************
    public String cifrar (String palavra, int k) {
        String result = "";
        char temp[] = removerAcentos(palavra).toCharArray();

        for (int a=0 ; a< palavra.length(); a++){
            result += substituirCifrar(temp[a], k);
        }
        return result;
    }
    //**************************************************************
    public String decifrar (String palavra, int k) {
        String result = "";
        char temp[] = removerAcentos(palavra).toCharArray();

        for (int a=0 ; a< palavra.length(); a++){
            result += substituirDecifrar(temp[a], k);
        }
        return result;
    }
    //**************************************************************
    public static void main(String[] args) {
        CifraDeCesar t = new CifraDeCesar();

        System.out.println("===== Cifra de Cesar ======");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Entre com a frase : ");
        String palavra = teclado.nextLine();
        System.out.print("Entre com o K : ");
        int k = teclado.nextInt();
        String cifrada = t.cifrar(palavra,k);
        String descifrada = t.decifrar(cifrada,k);

        System.out.println("===========================");
        System.out.println("WORD      : " + palavra);
        System.out.println("K         : " + k);
        System.out.println("CIFRADA   : " + cifrada);
        System.out.println("DECIFRADA : " + descifrada);
        System.out.println("===========================");
    }
}
