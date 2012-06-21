/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.dataAccess;

import br.com.medsys.domainModel.IRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thais
 */
public abstract class DAOGenerico <T> implements IRepository <T> {
    
    public DAOGenerico(Class tip){
        tipo=tip;
    }
    
    @PersistenceContext(name="AppCorporativoMedSys-ejbPU")
    protected EntityManager manager;
    private Class tipo;
    
    @Override
    public void salvar(T obj) {
        manager.persist(obj);
        manager.refresh(obj);
    }

    @Override
    public T abrir(long id) {
        return (T) manager.find(tipo, id);
    }

    @Override
    public void apagar(T obj) {
        manager.remove(obj);
    }

    @Override
    public abstract List<T> listarTodos(); 
    
}
