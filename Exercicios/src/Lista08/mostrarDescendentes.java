package Lista08;

public class mostrarDescendentes {

    public void MostrarDescendentes(ARVORE auxiliar, int numero, boolean mostrar) {

        while (auxiliar != null) {

            if (auxiliar.numero == numero) {

                MostrarDescendentes(auxiliar.esquerda, numero, true);
                MostrarDescendentes(auxiliar.direita, numero, true);

            } else {

                MostrarDescendentes(auxiliar.esquerda, numero, mostrar);
                MostrarDescendentes(auxiliar.direita, numero, mostrar);

            }

            if (mostrar) {

                System.out.println(auxiliar.numero);

            }

        }

    }

}
