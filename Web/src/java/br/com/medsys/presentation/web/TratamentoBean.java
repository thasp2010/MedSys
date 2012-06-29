package br.com.medsys.presentation.web;


import br.com.medsys.domainModel.IRepositoryTratamento;
import br.com.medsys.domainModel.Tratamento;
import java.io.Serializable;
import java.util.Date;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Thais
 */
@Named(value = "Tratamento")
@SessionScoped
public class TratamentoBean implements Serializable {
    
    @EJB
    IRepositoryTratamento ejb;
    
    String nomePaciente, cpfPaciente, nomeMedico, especialidadeMedico;
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

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
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
        Tratamento trat = new Tratamento();
        trat.setDataTratamento(data);
        trat.setValor(valor);
        ejb.salvar(trat);
    }
   
    public TratamentoBean() {
    }
}
