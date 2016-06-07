package Lista08;

public class Ex01Main {

    public static void main(String[] args) {

        Ex01ARVORE arvore = new Ex01ARVORE();
        arvore.valor = 1;

        arvore.direita = new Ex01ARVORE();
        arvore.direita.valor = 3;

        arvore.direita.direita = new Ex01ARVORE();
        arvore.direita.direita.valor = 7;

        arvore.direita.esquerda = new Ex01ARVORE();
        arvore.direita.esquerda.valor = 6;

        arvore.esquerda = new Ex01ARVORE();
        arvore.esquerda.valor = 2;

        arvore.esquerda.esquerda = new Ex01ARVORE();
        arvore.esquerda.esquerda.valor = 4;

        arvore.esquerda.direita = new Ex01ARVORE();
        arvore.esquerda.direita.valor = 5;

        System.out.println("\nPré-Fixado Esquerda: ");
        Ex01PreFixadoEsquerda.preFixadoEsquerda(arvore);

        System.out.println("\nPré-Fixado Direita: ");
        Ex01PreFixadoDireita.preFixadoDireita(arvore);

        System.out.println("\nCentral Esquerda: ");
        Ex01CentralEsquerda.centralEsquerda(arvore);

        System.out.println("\nCentral Direita: ");
        Ex01CentralDireita.centralDireita(arvore);

        System.out.println("\nPós-Fixado Esquerda: ");
        Ex01PosFixadoEsquerda.posFixadoEsquerda(arvore);

        System.out.println("\nPós-Fixado Direita: ");
        Ex01PosFixadoDireita.posFixadoDireita(arvore);

    }

}
