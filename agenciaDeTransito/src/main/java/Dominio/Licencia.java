
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
public class Licencia extends Tramite implements Serializable {

     @Column(name="Vigencia")
    private int vigencia;
    
    @Temporal(TemporalType.DATE) // Esto especifica que la fecha se almacenará como DATE en la base de datos
    @Column(name = "FechaVencimiento")
    private Date fechaVencimiento;
    
    @Column(name="Tipo")
    private String tipoLicencia;

    public Licencia() {
    }
    
    public Licencia(int vigencia, Date fechaVencimiento, String tipoLicencia, Date fechaExpedicion, float costo, Persona persona) {
        super(fechaExpedicion, costo, persona);
        this.vigencia = vigencia;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoLicencia = tipoLicencia;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    @Override
    public String toString() {
        return "Licencia{" + "vigencia=" + vigencia + ", fechaVencimiento=" + fechaVencimiento + ", tipoLicencia=" + tipoLicencia + '}';
    }
    
}
