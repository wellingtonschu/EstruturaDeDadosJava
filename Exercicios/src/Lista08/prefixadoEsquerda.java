package Lista08;

public class prefixadoEsquerda {

    public void PrefixadoEsquerda(ARVORE auxiliar) {

        if(auxiliar != null) {

            System.out.println(auxiliar.numero);
            PrefixadoEsquerda(auxiliar.esquerda);
            PrefixadoEsquerda(auxiliar.direita);

        }

    }

}
