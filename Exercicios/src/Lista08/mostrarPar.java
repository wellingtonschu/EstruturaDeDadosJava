package Lista08;

public class mostrarPar {

    public void MostrarPar(ARVORE auxiliar) {

        while (auxiliar != null) {

            MostrarPar(auxiliar.esquerda);
            MostrarPar(auxiliar.direita);

            if (auxiliar.numero % 2 == 0) {

                System.out.println(auxiliar.numero);

            }

        }

    }

}
