package Lista08;

public class posfixadoDireita {

    public void PosfixadoDireita(ARVORE auxiliar) {

        if (auxiliar != null) {

            PosfixadoDireita(auxiliar.direita);
            PosfixadoDireita(auxiliar.esquerda);
            System.out.println(auxiliar.numero);

        }

    }

}
