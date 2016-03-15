package ListasEncadeadas;

import java.util.*;

public class LDuplamente_Circular {

    //Definindo a classe que representar�
    //casa elemento da lista
    private static class LISTA {

        public int num;
        public LISTA prox;
        public LISTA ant;

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //a lista est� vazia
        // objeto inicio tem o valor null
        //o objeto inicio conter� o primeiro elemento da lista
        LISTA inicio = null;

        //o objeto fim conter� o ultimo elemento da lista
        LISTA fim = null;

        //O objeto aux � um objeto auxiliar
        LISTA aux = null;

        //objeto anterior� um objeto auxliar
        //menu de op��es
        int op=0;

        while(op!=6) {

            System.out.println("1 - Inserir no in�cio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Mostrar toda a lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar da lista");
            System.out.println("6 - Sair");
            System.out.println("Digite sua op��o");
            op = entrada.nextInt();

            if (op<1 || op>6) {

                System.out.println("Op��o inv�lida");

            }

            if (op == 1) {

                LISTA novo = new LISTA();

                System.out.println("Digite n�mero a ser inserido no in�cio da lista");
                novo.num = entrada.nextInt();

                if (inicio == null){
                    // a lista estava vazia e o elemento ser� o primeiro e o �litmo
                    inicio = novo;
                    fim = novo;
                    //aqui faz o encadeamento circular
                    novo.prox = inicio;
                    novo.ant = inicio;

                } else {
                    //a lista j� cont�m elementos e o novo elemento
                    //ser� inserido no in�cio da lista
                    novo.prox = inicio;
                    inicio.ant = novo;
                    novo.ant = fim;
                    fim.prox = novo;
                    inicio = novo;
                }
                System.out.println("N�mero inserido no in�cio da lista!!");
            }
            if (op == 2){
                System.out.println("Digite n�mero a ser inserido no fim da lista");
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null){
                    // a lista estava vazia e o elemento ser� o primeiro e o �litmo
                    inicio = novo;
                    fim = novo;
                    //aqui faz o encadeamento circular
                    novo.prox = inicio;
                    novo.ant = inicio;
                }
                else
                {
                    // a lista j� cont�m elementose o novo elemento ser� inserido
                    //no fim da lista
                    fim.prox = novo;
                    novo.ant = fim;
                    fim = novo;
                    fim.prox = inicio;
                    inicio.ant = fim;
                }
                System.out.println("N�mero inserido no fim da lista");

            }
            if (op ==3 ){
                if (inicio == null){
                    //a lista est� vazia
                    System.out.println("Lista vazia");
                }
                else
                {
                    //a lista cont�m elementos e estes ser�o mostrados
                    //do in�cio ao fim
                    System.out.println("Mostrando toda lista");
                    //modifi��o para mostrar a lista circular
                    aux = inicio;
                    do{
                        System.out.println(aux.num);
                        aux = aux.prox;
                    }while(aux !=inicio);
                }
            }
            if (op == 4){
                int achou = 0,numero;
                if (inicio == null){
                    //a lista est� vazia
                    System.out.println("Lista vazia");
                }
                System.out.println("Digite o elemento a ser removido");
                numero = entrada.nextInt();
                //todas as ocorr�ncias da lista, iguais ao n�mero digitado
                //ser�o removidas
                aux = inicio;
                //descobrindo a quantidade de elementos da lista
                int quantidade = 0;
                do{
                    quantidade++;
                    aux = aux.prox;
                }while(aux !=inicio);
                int elemento = 1;
                do{
                    //se a lista possui apenas um elemento
                    if (inicio ==fim && inicio.num == numero){
                        inicio = null;
                        achou = achou+1;
                    }
                    else
                    {
                        if (aux.num == numero){
                            //o numero digitado foi encontrado na lista
                            //e ser� removido
                            achou = achou+1;
                            if (aux == inicio){
                                //o numero a ser removido � o primeiro
                                //da lista
                                inicio = aux.prox;
                                inicio.ant = fim;
                                fim.prox = inicio;
                                aux = inicio;
                            }
                            else if(aux == fim)
                            {
                                //o numero a ser removido � o
                                //�ltimo da lista
                                fim = fim.ant;
                                fim.prox = inicio;
                                inicio.ant = fim;
                                aux = null;
                            }
                            else
                            {
                                //o n�mero a ser removido est�
                                //no meio da lista
                                aux.ant.prox = aux.prox;
                                aux.prox.ant = aux.ant;
                                aux = aux.prox;
                            }
                        }
                        else
                        {
                            aux = aux.prox;
                        }
                    }
                    elemento++;
                }while(elemento <=quantidade);

                if (achou == 0){
                    System.out.println("N�mero n�o encontrado");
                }
                else
                {
                    System.out.println("N�mero removido "+achou+" vezes");
                }
            }
            if (op == 5){
                if (inicio == null){
                    //a lista est� vazia
                    System.out.println("Lista vazia!!!");
                }
                else
                {
                    //a lista ser� esvaziada
                    inicio = null;
                    System.out.println("Lista Esvaziada");
                }
            }

        }

    }

}
