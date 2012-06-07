/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

/**
 *
 * @author Thais
 */
public interface IRepository <T>{
    
    boolean Salvar(T obj);
    boolean Apagar(T obj);
    T Abrir (long k)throws Exception;
    
    
}
