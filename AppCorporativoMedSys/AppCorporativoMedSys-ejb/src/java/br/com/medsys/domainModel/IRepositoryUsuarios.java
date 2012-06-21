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
public interface IRepositoryUsuarios extends IRepository <Usuarios> {
    
    List <Usuarios> ListarPorNome (String NomeUsuario);
    
}
