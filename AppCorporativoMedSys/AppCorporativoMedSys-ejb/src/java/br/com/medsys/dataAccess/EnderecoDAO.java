
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.Endereco;
import br.com.medsys.domainModel.IRepositoryEndereco;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class EnderecoDAO extends DAOGenerico <Endereco> implements IRepositoryEndereco {
    
    public EnderecoDAO(){
        super(Endereco.class);
    }

    @Override
    public List<Endereco> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Endereco> listarPorCidade(String Cidade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Endereco> listarPorcep(String CEP) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
