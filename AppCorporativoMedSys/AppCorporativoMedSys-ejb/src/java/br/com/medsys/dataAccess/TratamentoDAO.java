
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepositoryTratamento;
import br.com.medsys.domainModel.Tratamento;
import java.util.Date;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Thais
 */
@Stateless
@LocalBean
public class TratamentoDAO extends DAOGenerico <Tratamento> implements IRepositoryTratamento{
    
    public TratamentoDAO(){
        super(Tratamento.class);
    }

    @Override
    public List<Tratamento> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Tratamento> ListarPorData(Date DataTratamento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Tratamento> ListarPorPaciente(String NomePaciente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
