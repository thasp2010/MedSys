
package br.com.medsys.presentation.web;

import br.com.medsys.domainModel.Endereco;
import br.com.medsys.domainModel.IRepositoryEndereco;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Thais
 */
@Named(value = "endereco")
@SessionScoped
public class EnderecoBean implements Serializable {
    
    @EJB
    IRepositoryEndereco ejb;
    
    String rua;
    int numero;
    String bairro;
    String cidade;
    String estado;
    String cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void salvar(){
        Endereco end = new Endereco();
        end.setRua(rua);
        end.setNumero(numero);
        end.setBairro(bairro);
        end.setCidade(cidade);
        end.setEstado(estado);
        end.setCEP(rua);
        ejb.salvar(end);
    }
    
   
    public EnderecoBean() {
    }
}
