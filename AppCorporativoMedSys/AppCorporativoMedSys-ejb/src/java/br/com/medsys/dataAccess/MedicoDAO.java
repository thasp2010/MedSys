
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepositoryMedico;
import br.com.medsys.domainModel.Medico;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class MedicoDAO extends DAOGenerico <Medico> implements IRepositoryMedico{

    public MedicoDAO(){
        super(Medico.class);
    }
    
    @Override
    public List<Medico> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Medico> ListarPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Medico> ListarPorCrm(String Crm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Medico> ListarPorEspecialidade(String Especialidade) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
