
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.Consulta;
import br.com.medsys.domainModel.IRepositoryConsulta;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Thais
 */
@Stateful

public class ConsultaDAO extends DAOGenerico <Consulta> implements  IRepositoryConsulta{
    
    public ConsultaDAO(){
        super(Consulta.class);
        
    }


    @Override
    public List listarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Consulta> ListarPorData(Date DataConsulta) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
