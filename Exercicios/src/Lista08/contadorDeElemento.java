package Lista08;

public class contadorDeElemento {

    public int ContadorDeElemento(ARVORE auxiliar) {

        while (auxiliar != null) {

            return ContadorDeElemento(auxiliar.esquerda) + ContadorDeElemento(auxiliar.direita) + 1;

        }

        return 0;

    }

}
