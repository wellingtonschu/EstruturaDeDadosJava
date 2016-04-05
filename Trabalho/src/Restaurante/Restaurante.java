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
        public FILABUFFET inicioFilaBuffet;
        public FILABUFFET FfimFilaBuffet;

    }

    private static class FILACAIXA {

        public FILACAIXA proximoFilaCaixa;

    }

    private static class PILHAPRATOS {

        public PILHAPRATOS proximoPilhaPratos;
        public PILHAPRATOS inicioPilhaPratos;
        public PILHAPRATOS fimPilhaPratos;
        public PILHAPRATOS auxiliarPilhaPratos;
        public PILHAPRATOS anteriorPilhaPratos;

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

    public int inserirPilhaPratos (int pratos) {

        PILHAPRATOS novo = new PILHAPRATOS();

        if (inicioPilhaPratos == null) {

            inicioPilhaPratos = novo;
            fimPilhaPratos = novo;
            novo.proximoPilhaPratos = null;

        } else {

            novo.proximoPilhaPratos = inicioPilhaPratos;
            inicioPilhaPratos = novo;

        }

        return pratos;
    }

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
        PILHAPRATOS pratos = new PILHAPRATOS();

        int contadorBuffet = 0;

        if (inicioFilaBuffet == null) {

            espera.inicioFilaEspera = proximoFilaEspera;
            inicioFilaBuffet = novo;
            fimFilaBuffet = novo;
            novo.proximoFilaBuffet = null;

            pratos.fimPilhaPratos = null;
            pratos.fimPilhaPratos = anteriorPilhaPratos;

            contadorBuffet++;

        } else {

            espera.inicioFilaEspera = proximoFilaEspera;
            proximoFilaBuffet = novo;
            fimFilaBuffet = novo;
            novo.proximoFilaBuffet = null;

            pratos.fimPilhaPratos = null;
            pratos.fimPilhaPratos = anteriorPilhaPratos;

            contadorBuffet++;

        }

        cliente = contadorBuffet;

        return cliente;

    }

    public int escolherMesa (int cliente, int quantMesas) {

        LISTAMESAS novo = new LISTAMESAS();
        FILABUFFET buffet = new FILABUFFET();

        int contadorMesas = quantMesas;

        if (inicioListaDeMesas == null) {

            buffet.inicioFilaBuffet = proximoFilaBuffet;

            contadorMesas--;

        } else {

            buffet.inicioFilaBuffet = proximoFilaBuffet;

            contadorMesas--;

        }

        return contadorMesas;

    }

}
