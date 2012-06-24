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
@Table(name= "Servicos")
public class Servicos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private float Valor;
    
    @Column
    private String Descricao;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicos other = (Servicos) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Float.floatToIntBits(this.Valor) != Float.floatToIntBits(other.Valor)) {
            return false;
        }
        if ((this.Descricao == null) ? (other.Descricao != null) : !this.Descricao.equals(other.Descricao)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + Float.floatToIntBits(this.Valor);
        hash = 29 * hash + (this.Descricao != null ? this.Descricao.hashCode() : 0);
        return hash;
    }
    
    
    
    

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Servicos[ id=" + id + " ]";
    }
    
}
