package Lista08;

public class folha {

    public void Folha(ARVORE auxiliar) {

        if (auxiliar != null) {

            Folha(auxiliar.direita);

            if (auxiliar.direita == null && auxiliar.esquerda == null) {

                System.out.println(auxiliar.numero);

            }

            Folha(auxiliar.esquerda);

            if (auxiliar.direita == null && auxiliar.esquerda == null) {

                System.out.println(auxiliar.numero);

            }

        }

    }

}
