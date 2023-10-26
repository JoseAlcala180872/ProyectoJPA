
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;


/**
 *
 * @author marcos_zr
 */
@Entity
public class Automovil extends Vehiculo implements Serializable {

    @Column(name = "Linea", length = 50, nullable = false)
    private String linea;

    public Automovil(){}

    public Automovil(String linea, String MATRICULA, String color, String marca, String modelo, String numeroSerie, Persona propietario) {
        super(MATRICULA, color, marca, modelo, numeroSerie, propietario);
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Automovil{" + "linea=" + linea + '}';
    }
    
}
