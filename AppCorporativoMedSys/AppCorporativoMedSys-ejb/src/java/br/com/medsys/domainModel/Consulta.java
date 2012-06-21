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
public class Consulta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private float Valor;
    
    @Column
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataConsulta;
    
    //Criar chave estrangeira medico, paciente , funcionario
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataConsulta() {
        return DataConsulta;
    }

    public void setDataConsulta(Date DataConsulta) {
        this.DataConsulta = DataConsulta;
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
        final Consulta other = (Consulta) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (Float.floatToIntBits(this.Valor) != Float.floatToIntBits(other.Valor)) {
            return false;
        }
        if (this.DataConsulta != other.DataConsulta && (this.DataConsulta == null || !this.DataConsulta.equals(other.DataConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 37 * hash + Float.floatToIntBits(this.Valor);
        hash = 37 * hash + (this.DataConsulta != null ? this.DataConsulta.hashCode() : 0);
        return hash;
    }
    
    

    

    @Override
    public String toString() {
        return "br.com.medsys.domainModel.Consulta[ id=" + id + " ]";
    }
    
}
