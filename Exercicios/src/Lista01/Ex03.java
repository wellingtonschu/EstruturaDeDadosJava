package Lista01;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {

    /*protected List<Cliente> cliente;

    public Ex3(){

        cliente = new ArrayList<Cliente>();
    }

    public void incluirCliente(String nome, int anoNascimento, double renda){
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setAnoNascimento(anoNascimento);
        cli.setRenda(renda);
        cliente.add(cli);
    }

    public String consultarCliente(String nome){
        String texto = "";
        for (int x = 0; x < cliente.size(); x++){
            if (nome.equals(cliente.get(x).getNome())){
                texto = texto + " Nome: " + cliente.get(x).getNome() + "; Ano de Nascimento: " + cliente.get(x).getAnoNascimento() + "; Renda: " + cliente.get(x).getRenda();
            }
        }
        return texto;
    }

    public void excluirCliente(String nome){
        for (int x = 0; x < cliente.size(); x++){
            if (nome.equals(cliente.get(x).getNome())){
                cliente.remove(x);
            }
        }
    }

    public int rendaAcimaMedia(){
        double media = 0;
        int cont = 0;
        for (int x = 0; x < cliente.size(); x++){
            media=media + cliente.get(x).getRenda();
        }
        media=media/cliente.size();
        for (int x = 0; x < cliente.size(); x++){
            if(cliente.get(x).getRenda() > media)
                cont++;
        }
        return cont;
    }

    public int numeroClientesNascimento(){
        int cont = 0;
        for (int x = 0; x < cliente.size(); x++){
            if((cliente.get(x).getAnoNascimento() > 1980) && (cliente.get(x).getAnoNascimento() < 2000))
                cont++;
        }
        return cont;
    }
*/
}
