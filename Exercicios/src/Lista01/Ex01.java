package Lista01;

public class Ex01 {

    // dados aceitos no calendario como dia mes e ano
    public int dia;
    public int mes;
    public int ano;
    public String StrNome;

    // pra transformar o mês em data escrita por extenso sendo ingual ao mes jogar por extenso
    public void NomeMes() {
        if (mes == 1) {
            StrNome = "Janeiro";
        }
        if (mes == 2) {
            StrNome = "Fevereiro";
        }
        if (mes == 3) {
            StrNome = "Março";
        }
        if (mes == 4) {
            StrNome = "Abril";
        }
        if (mes == 5) {
            StrNome = "Maio";
        }
        if (mes == 6) {
            StrNome = "Junho";
        }
        if (mes == 7) {
            StrNome = "Julho";
        }
        if (mes == 8) {
            StrNome = "Agosto";
        }
        if (mes == 9) {
            StrNome = "Setembro";
        }
        if (mes == 10) {
            StrNome = "Outubro";
        }
        if (mes == 11) {
            StrNome = "Novembro";
        }
        if (mes == 12) {
            StrNome = "Dezembro";
        }
    }

    // verifica se a data está correta
    public boolean verifica() {
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)&& (dia <= 30 && dia > 0))
            return true;
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8|| mes == 10 || mes == 12)&&(dia <= 31 && dia > 0))
            return true;
        if (mes == 2 && dia <= 28 && dia > 0 && ano % 4 != 0)
            return true;
        if (mes == 2 && dia <= 29 && dia > 0 && ano % 4 == 0)
            return true;
        else
            return false;
    }


    public void transforma(String data) {
        String[] stringDividido = data.split("/");//quebra a String
        this.dia = Integer.parseInt(stringDividido[0]);
        this.mes = Integer.parseInt(stringDividido[1]);
        this.ano = Integer.parseInt(stringDividido[2]);
    }

}