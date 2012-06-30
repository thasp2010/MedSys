package br.com.medsys.presentation.web;


import br.com.medsys.domainModel.Consulta;
import br.com.medsys.domainModel.IRepositoryConsulta;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Thais
 */
@Named(value = "consulta")
@SessionScoped
public class ConsultaBean implements Serializable {

    @EJB
    IRepositoryConsulta ejb;
    
    String nomePaciente, nomeMedico, especialidade, cpfPaciente;
    float valor;
    Date data;

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
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

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public void salvar(){
        Consulta con = new Consulta();
        con.setDataConsulta(data);
        con.setValor(valor);
    }
    
    public ConsultaBean() {
    }
}
