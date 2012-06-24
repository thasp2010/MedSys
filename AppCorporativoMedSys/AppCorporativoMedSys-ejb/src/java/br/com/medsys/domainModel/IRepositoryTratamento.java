/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.util.Date;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Thais
 */
@Remote
public interface IRepositoryTratamento extends IRepository <Tratamento>{
    
    List <Tratamento> ListarPorData (Date DataTratamento);
    List <Tratamento> ListarPorPaciente (String NomePaciente);
    
}
