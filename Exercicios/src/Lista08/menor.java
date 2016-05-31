package Lista08;

public class menor {

    public void Menor(ARVORE auxiliar) {

        if (auxiliar != null) {

            Menor(auxiliar.esquerda);

            if (auxiliar.esquerda == null) {

                System.out.println(auxiliar.numero);

            }

        }

    }

}
