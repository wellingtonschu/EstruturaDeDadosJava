package Restaurante;

public class Restaurante {

    private static class LISTAMESAS {

        public int quantidadeDeMesas;
        public LISTAMESAS proximoListaMesas;

    }

    private static class FILAESPERA {

        public FILAESPERA proximoFilaEspera;
        public FILAESPERA fimFilaEspera;
        public FILAESPERA inicioFilaEspera;

    }

    private static class FILABUFFET {

        public FILABUFFET proximoFilaBuffet;

    }

    private static class FILACAIXA {

        public FILACAIXA proximoFilaCaixa;

    }

    private static class PILHAPRATOS {

        public PILHAPRATOS proximoPilhaPratos;

    }

    LISTAMESAS inicioListaDeMesas = null;
    LISTAMESAS fimListaDeMEsas = null;
    LISTAMESAS anteriorListaDeMesas = null;
    LISTAMESAS proximoListaDeMesas = null;
    LISTAMESAS auxiliarListaDeMesas = null;

    FILAESPERA inicioFilaEspera = null;
    FILAESPERA fimFilaEspera = null;
    FILAESPERA anteriorFilaEspera = null;
    FILAESPERA proximoFilaEspera = null;
    FILAESPERA auxiliarFilaEspera = null;

    FILABUFFET inicioFilaBuffet = null;
    FILABUFFET fimFilaBuffet = null;
    FILABUFFET anteriorFilaBuffet = null;
    FILABUFFET proximoFilaBuffet = null;
    FILABUFFET auxiliarFilaBuffet = null;

    FILACAIXA inicioFilaCaixa = null;
    FILACAIXA fimFilaCaixa = null;
    FILACAIXA anteriorFilaCaixa = null;
    FILACAIXA proximoFilaCaixa = null;
    FILACAIXA auxiliarFilaCaixa = null;

    PILHAPRATOS inicioPilhaPratos = null;
    PILHAPRATOS fimPilhaPratos = null;
    PILHAPRATOS anteriorPilhaPratos = null;
    PILHAPRATOS proximoPilhaPratos = null;
    PILHAPRATOS auxiliarPilhaPratos = null;

    public int inserirClienteListaDeEspera (int cliente) {

        FILAESPERA novo = new FILAESPERA();

        int contadorcClientes = 0;

        if (inicioFilaEspera == null) {

            inicioFilaEspera = novo;
            fimFilaEspera = novo;
            novo.proximoFilaEspera = null;

            contadorcClientes++;

        } else {

            proximoFilaEspera = novo;
            fimFilaEspera = novo;
            novo.proximoFilaEspera = null;

            contadorcClientes++;

        }

        cliente = contadorcClientes;

        return cliente;

    }

    public int inserirClienteFilaBuffet (int cliente) {

        FILABUFFET novo = new FILABUFFET();
        FILAESPERA espera = new FILAESPERA();

        int contadorBuffet = 0;

        if (inicioFilaBuffet == null) {

            espera.inicioFilaEspera = proximoFilaEspera;
            inicioFilaBuffet = novo;
            fimFilaBuffet = novo;
            novo.proximoFilaBuffet = null;

            contadorBuffet++;

        } else {

            espera.inicioFilaEspera = proximoFilaEspera;
            proximoFilaBuffet = novo;
            fimFilaBuffet = novo;
            novo.proximoFilaBuffet = null;

            contadorBuffet++;

        }

        cliente = contadorBuffet;

        return cliente;

    }

    public int escolherMesa (int cliente) {

        LISTAMESAS novo = new LISTAMESAS();
        FILABUFFET buffet = new FILABUFFET();



        return cliente;

    }

}
