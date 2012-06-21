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
public interface IRepositoryFuncionario extends IRepository <Funcionario> {
    
    List<Funcionario> ListarPorNome (String nome);
    List<Funcionario> ListarPorCpf (String Cpf);
}
