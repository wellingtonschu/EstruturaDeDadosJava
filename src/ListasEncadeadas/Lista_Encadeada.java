package ListasEncadeadas;

import java.util.*;

public class Lista_Encadeada {

    //Definindo a classe que representar�
    //casa elemento da lista
    private static class LISTA{
        public int num;
        public LISTA prox;
    }
    public static void main(String[] args) {
        //a lista est� vazia
        Scanner entrada = new Scanner(System.in);
        // objeto inicio tem o valor null
        //o objeto inicio conter� o primeiro elemento da lista
        LISTA inicio = null;
        //o objeto fim conter� o ultimo elemento da lista
        LISTA fim = null;
        //O objeto aux � um objeto auxiliar
        LISTA aux = null;
        //objeto anterior� um objeto auxliar
        LISTA anterior = null;
        //menu de op��es
        int op=0;
        while(op!=6){
            System.out.println("1 - Inserir no in�cio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Mostrar toda a lista");
            System.out.println("4 - Remover da lista");
            System.out.println("5 - Esvaziar da lista");
            System.out.println("6 - Contar nodos");
            System.out.println("7 - Altura do Nodo");
            System.out.println("8 - Profundidade do Nodo");
            System.out.println("9 - Sair");
            System.out.println("Digite sua op��o");
            op = entrada.nextInt();
            if (op<1 || op>9){
                System.out.println("Op��o inv�lida");
            }
            if (op == 1){
                System.out.println("Digite n�mero a ser inserido no in�cio da lista");
                LISTA novo = new LISTA();
                novo.num = entrada.nextInt();
                if (inicio == null){
                    // a lista estava vazia e o elemento ser� o primeiro e o �litmo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                }
                else
                {
                    //a lista j� cont�m elementos e o novo elemento
                    //ser� inserido no in�cio da lista
                    novo.prox = inicio;
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
                    novo.prox = null;
                }
                else
                {
                    // a lista j� cont�m elementose o novo elemento ser� inserido
                    //no fim da lista
                    fim.prox = novo;
                    fim = novo;
                    fim.prox = null;
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
                    aux = inicio;
                    while(aux != null){
                        System.out.println(aux.num);
                        aux = aux.prox;
                    }
                }
            }
            if (op == 4){

                if (inicio == null){
                    //a lista est� vazia
                    System.out.println("Lista vazia");
                }
                else
                {
                    //a lista cont�m elementos e o elemento a ser
                    //removido deve ser digitado
                    int numero, achou = 0;
                    System.out.println("Digite numero a ser removido");
                    numero = entrada.nextInt();
                    //todas as ocorr�ncias da lista, iguais ao n�mero digitado,
                    //ser�o removidas
                    aux = inicio;
                    anterior = null;
                    while (aux != null){
                        if (aux.num == numero){
                            //o n�mero digitado foi encontrado na lista e ser� removido
                            achou = achou+1;
                            if (aux == inicio){
                                //o numeor a ser removido � o primeiro da lista
                                inicio = aux.prox;
                                aux = inicio;
                            }
                            else if(aux == fim){
                                //o numero a ser removido � o �ltimo da lista
                                anterior.prox = null;
                                fim = anterior;
                                aux = null;
                            }
                            else
                            {
                                //o numero a ser removido est� no meio da lista
                                anterior.prox = aux.prox;
                                aux = aux.prox;
                            }
                        }
                        else
                        {
                            anterior = aux;
                            aux = aux.prox;
                        }
                    }
                    if (achou == 0){
                        System.out.println("N�mero n�o encontrado");
                    }
                    else
                    {
                        System.out.println("N�mero removido "+achou+" vezes");
                    }
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

            if (op == 6){
                int contador = 0;

                if (inicio == null){
                    //não existem nodos
                    System.out.println("Lista vazia, 0 nodos");
                }
                else
                {
                    aux = inicio;
                    while(aux != null){
                        contador ++;
                        aux = aux.prox;
                    }
                    System.out.println("Quantidade de nodos: " + contador);
                }
            }

            if(op == 7){
                int posicao = 0;
                int contador = 0;
                System.out.println("Informe a posição inicial para definir a altura: ");
                posicao = entrada.nextInt();

                if (inicio == null){
                    System.out.println("Não exisytem nodos");
                }else
                    aux = inicio;
                while (aux != null) {
                    contador++;
                    aux = aux.prox;
                }

                if (posicao <= contador){
                    int alturaNodo = contador - posicao;
                    System.out.println("A altura entre o nodo " + posicao + "e o fim da lista é de: " + alturaNodo);
                }else {
                    System.out.println("Insira uma posição menor que a quantidade de nodos");
                }

            }

            if(op == 8){
                int posicao = 0;
                int contador = 0;
                System.out.println("Informe a posição final para definir a profundidade: ");
                posicao = entrada.nextInt();

                if (inicio == null){
                    System.out.println("Não existem nodos");
                }else
                    aux = inicio;
                while (aux != null) {
                    contador++;
                    aux = aux.prox;
                }

                if (posicao <= contador){
                    int profundidadeNodo = posicao - 1;
                    System.out.println("A profundida  é de: " + profundidadeNodo);
                }else {
                    System.out.println("Insira uma posição menor que a quantidade de nodos");
                }

            }

            if (op == 9){

            }


        }

    }

}