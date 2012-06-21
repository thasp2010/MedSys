/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medsys.domainModel;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Thais
 */
@Entity
@Table(name="Medico")
public class Medico extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private int CRM;
    
    @Column
    private String Especialidade;
    
    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    
    
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medico other = (Medico) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.CRM != other.CRM) {
            return false;
        }
        if ((this.Especialidade == null) ? (other.Especialidade != null) : !this.Especialidade.equals(other.Especialidade)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 59 * hash + this.CRM;
        hash = 59 * hash + (this.Especialidade != null ? this.Especialidade.hashCode() : 0);
        return hash;
    }

    

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Medico[ id=" + id + " ]";
    }
    
}
