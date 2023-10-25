
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author marcos_zr
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehiculo implements Serializable {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idVehiculo")
    private int idVehiculo;

    @Column(name = "MATRICULA", length = 10, nullable = false)
    private String MATRICULA;
    
    @Column(name = "Color", length = 20, nullable = false)
    private String color;
    
    @Column(name = "Marca", length = 50, nullable = false)
    private String marca;
    
    @Column(name = "Modelo", length = 50, nullable = false)
    private String modelo;
    
    @Column(name = "NumeroSerie", length = 20, nullable = false)
    private String numeroSerie;
    
    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona propietario;

    public Vehiculo() {
    }

    
    public Vehiculo(String MATRICULA, String color, String marca, String modelo, String numeroSerie, Persona propietario) {
        this.MATRICULA = MATRICULA;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
    }
    
    
    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(String MATRICULA) {
        this.MATRICULA = MATRICULA;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", MATRICULA=" + MATRICULA + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", numeroSerie=" + numeroSerie + ", propietario=" + propietario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.idVehiculo;
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
        final Vehiculo other = (Vehiculo) obj;
        return this.idVehiculo == other.idVehiculo;
    }
    
    
}
