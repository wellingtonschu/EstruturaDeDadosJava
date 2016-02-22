package Lista01;

public class Ex01 {

    public boolean validaAno(int dia, int mes, int ano){

        boolean verifica = false;

        if (mes==02){
            if (dia<=28){
                verifica = true;
            }
        }
        if ((ano%4==0)&&(ano%100!=0)||(ano%400==0)){
            if (dia<=29){
                verifica = true;
            }
        }
        if ((mes==04)||(mes==06)||(mes==9)||(mes==11)){
            if (dia<=30){
                verifica = true;
            }
        }
        if ((mes==01)||(mes==03)||(mes==05)||(mes==07)||(mes==8)||(mes==10)||(mes==12)){
            if (dia<=31){
                verifica = true;
            }
        }
        if (verifica==true)
            return true;
        else
            return false;
    }

    public boolean validaAnoString(String data){

        String datasplit[] = data.split("/");
        int dia = Integer.parseInt(datasplit[0]);
        int mes = Integer.parseInt(datasplit[1]);
        int ano = Integer.parseInt(datasplit[2]);
        boolean verifica = false;

        if (mes==02){
            if (dia<=28){
                verifica = true;
            }
        }
        if (ano%400 == 0){
            if (dia<=29){
                verifica = true;
            }
        }
        if ((mes==04)||(mes==06)||(mes==9)||(mes==11)){
            if (dia<=30){
                verifica = true;
            }
        }
        if ((mes==01)||(mes==03)||(mes==05)||(mes==07)||(mes==8)||(mes==10)||(mes==12)){
            if (dia<=31){
                verifica = true;
            }
        }
        if (verifica==true)
            return true;
        else
            return false;
    }

    public String escreveData(String data){

        String datasplit[] = data.split("/");
        int dia = Integer.parseInt(datasplit[0]);
        int mes = Integer.parseInt(datasplit[1]);
        int ano = Integer.parseInt(datasplit[2]);

        String stringMes = "Janeiro";

        if (mes==2)
            stringMes = "Fevereiro";
        if (mes==3)
            stringMes = "Março";
        if (mes==4)
            stringMes = "Abril";
        if (mes==5)
            stringMes = "Maio";
        if (mes==6)
            stringMes = "Junho";
        if (mes==7)
            stringMes = "Julho";
        if (mes==8)
            stringMes = "Agosto";
        if (mes==9)
            stringMes = "Setembro";
        if (mes==10)
            stringMes = "Outubro";
        if (mes==11)
            stringMes = "Novembro";
        if (mes==12)
            stringMes = "Dezembro";

        return dia+" de "+stringMes+" de "+ano;
    }
}