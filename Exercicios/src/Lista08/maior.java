package Lista08;

public class maior {

    public void Maior(ARVORE auxiliar) {

        if (auxiliar != null) {

            Maior(auxiliar.direita);

            if (auxiliar.direita == null) {

                System.out.println(auxiliar.numero);

            }

        }

    }

}
