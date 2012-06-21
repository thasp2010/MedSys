/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.util.List;

/**
 *
 * @author Thais
 */
public interface IRepositoryMedico  extends IRepository <Medico>{
    
    List <Medico> ListarPorNome (String nome);
    List <Medico> ListarPorCrm (String Crm);
    List<Medico>  ListarPorEspecialidade (String Especialidade);
}
