
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcos_zr
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTramite")
    private int idTramite;
    
    @Temporal(TemporalType.DATE) // Esto especifica que la fecha se almacenará como DATE en la base de datos
    @Column(name = "FechaExpedicion")
    private Date fechaExpedicion;
    
    @Column(name = "Costo", precision = 10, scale = 2)
    private float costo;
    
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    public Tramite() {
    }

    public Tramite(Date fechaExpedicion, float costo, Persona persona) {
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
        this.persona = persona;
    }

    public int getIdTramite() {
        return idTramite;
    }

    public void setIdTramite(int idTramite) {
        this.idTramite = idTramite;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    @Override
    public String toString() {
        return "Tramite{" + "idTramite=" + idTramite + ", fechaEencimiento=" + fechaExpedicion + ", costo=" + costo + ", persona=" + persona + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idTramite;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tramite other = (Tramite) obj;
        return this.idTramite == other.idTramite;
    }
    
    
    
}
