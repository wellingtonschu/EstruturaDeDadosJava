package Restaurante;

public class OrgRestaurante {

    private static class LISTA {

        private LISTA proximo;
        private int contador;

        public LISTA getProximo() {

            return proximo;

        }

        public void setProximo(LISTA proximo) {

            this.proximo = proximo;

        }

        public int getContador() {

            return contador;

        }

        public void setContador(int contador) {

            this.contador = contador;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static class FILABUFFET extends LISTA{

        private String nome;

        public String getNome() {

            return nome;

        }

        public void setNome(String nome) {

            this.nome = nome;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    FILABUFFET inicioBuffet = null;
    FILABUFFET fimBuffet = null;
    FILABUFFET auxiliarBuffet = null;

    public String inserirFilaBuffet(String nomeCliente) {

        StringBuilder builder = new StringBuilder();

        FILABUFFET novo = new FILABUFFET();

        novo.setNome(nomeCliente);

        if (inicioBuffet == null) {

            inicioBuffet = novo;
            fimBuffet = novo;

            novo.setProximo(null);

        } else {

            fimBuffet.setProximo(novo);
            fimBuffet = novo;
            novo.setProximo(null);

        }

        builder.append(nomeCliente + " inserido na fila do buffet");

        return builder.toString();

    }

    public String removerFilaBuffet() {

        StringBuilder builder = new StringBuilder();

        auxiliarBuffet = inicioBuffet;

        inicioBuffet = (FILABUFFET) auxiliarBuffet.getProximo();
        auxiliarBuffet = inicioBuffet;

        builder.append("Removido");

        return builder.toString();

    }

    public String selecinaPrimeiroElementoFilaBuffet() {

        return inicioBuffet.getNome();

    }

    public boolean checaFilaBuffet() {

        boolean possuiRegistroNaFilaBuffet = true;

        if (inicioBuffet == null) {

            possuiRegistroNaFilaBuffet = false;

        }

        return possuiRegistroNaFilaBuffet;
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static class FILACAIXA extends LISTA{

        private String nome;
        private int contadorPessoasCaixa;

        public String getNome() {

            return nome;

        }

        public void setNome(String nome) {

            this.nome = nome;

        }

        public int getContadorPessoasCaixa() {

            return contadorPessoasCaixa;

        }

        public void setContadorPessoasCaixa() {

            this.contadorPessoasCaixa = contadorPessoasCaixa;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    FILACAIXA inicioFilaCaixa = null;
    FILACAIXA fimFilaCaixa = null;
    FILACAIXA auxiliarFilaCAixa = null;

    FILACAIXA contador = new FILACAIXA();

    public String inserirFilaCaixa(String nomeCliente) {

        StringBuilder builder = new StringBuilder();

        FILACAIXA novo = new FILACAIXA();

        novo.setNome(nomeCliente);

        if (inicioFilaCaixa == null) {

            inicioFilaCaixa = novo;
            fimFilaCaixa = novo;
            novo.setProximo(null);

        } else {

            fimFilaCaixa.setProximo(novo);
            fimFilaCaixa = novo;
            fimFilaCaixa.setProximo(null);

        }

        builder.append("Inserido na fila do caixa");

        contador.setContador(contador.getContador() + 1);

        return builder.toString();

    }

    public String removerFilaCaixa() {

        StringBuilder builder = new StringBuilder();

        auxiliarFilaCAixa = inicioFilaCaixa;

        inicioFilaCaixa = (FILACAIXA) auxiliarFilaCAixa.getProximo();
        auxiliarFilaCAixa = inicioFilaCaixa;

        contador.setContador(contador.getContador() - 1);
        contador.setContadorPessoasCaixa(contador.getContadorPessoasCaixa() + 1);

        builder.append("Pagamento Efetuado");

        return builder.toString();

    }

    public int numeroPessoasFilaCaixa() {

        return contador.getContador();

    }

    public int numeroPessoasAtendidas() {

        return contador.getContadorPessoasCaixa();

    }

    public boolean checaFilaCaixa() {

        boolean possuiRegistroNaFilaCaixa = true;

        if (inicioBuffet == null) {

            possuiRegistroNaFilaCaixa = false;

        }

        return possuiRegistroNaFilaCaixa;
    }

    public String selecinaPrimeiroElementoFilaCaixa() {

        return inicioFilaCaixa.getNome();

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static class FILAESPERA extends LISTA {

        private String nome;

        public String getNome() {

            return nome;

        }

        public void setNome(String nome) {

            this.nome = nome;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    FILAESPERA inicioFilaEspera = null;
    FILAESPERA fimFilaEspera = null;
    FILAESPERA auxiliarFilaEspera = null;

    FILAESPERA contadorFilaEspera = new FILAESPERA();

    public String inserirFilaEspera(String nomeCliente) {

        StringBuilder builder = new StringBuilder();

        FILAESPERA novo = new FILAESPERA();

        novo.setNome(nomeCliente);

        if (inicioFilaEspera == null) {

            inicioFilaEspera = novo;
            fimFilaEspera = novo;
            novo.setProximo(null);

        } else {

            fimFilaEspera.setProximo(novo);
            fimFilaEspera = novo;
            fimFilaEspera.setProximo(null);

        }

        builder.append("Inserido na fila de espera");

        contador.setContador(contador.getContador() + 1);

        return builder.toString();

    }

    public String removerFilaEspera() {

        StringBuilder builder = new StringBuilder();

        auxiliarFilaEspera = inicioFilaEspera;
        inicioFilaEspera = (FILAESPERA) auxiliarFilaEspera.getProximo();
        auxiliarFilaEspera = inicioFilaEspera;

        contador.setContador(contador.getContador() - 1);

        builder.append("Removido");

        return builder.toString();

    }

    public int numeroPessoasFilaEspera() {

        return contador.getContador();

    }

    public String selecionaPrimeiroElementoFilaEspera() {

        return inicioFilaEspera.getNome();

    }

    public boolean checaFilaEspera() {

        boolean possuiRegistroNaFilaEspera = true;

        if (inicioBuffet == null) {

            possuiRegistroNaFilaEspera = false;

        }

        return possuiRegistroNaFilaEspera;

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static class LISTAMESAS extends LISTA {

        private String estadoListaMesas;
        private String nomeMesa;

        public String getEstadoListaMesas() {

            return estadoListaMesas;

        }

        public void setEstadoListaMesas() {

            this.estadoListaMesas = estadoListaMesas;

        }

        public String getNomeMesa() {

            return nomeMesa;

        }

        public void setNomeMesa() {

            this.nomeMesa = nomeMesa;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    LISTAMESAS inicioListaMesas = null;
    LISTAMESAS fimListaMesas = null;
    LISTAMESAS auxiliarListaMesas = null;

    LISTAMESAS contadorMesasDisponiveis = new LISTAMESAS();

    public void insereMesas() {

        contadorMesasDisponiveis.setContador(30);

        for (int i = 0; i < contadorMesasDisponiveis.getContador(); i++) {

            LISTAMESAS novo = new LISTAMESAS();

            novo.setEstadoListaMesas();



        }

    }

}
