/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thais
 */
@Entity
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column (name="Rua")
    private String Rua;
    
    @Column (name="Numero")
    private int Numero;
    
    @Column (name="Bairro")
    private String Bairro;
    
    @Column (name="Cidade")
    private String Cidade;
    
    @Column(name="Estado")
    private String Estado;
    
    @Column (name="CEP")
    private String CEP;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.Rua == null) ? (other.Rua != null) : !this.Rua.equals(other.Rua)) {
            return false;
        }
        if (this.Numero != other.Numero) {
            return false;
        }
        if ((this.Bairro == null) ? (other.Bairro != null) : !this.Bairro.equals(other.Bairro)) {
            return false;
        }
        if ((this.Cidade == null) ? (other.Cidade != null) : !this.Cidade.equals(other.Cidade)) {
            return false;
        }
        if ((this.Estado == null) ? (other.Estado != null) : !this.Estado.equals(other.Estado)) {
            return false;
        }
        if ((this.CEP == null) ? (other.CEP != null) : !this.CEP.equals(other.CEP)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 11 * hash + (this.Rua != null ? this.Rua.hashCode() : 0);
        hash = 11 * hash + this.Numero;
        hash = 11 * hash + (this.Bairro != null ? this.Bairro.hashCode() : 0);
        hash = 11 * hash + (this.Cidade != null ? this.Cidade.hashCode() : 0);
        hash = 11 * hash + (this.Estado != null ? this.Estado.hashCode() : 0);
        hash = 11 * hash + (this.CEP != null ? this.CEP.hashCode() : 0);
        return hash;
    }
    
    
    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Endereco[ id=" + id + " ]";
    }
    
}
