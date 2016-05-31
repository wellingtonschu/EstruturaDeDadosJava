package Lista08;

public class prefixadoDireita {

    public void PrefixadoDireita(ARVORE auxiliar) {

        if(auxiliar != null) {

            System.out.println(auxiliar.numero);
            PrefixadoDireita(auxiliar.direita);
            PrefixadoDireita(auxiliar.esquerda);

        }

    }

}
