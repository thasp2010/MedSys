/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Thais
 */
@Remote
public interface IRepositoryPaciente extends IRepository<Paciente>{
    
    List <Paciente> ListarPorNome (String Nome);
    List <Paciente> ListarPorCpf (String Cpf );
    
    
}
