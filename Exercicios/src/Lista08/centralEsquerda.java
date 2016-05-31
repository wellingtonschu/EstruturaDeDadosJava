package Lista08;

public class centralEsquerda {

    public void CentralEsquerda(ARVORE auxiliar) {

        if (auxiliar != null) {

            CentralEsquerda(auxiliar.esquerda);
            System.out.println(auxiliar.numero);
            CentralEsquerda(auxiliar.direita);

        }

    }

}
