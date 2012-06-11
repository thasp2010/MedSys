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
public interface IRepository <T>{
    
  void salvar(T obj);
  T abrir (long id);
  void apagar (T obj);
  List<T> listarTodos();
    
    
}
