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
public class Tratamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private float valor;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataTratamento;
    
    //Adicionar chave estrangeira de paciente, funcionario, medico, servicos , usuario
    //@Column
    //@ManytoOne
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataTratamento() {
        return dataTratamento;
    }

    public void setDataTratamento(Date dataTratamento) {
        this.dataTratamento = dataTratamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tratamento other = (Tratamento) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (this.dataTratamento != other.dataTratamento && (this.dataTratamento == null || !this.dataTratamento.equals(other.dataTratamento))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 61 * hash + Float.floatToIntBits(this.valor);
        hash = 61 * hash + (this.dataTratamento != null ? this.dataTratamento.hashCode() : 0);
        return hash;
    }
    
    
    
   

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Tratamento[ id=" + id + " ]";
    }
    
}
