
package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.IRepositoryMedico;
import br.com.medsys.domainModel.Medico;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;

/**
 *
 * @author Thais
 */
@Named(value = "medico")
@SessionScoped
public class MedicoBean implements Serializable {
    
    @EJB
    IRepositoryMedico ejb;
    
    String nome, cpf;
    int telefone;
    Date data;
    String crm, especialidade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
        
        Medico med = new Medico();
        med.setNome(nome);
        med.setCpf(cpf);
        med.setTelefone(telefone);
        med.setDataNasc(data);
        med.setCRM(telefone);
        med.setEspecialidade(especialidade);
        ejb.salvar(med);
    }
    
    public MedicoBean() {
    }
}
