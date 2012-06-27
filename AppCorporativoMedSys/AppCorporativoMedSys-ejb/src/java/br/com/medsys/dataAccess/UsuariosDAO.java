
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepositoryUsuarios;
import br.com.medsys.domainModel.Usuarios;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful
public class UsuariosDAO extends DAOGenerico <Usuarios> implements IRepositoryUsuarios {

    public UsuariosDAO(){
        
        super(Usuarios.class);
    }

    @Override
    public List<Usuarios> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuarios> ListarPorNome(String NomeUsuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
