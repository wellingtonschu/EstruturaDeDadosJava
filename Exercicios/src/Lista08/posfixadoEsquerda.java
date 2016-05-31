package Lista08;

public class posfixadoEsquerda {

    public void PosfixadoEsquerda(ARVORE auxiliar) {

        if (auxiliar != null) {

            PosfixadoEsquerda(auxiliar.esquerda);
            PosfixadoEsquerda(auxiliar.direita);
            System.out.println(auxiliar.numero);

        }

    }

}
