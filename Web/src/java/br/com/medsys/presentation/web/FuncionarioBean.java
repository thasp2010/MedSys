
package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.Funcionario;
import br.com.medsys.domainModel.IRepositoryFuncionario;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Thais
 */
@Named(value = "Funcionario")
@SessionScoped
public class FuncionarioBean implements Serializable {

    @EJB
    IRepositoryFuncionario ejb;
    
    String Nome, cpf , endereco ;
    int Telefone;
    Date DataNasc;

    public Date getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(Date DataNasc) {
        this.DataNasc = DataNasc;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void salvar(){
        
        Funcionario func = new Funcionario();
        func.setNome(Nome);
        func.setCpf(cpf);
        func.setDataNasc(DataNasc);
        func.setEndereco(endereco);
        func.setTelefone(Telefone);
        ejb.salvar(func);
    }
    public FuncionarioBean() {
    }
}
