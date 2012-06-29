
package br.com.medsys.presentation.console;

import br.com.medsys.domainModel.Funcionario;
import br.com.medsys.domainModel.IRepositoryFuncionario;
import br.com.medsys.domainModel.IRepositoryTratamento;
import br.com.medsys.domainModel.Tratamento;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Thais
 * @author Tarcísio
 */
public class Main {
    
     public static void main(String[] args) {
        try {
            
            Context context = new InitialContext();
            IRepositoryTratamento TratamentoEjb =(IRepositoryTratamento) context.lookup("java:global/AppCorporativoMedSys/AppCorporativoMedSys-ejb/TratamentoDAO");
            
               // context.lookup("java:global/AppCorporativoMedSys-ejb/UsuariosDAO");               
               
                    //("java:global/AppCorporativoMedSys-ejb/FuncionarioDAO");
             
          /*  Usuarios usuario = new Usuarios();
            usuario.setNome("Thais");
            usuario.setResponsavel("Tarcisio ");
            UsuariosEjb.salvar(usuario);*/
            
            Tratamento trat = new Tratamento();
            
            trat.setValor(1234);
            
            TratamentoEjb.salvar(trat);
        }catch (NamingException a)      {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,a);
        }
    
}
     }


