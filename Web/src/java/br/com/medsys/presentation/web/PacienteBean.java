/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.IRepositoryPaciente;
import br.com.medsys.domainModel.Paciente;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Thais
 */
@Named(value = "paciente")
@SessionScoped
public class PacienteBean implements Serializable {

    @EJB
    IRepositoryPaciente ejb;
    String nome, cpf;
    int telefone;
    Date data;
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public void salvar(){
        
        Paciente pac = new Paciente();
        pac.setNome(nome);
        pac.setCpf(cpf);
        pac.setTelefone(telefone);
        pac.setDataNasc(data);
        ejb.salvar(pac);
        
    }
    
    public PacienteBean() {
    }
}
