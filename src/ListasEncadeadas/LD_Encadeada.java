package ListasEncadeadas;

import java.util.*;

public class LD_Encadeada {
    //Definindo a classe que representar�
    //cada elemento da lista

    private static class LISTA{

        public int num;
        public LISTA prox;
        public LISTA ant;

    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        LISTA inicio = null;
        LISTA fim = null;
        LISTA aux = null;

        int op = 0,numero, achou;

        while (op!=7) {

            System.out.println("1 - Inserir no in�cio da lista");
            System.out.println("2 - Inserir no fim da lista");
            System.out.println("3 - Mostrar toda a lista do inicio ao fim");
            System.out.println("4 - Mostrar toda a lista do fim ao inicio");
            System.out.println("5 - Remover da lista");
            System.out.println("6 - Esvaziar da lista");
            System.out.println("7 - Sair");
            System.out.println("Digite sua op��o");
            op = entrada.nextInt();

            if (op<1 || op>7) {

                System.out.println("Op��o inv�lida");

            }

            if (op==1) {

                LISTA novo = new LISTA();

                System.out.println("Digite n�mero a ser inserido no in�cio da lista");
                novo.num = entrada.nextInt();

                if (inicio == null) {
                    //a lista esta vazia e o elemento
                    //inserido ser� o primeiro e o �ltimo

                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;

                } else {
                    //a lista j� cont�m elementos e o novo
                    //elemento ser� inserido no in�cio da lista

                    novo.prox = inicio;
                    inicio.ant = novo;
                    novo.ant = null;
                    inicio = novo;

                }

                System.out.println("N�mero inserido no in�cio da lista");

            }

            if (op == 2) {

                LISTA novo = new LISTA();

                System.out.println("Digite n�mero a ser inserido no fim da lista");
                novo.num = entrada.nextInt();

                if (inicio == null) {
                    //a lista esta vazia e o elemento
                    //inserido ser� o primeiro e o �ltimo
                    inicio = novo;
                    fim = novo;
                    novo.prox = null;
                    novo.ant = null;

                } else {
                    //a lista j� cont�m elementos e o novo
                    //elemento ser� inserido no fim da lista

                    fim.prox = novo;
                    novo.ant = fim;
                    novo.prox = null;
                    fim = novo;

                }

                System.out.println("N�mero inserido no fim da lista");

            }

            if (op == 3) {

                if (inicio == null) {

                    System.out.println("Lista vazia");

                } else {

                    // a lista cont�m elementos e estes
                    //ser�o mostrados do in�cio ao fim

                    System.out.println("Mostrando a lista do in�cio ao fim");
                    aux = inicio;

                    while (aux !=null) {

                        System.out.println(aux.num);
                        aux = aux.prox;

                    }

                }

            }

            if (op == 4) {

                if (inicio == null) {

                    System.out.println("Lista vazia");

                } else {

                    // a lista cont�m elementos e estes
                    //ser�o mostrados do fim ao inicio

                    System.out.println("Mostrando a lista do fim ao inicio");
                    aux = fim;

                    while (aux != null) {

                        System.out.println(aux.num);
                        aux = aux.ant;

                    }

                }

            }

            if (op == 5) {

                if (inicio == null) {

                    System.out.println("Lista vazia");

                } else {

                    //a lista cont�m elementos e o elemento a ser removido
                    //deve ser digitado

                    System.out.println("Digite elemento a ser removido");
                    numero = entrada.nextInt();

                    // todas as ocorr�ncias iguais ao n�mero digitado
                    //ser�o removidas

                    aux = inicio;
                    achou = 0;

                    while (aux != null) {

                        if (aux.num == numero) {

                            //o n�mero digitado foi encontrado na lista
                            //e ser� removido
                            achou = achou +1;

                            if (aux == inicio) {

                                //o n�mero a ser removido
                                //� o primeiro da lista
                                inicio = aux.prox;

                                if (inicio !=null) {

                                    inicio.ant = null;

                                }

                                aux = inicio;

                            } else if(aux == fim) {

                                //o n�mero a ser removido
                                //� o �ltimo da lista
                                fim = fim.ant;
                                fim.prox = null;
                                aux = null;

                            } else {

                                //o n�mero a ser removido
                                //est� no meio da lista
                                aux.ant.prox = aux.prox;
                                aux.prox.ant = aux.ant;
                                aux = aux.prox;

                            }

                        } else {

                            aux = aux.prox;

                        }

                    }

                    if (achou == 0) {

                        System.out.println("N�mero n�o encontrado");

                    } else {

                        System.out.println("N�mero removido "+achou+" vezes");

                    }

                }

            }

            if (op == 6) {

                if (inicio == null) {

                    //a lista est� vazia
                    System.out.println("Lista vazia");

                } else {

                    //a lista ser� esvaziada
                    inicio = null;
                    System.out.println("Lista esvaziada");

                }

            }

        }

    }

}
