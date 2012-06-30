
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepositoryUsuarios;
import br.com.medsys.domainModel.Usuarios;
import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.Query;

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
        Query query = manager.createQuery("select u from Usuarios u");
        return query.getResultList();
    }

    @Override
    public List<Usuarios> ListarPorNome(String NomeUsuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
