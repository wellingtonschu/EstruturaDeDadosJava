package ListasEPilhas.Ex01;

public class SalaDeAula {

    private static class PILHA {

        public int id;
        public String nome;
        public PILHA proximo;

    }

    private static class FILA {

        public int id;
        public double nota;
        public FILA proximo;

    }

    PILHA inicioPilha = null;
    PILHA fimPilha = null;
    PILHA auxiliarPilha = null;
    PILHA anteriorPilha = null;

    FILA inicioFila = null;
    FILA fimFila = null;
    FILA auxiliarFila =null;
    FILA anteriorFila = null;

    int idBase = 1;

    public String menu (){

        StringBuilder builder = new StringBuilder();

        builder.append("1- Cadastrar aluno");
        builder.append("\n2- Cadastrar nota");
        builder.append("\n3- Calcular média de um aluno");
        builder.append("\n4- Listar os nomes dos alunos sem notas");
        builder.append("\n5- Excluir aluno");
        builder.append("\n6- Excluir nota");
        builder.append("\n7- Sair");

        return builder.toString();

    }

    public String mensagemOpcaoInvalida () {

        StringBuilder builder = new StringBuilder();

        builder.append("Informe uma opção válida");

        return builder.toString();

    }

    public String cadastraAluno (String aluno) {

        PILHA novo = new PILHA();
        StringBuilder builder = new StringBuilder();

        novo.id = idBase;

        builder.append("Nome do aluno: ");
        novo.nome = aluno;

        if (inicioPilha == null) {

            inicioPilha = novo;
            fimPilha = novo;
            novo.proximo = null;

        } else {

            novo.proximo = inicioPilha;
            inicioPilha = novo;

        }

        builder.append("Aluno cadastrado");

        return builder.toString();

    }

    public String cadastraNota (int buscaID, int nota) {

        FILA novo = new FILA();
        StringBuilder builder = new StringBuilder();

        builder.append("Id do Aluno: ");

        auxiliarPilha = inicioPilha;

        boolean alunoEncontrado = false;

        while (auxiliarPilha != null) {

            if (buscaID == auxiliarPilha.id) {

                builder.append(auxiliarPilha.nome);

            } else {

                auxiliarPilha = auxiliarPilha.proximo;

            }

        }

        return builder.toString();
    }

}
