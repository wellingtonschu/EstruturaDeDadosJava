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

        public void setContadorPessoasCaixa(int contadorPessoasCaixa) {

            this.contadorPessoasCaixa = contadorPessoasCaixa;

        }

    }

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

    private static class LISTAMESAS extends LISTA {

        private String estadoListaMesas;
        private String nomeMesa;

        public String getEstadoListaMesas() {

            return estadoListaMesas;

        }

        public void setEstadoListaMesas(String estadoListaMesas) {

            this.estadoListaMesas = estadoListaMesas;

        }

        public String getNomeMesa() {

            return nomeMesa;

        }

        public void setNomeMesa(String nomeMesa) {

            this.nomeMesa = nomeMesa;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static class PILHAPRATOS extends LISTA {

        private int numeroPratos;

        public int getNumeroPratos() {

            return numeroPratos;

        }

        public void setNumeroPratos(int numeroPratos) {

            this.numeroPratos = numeroPratos;

        }

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    FILABUFFET inicioBuffet = null;
    FILABUFFET fimBuffet = null;
    FILABUFFET auxiliarBuffet = null;

    FILACAIXA inicioFilaCaixa = null;
    FILACAIXA fimFilaCaixa = null;
    FILACAIXA auxiliarFilaCAixa = null;
    FILACAIXA contador = new FILACAIXA();

    FILAESPERA inicioFilaEspera = null;
    FILAESPERA fimFilaEspera = null;
    FILAESPERA auxiliarFilaEspera = null;

    LISTAMESAS inicioListaMesas = null;
    LISTAMESAS fimListaMesas = null;
    LISTAMESAS auxiliarListaMesas = null;
    LISTAMESAS contadorMesasDisponiveis = new LISTAMESAS();

    PILHAPRATOS topoPilhaPratos = null;
    PILHAPRATOS basePilhaPratos = null;
    PILHAPRATOS auxiliarPilhaPratos = null;
    PILHAPRATOS contadorPilhaPratos = new PILHAPRATOS();
    PILHAPRATOS novo = new PILHAPRATOS();

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


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

    public void insereMesas() {

        contadorMesasDisponiveis.setContador(30);

        for (int i = 0; i < contadorMesasDisponiveis.getContador(); i++) {

            LISTAMESAS novo = new LISTAMESAS();

            novo.setEstadoListaMesas("LIVRE");

            novo.setNomeMesa("MESA: " + (contadorMesasDisponiveis.getContador() - 1));

            if (i == 0) {

                inicioListaMesas = novo;
                fimListaMesas = novo;
                novo.setProximo(null);

            } else {

                fimListaMesas.setProximo(novo);
                fimListaMesas = novo;
                fimListaMesas.setProximo(null);

            }

        }

    }

    public String ocuparMesa(String mesa) {

        StringBuilder builder = new StringBuilder();

        auxiliarListaMesas = inicioListaMesas;

        boolean ocupacaoMesa = false;

        while (auxiliarListaMesas != null && ocupacaoMesa == false) {

            if (auxiliarListaMesas.getNomeMesa().equals(mesa) && auxiliarListaMesas.getEstadoListaMesas().equals("LIVRE")) {

                auxiliarListaMesas.setEstadoListaMesas("Ocupada");
                auxiliarListaMesas = (LISTAMESAS) auxiliarListaMesas.getProximo();
                ocupacaoMesa = true;

            } else {

                auxiliarListaMesas = (LISTAMESAS) auxiliarListaMesas.getProximo();

            }

        }

        if (ocupacaoMesa == false) {

            contadorMesasDisponiveis.setContador(contadorMesasDisponiveis.getContador() - 1);
            builder.append("LIVRE");

        } else {

            builder.append("Mesa nao encontrada");

        }

        return builder.toString();

    }

    public String liberaMesa(String mesa) {

        StringBuilder builder = new StringBuilder();

        auxiliarListaMesas = inicioListaMesas;

        boolean mesaLiberada = false;

        while (auxiliarListaMesas != null && mesaLiberada == true) {

            if (auxiliarListaMesas.getNomeMesa().equals(mesa)) {

                auxiliarListaMesas.setEstadoListaMesas("LIVRE");
                auxiliarListaMesas = (LISTAMESAS) auxiliarListaMesas.getProximo();
                mesaLiberada = true;

            } else {

                auxiliarListaMesas = (LISTAMESAS) auxiliarListaMesas.getProximo();

            }

        }

        if (mesaLiberada == true) {

            contadorMesasDisponiveis.setContador(contadorMesasDisponiveis.getContador() + 1);
            builder.append("LIVRE");

        } else {

            builder.append("Mesa nao encontrada");

        }

        return builder.toString();

    }

    public int numeroMesasLiberadas() {

        return contadorMesasDisponiveis.getContador();

    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void adicionarPratos() {

        contadorPilhaPratos.setContador(30);

       for (int i = 0; i < contadorPilhaPratos.getContador(); i++) {

           novo = new PILHAPRATOS();

           novo.setNumeroPratos(i + 1);

           if (i == 0) {

               topoPilhaPratos = novo;
               basePilhaPratos = novo;
               novo.setProximo(null);

           } else {

               novo.setProximo(topoPilhaPratos);
               topoPilhaPratos = novo;

           }

       }

    }

    public String reposicaoPratos (int numeroPratos) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numeroPratos; i++) {

            novo = new PILHAPRATOS();

            novo.setNumeroPratos(contadorPilhaPratos.getContador() + i + 1);

            if (topoPilhaPratos == null) {

                topoPilhaPratos = novo;
                basePilhaPratos = novo;
                novo.setProximo(null);

            } else {

                novo.setProximo(topoPilhaPratos);
                topoPilhaPratos = novo;

            }

            contadorPilhaPratos.setContador(contadorPilhaPratos.getContador() + 1);

        }

        builder.append("Pratos repostos");

        return builder.toString();

    }

    public String retirarPrato() {

        StringBuilder builder = new StringBuilder();

        auxiliarPilhaPratos = topoPilhaPratos;
        topoPilhaPratos = (PILHAPRATOS) auxiliarPilhaPratos.getProximo();
        auxiliarPilhaPratos = topoPilhaPratos;

        contadorPilhaPratos.setContador(contadorPilhaPratos.getContador() - 1);

        builder.append("Prato utilizado");

        return builder.toString();

    }

    public boolean checaPilhaPratos() {

        boolean pilhaContemPratos = true;

        if (topoPilhaPratos  == null) {

            pilhaContemPratos = false;

        }

        return pilhaContemPratos;

    }

}
