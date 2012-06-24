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
@Table(name="Usuarios")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String Nome;
    
    @Column
    private String Responsavel;
    
    // chave estrangeira do responsavel
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.Nome == null) ? (other.Nome != null) : !this.Nome.equals(other.Nome)) {
            return false;
        }
        if ((this.Responsavel == null) ? (other.Responsavel != null) : !this.Responsavel.equals(other.Responsavel)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 11 * hash + (this.Nome != null ? this.Nome.hashCode() : 0);
        hash = 11 * hash + (this.Responsavel != null ? this.Responsavel.hashCode() : 0);
        return hash;
    }

    
   

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Usuarios[ id=" + id + " ]";
    }
    
}
