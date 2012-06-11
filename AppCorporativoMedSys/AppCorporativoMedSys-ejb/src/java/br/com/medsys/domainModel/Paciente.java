/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Thais
 */
@Entity
public class Paciente extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="Nome")
    private String Nome;
    
    @Column(name="Cpf")
    private String Cpf;
    
    @Column(name="Data de Nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataNasc;
    
    @Column(name="Telefone")
    private int Telefone;
    
    @Column(name="Endereco")
    private String Endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public Date getDataNasc() {
        return super.getDataNasc();
    }

    @Override
    public String getEndereco() {
        return super.getEndereco();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getTelefone() {
        return super.getTelefone();
    }

    @Override
    public void setCodigo(int Codigo) {
        super.setCodigo(Codigo);
    }

    @Override
    public void setCpf(String Cpf) {
        super.setCpf(Cpf);
    }

    @Override
    public void setDataNasc(Date DataNasc) {
        super.setDataNasc(DataNasc);
    }

    @Override
    public void setEndereco(String endereco) {
        super.setEndereco(endereco);
    }

    @Override
    public void setNome(String Nome) {
        super.setNome(Nome);
    }

    @Override
    public void setTelefone(int Telefone) {
        super.setTelefone(Telefone);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.Nome == null) ? (other.Nome != null) : !this.Nome.equals(other.Nome)) {
            return false;
        }
        if ((this.Cpf == null) ? (other.Cpf != null) : !this.Cpf.equals(other.Cpf)) {
            return false;
        }
        if (this.DataNasc != other.DataNasc && (this.DataNasc == null || !this.DataNasc.equals(other.DataNasc))) {
            return false;
        }
        if (this.Telefone != other.Telefone) {
            return false;
        }
        if ((this.Endereco == null) ? (other.Endereco != null) : !this.Endereco.equals(other.Endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.Nome != null ? this.Nome.hashCode() : 0);
        hash = 29 * hash + (this.Cpf != null ? this.Cpf.hashCode() : 0);
        hash = 29 * hash + (this.DataNasc != null ? this.DataNasc.hashCode() : 0);
        hash = 29 * hash + this.Telefone;
        hash = 29 * hash + (this.Endereco != null ? this.Endereco.hashCode() : 0);
        return hash;
    }
    

    

    

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Paciente[ id=" + id + " ]";
    }
    
}
