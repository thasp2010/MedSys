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
@Inheritance(strategy= InheritanceType.JOINED)
@Table (name = "Pessoas")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PessoaID")
    private Long id;
   
    @Column
    private String Nome;
    
    @Column
    private String Cpf;
    
    
    @Column
    private int Telefone;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataNasc;
    
    @Column
    private String endereco;
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.Nome == null) ? (other.Nome != null) : !this.Nome.equals(other.Nome)) {
            return false;
        }
        if ((this.Cpf == null) ? (other.Cpf != null) : !this.Cpf.equals(other.Cpf)) {
            return false;
        }
        if (this.Telefone != other.Telefone) {
            return false;
        }
        if (this.DataNasc != other.DataNasc && (this.DataNasc == null || !this.DataNasc.equals(other.DataNasc))) {
            return false;
        }
        if ((this.endereco == null) ? (other.endereco != null) : !this.endereco.equals(other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 59 * hash + (this.Nome != null ? this.Nome.hashCode() : 0);
        hash = 59 * hash + (this.Cpf != null ? this.Cpf.hashCode() : 0);
        hash = 59 * hash + this.Telefone;
        hash = 59 * hash + (this.DataNasc != null ? this.DataNasc.hashCode() : 0);
        hash = 59 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        return hash;
    }
    
    

   
    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Pessoa[ id=" + id + " ]";
    }
    
}
