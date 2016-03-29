package Restaurante;

public class Restaurante {

    private static class LISTAMESAS {

        public int quantidadeDeMesas;
        public LISTAMESAS proximo;

    }

    private static class FILAESPERA {

        public FILAESPERA proximo;

    }

    private static class FILABUFFET {

        public FILABUFFET proximo;

    }

    private static class FILACAIXA {

        public FILACAIXA prox;

    }

    private static class PILHAPRATOS {

        public PILHAPRATOS proximo;

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

}
