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
public interface IRepositoryEndereco implements IRepository<Endereco>{
    
    List<Endereco> getTodos(){
    
        return Endereco;
    }
    
    
}
