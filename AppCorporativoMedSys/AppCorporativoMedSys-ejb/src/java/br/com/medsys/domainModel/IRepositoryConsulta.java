/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Thais
 */
public interface IRepositoryConsulta extends IRepository <Consulta> {
    
    List <Consulta> ListarPorData (Date DataConsulta);
}
