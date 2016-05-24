package Arvores;

import java.util.*;

public class Arvore_Binaria_Recursiva {

    //definindo a classe que representará
    //cada elemento da árvore binária
    private static class ARVORE{
        public int num;
        public ARVORE dir,esq;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //a árvore está vazia,logo, o objeto raiz tem valor nulo
        ARVORE raiz = null;
        //o objeto aux é um objeto auxiliar
        ARVORE aux;
        int op=0,achou,numero;
        while (op!=6){
            System.out.println("Menu de opções");
            System.out.println("1- Inserir na árvore");
            System.out.println("2- Consultar um nó da árvore");
            System.out.println("3- Consultar toda a árvore em ordem");
            System.out.println("4- Excluir um nó da árvore");
            System.out.println("5- Esvaziar a árvore");
            System.out.println("6- Menor nodo");
            System.out.println("7- Maior nodo");
            System.out.println("6- Sair");
            System.out.println("Digite opção");
            op = entrada.nextInt();
            if (op==1){
                System.out.println("Digite número a ser inserido na árvore");
                numero = entrada.nextInt();
                raiz = inserir(raiz,numero);
                System.out.println("Número inserido na árvore");
            }
            if (op==2){
                if (raiz == null){
                    System.out.println("Árvore vazia");
                }
                else{
                    //a árvore contém elementos
                    System.out.println("Digite elemento a ser consultado");
                    numero = entrada.nextInt();
                    achou = 0;
                    achou = consultar(raiz,numero,achou);
                    if (achou==0){
                        System.out.println("Número não encontrado na árvore");
                    }
                    else{
                        System.out.println("Número encontrado na árvore");
                    }
                }
            }
            if (op == 3){
                if (raiz==null){
                    System.out.println("Árvore vazia");
                }
                else{
                    //a arvore contém elementos e estes serão
                    //mostrados em ordem
                    System.out.println("Listando todos os elementos da árvore em ordem");
                    mostraremordem(raiz);
                }
                System.out.println();

            }
            if (op == 4){
                if (raiz == null){
                    System.out.println("Árvore vazia");
                }
                else{
                    System.out.println("Digite o número que deseja excluir");
                    numero =  entrada.nextInt();
                    achou = 0;
                    achou = consultar(raiz,numero,achou);
                    if (achou == 0){
                        System.out.println("Número não encontrado na árvore");
                    }
                    else{
                        raiz = remover(raiz,numero);
                        System.out.println("Número excluido da árvore");
                    }
                }
            }
            if (op == 5){
                if (raiz == null){
                    System.out.println("Árvore vazia");
                }
                else
                {
                    raiz = null;
                    System.out.println("Árvore esvaziada");
                }
            }
            if (op == 6){
                if (raiz==null){
                    System.out.println("Árvore vazia");
                }
                else{
                    //a arvore contém elementos e estes serão
                    //mostrados em ordem
                    System.out.println("Listando todos os elementos da árvore em ordem");
                    consultarMenor(raiz);
                }
                System.out.println();
            }
        }
    }
    public static ARVORE inserir(ARVORE aux, int num){
        if (aux == null){
            aux = new ARVORE();
            aux.num = num;
            aux.esq = null;
            aux.dir = null;
        } else {
            if (num < aux.num){
                aux.esq = inserir(aux.esq,num);
            }else{
                aux.dir = inserir(aux.dir,num);
            }
        }
        return aux;
    }
    public static int consultar(ARVORE aux,int num, int achou){
        if (aux !=null && achou == 0){
            if (aux.num == num){
                achou = 1;
            }
            else if (num < aux.num)
                achou = consultar(aux.esq,num,achou);
            else
                achou = consultar(aux.dir,num,achou);
        }
        return achou;
    }
    public static void mostraremordem(ARVORE aux){
        if (aux!=null){
            mostraremordem(aux.esq);
            System.out.print(aux.num+" ");
            mostraremordem(aux.dir);
        }
    }
    public static ARVORE remover(ARVORE aux, int num){
        ARVORE p, p2;
        if (aux.num == num){
            if (aux.esq == aux.dir){
                //o elemento a ser removido não tem filhos
                return null;
            }
            else if(aux.esq == null){
                //o elemento a ser removido não tem filho
                //para esquerda
                return aux.dir;
            }
            else if (aux.dir == null){
                //o elemento a ser removido não tem filho
                //para direita
                return aux.esq;
            }
            else{
                //o elemento a ser removido tem filhos
                //para ambos os lados
                p2 = aux.dir;
                p = aux.dir;
                while (p.esq !=null){
                    p=p.esq;
                }
                p.esq = aux.esq;
                return p2;
            }
        }
        else if (aux.num < num){
            aux.dir = remover(aux.dir,num);
        }
        else{
            aux.esq = remover(aux.esq,num);
        }

        return aux;
    }

    public static void consultarMenor(ARVORE aux){
        if (aux!=null){
            consultarMenor(aux.esq);
        }
    }

}
