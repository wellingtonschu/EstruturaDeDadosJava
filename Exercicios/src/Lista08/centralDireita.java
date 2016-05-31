package Lista08;

public class centralDireita {

    public void CentralDireita(ARVORE auxiliar) {

        if (auxiliar != null) {

            CentralDireita(auxiliar.direita);
            System.out.println(auxiliar.numero);
            CentralDireita(auxiliar.esquerda);

        }

    }

}
