
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.Funcionario;
import br.com.medsys.domainModel.IRepositoryFuncionario;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class FuncionarioDAO extends DAOGenerico <Funcionario> implements IRepositoryFuncionario {

    public FuncionarioDAO(){
        super(Funcionario.class);
    }

    @Override
    public List<Funcionario> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Funcionario> ListarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Funcionario> ListarPorCpf(String Cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
