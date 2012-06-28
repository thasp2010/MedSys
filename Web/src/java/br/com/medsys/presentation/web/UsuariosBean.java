package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.IRepositoryUsuarios;
import br.com.medsys.domainModel.Usuarios;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

/**
 *
 * @author Thais
 */
@Named(value = "usuarios")
@SessionScoped
public class UsuariosBean implements Serializable {

    @EJB
    IRepositoryUsuarios ejb; 
    
    String nome, responsavel ;

    public String getNome() {
        return nome;
    }
    public void salvar(){
        
        Usuarios usr = new Usuarios();
        usr.setNome(nome);
        usr.setResponsavel(responsavel);
        ejb.salvar(usr);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    
    public UsuariosBean() {
    }
}
