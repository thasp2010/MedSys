/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appclientemedsys;

import br.com.medsys.domainModel.IRepositoryFuncionario;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Thais
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        IRepositoryFuncionario ejb = (IRepositoryFuncionario)ctx.lookup("java:global/AppCorporativoMedSys/AppCorporativoMedSys-ejb/FuncionarioDAO");
    }
}
