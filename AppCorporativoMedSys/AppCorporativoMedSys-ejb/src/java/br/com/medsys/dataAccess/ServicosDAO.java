
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepositoryServicos;
import br.com.medsys.domainModel.Servicos;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class ServicosDAO extends DAOGenerico <Servicos> implements IRepositoryServicos {

    public ServicosDAO(){
        super(Servicos.class);
    }

    @Override
    public List<Servicos> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Servicos> ListarPorNome(String Nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
