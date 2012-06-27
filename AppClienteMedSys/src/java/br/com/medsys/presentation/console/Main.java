
package br.com.medsys.presentation.console;

import br.com.medsys.domainModel.Funcionario;
import br.com.medsys.domainModel.IRepositoryFuncionario;
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
            IRepositoryFuncionario FuncionarioEjb =(IRepositoryFuncionario) context.lookup("java:global/AppCorporativoMedSys/AppCorporativoMedSys-ejb/FuncionarioDAO");
            
               // context.lookup("java:global/AppCorporativoMedSys-ejb/UsuariosDAO");               
               
                    //("java:global/AppCorporativoMedSys-ejb/FuncionarioDAO");
             
          /*  Usuarios usuario = new Usuarios();
            usuario.setNome("Thais");
            usuario.setResponsavel("Tarcisio ");
            UsuariosEjb.salvar(usuario);*/
            
            Funcionario func = new Funcionario();
            func.setNome("Tarcisio");
            func.setCpf("80984059840");
            func.setEndereco("Rua 2");
            FuncionarioEjb.salvar(func);
        }catch (NamingException a)      {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,a);
        }
    
}
     }


