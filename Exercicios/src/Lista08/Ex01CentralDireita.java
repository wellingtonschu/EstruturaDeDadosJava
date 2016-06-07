package Lista08;

public class Ex01CentralDireita {

    public static void centralDireita(Ex01ARVORE auxiliar) {

        if (auxiliar != null) {

            centralDireita(auxiliar.direita);
            System.out.println(auxiliar.valor);
            centralDireita(auxiliar.esquerda);

        }

    }

}
