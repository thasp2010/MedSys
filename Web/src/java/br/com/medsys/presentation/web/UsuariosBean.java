/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.IRepositoryUsuarios;
import br.com.medsys.domainModel.Usuarios;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
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
    List<Usuarios> listagem;
    Usuarios usuario;
    String nome , responsavel;

    public List<Usuarios> getListagem() {
        if(listagem == null)
        listagem = ejb.listarTodos();
        return listagem;
    }

    public void setListagem(List<Usuarios> listagem) {
        this.listagem = listagem;
    }

    public String getNome() {
        return nome;
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

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void salvar(){
        Usuarios usr = new Usuarios();
        usr.setNome(nome);
        usr.setResponsavel(responsavel);
        ejb.salvar(usr);
        
    }
    
    public UsuariosBean() {
    }
}
