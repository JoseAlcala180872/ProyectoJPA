
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcos_zr
 */
@Entity
public class Placa extends Tramite implements Serializable {

    @Column(name = "esVehiculoNuevo")
    private boolean esVehiculoNuevo;
    
    @Column(name = "NumeroAlfanumerico", length = 10, nullable = false)
    private String numeroAlfanumerico;
    
    @Temporal(TemporalType.DATE) // Esto especifica que la fecha se almacenará como DATE en la base de datos
    @Column(name = "FechaRecepcion")
    private Date fechaRecepcion;
    
    public Placa(){}
    
    public Placa(boolean esVehiculoNuevo, String numeroAlfanumerico, Date fechaExpedicion, Date fechaRecepcion, float costo, Persona persona) {
        super(fechaExpedicion, costo, persona);
        this.esVehiculoNuevo = esVehiculoNuevo;
        this.numeroAlfanumerico = numeroAlfanumerico;
        this.fechaRecepcion = fechaRecepcion;
    }

    public boolean isEsVehiculoNuevo() {
        return esVehiculoNuevo;
    }

    public void setEsVehiculoNuevo(boolean esVehiculoNuevo) {
        this.esVehiculoNuevo = esVehiculoNuevo;
    }

    public String getNumeroAlfanumerico() {
        return numeroAlfanumerico;
    }

    public void setNumeroAlfanumerico(String numeroAlfanumerico) {
        this.numeroAlfanumerico = numeroAlfanumerico;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    @Override
    public String toString() {
        return "Placa{" + "esVehiculoNuevo=" + esVehiculoNuevo + ", numeroAlfanumerico=" + numeroAlfanumerico + ", fechaRecepcion=" + fechaRecepcion + '}';
    }

    
    
}
