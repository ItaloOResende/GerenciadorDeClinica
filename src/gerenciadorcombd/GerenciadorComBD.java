/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadorcombd;

import Utilitarios.conectaBanco;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Italo O
 */
public class GerenciadorComBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date DataAtual=new Date(),DataInicial;
        DataInicial = DateFormat.parse("03-11-2012");
        System.out.println(DataAtual+"\n"+DataInicial);
        if(DataInicial.before(DataAtual)){
            conectaBanco conexao=new conectaBanco();
            conexao.conexaoInicial();
        }       
    }    
}
