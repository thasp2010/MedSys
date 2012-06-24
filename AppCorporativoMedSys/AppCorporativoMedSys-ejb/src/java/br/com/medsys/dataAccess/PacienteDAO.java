
package br.com.medsys.dataAccess;
import br.com.medsys.domainModel.IRepositoryPaciente;
import br.com.medsys.domainModel.Paciente;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class PacienteDAO extends DAOGenerico <Paciente> implements IRepositoryPaciente {
    
    public PacienteDAO(){
        super(Paciente.class);
    }

    @Override
    public List<Paciente> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Paciente> ListarPorNome(String Nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Paciente> ListarPorCpf(String Cpf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    

    
}
