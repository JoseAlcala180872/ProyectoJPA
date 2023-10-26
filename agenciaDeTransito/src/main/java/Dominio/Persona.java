package Dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author YeisiPC
 */
@Entity
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;

    @Column(name = "RFC", length = 13, nullable = false)
    private String RFC;

    @Column(name = "Telefono", length = 10, nullable = false)
    private String Telefono;

    @Column(name = "CURP", length = 18, nullable = false)
    private String CURP;

    @Temporal(TemporalType.DATE)
    @Column(name = "FechaNacimiento", nullable = false)
    private Date FechaNacimiento;

    @Column(name = "Nombres", length = 50, nullable = false)
    private String Nombres;

    @Column(name = "ApellidoPaterno", length = 50, nullable = false)
    private String ApellidoPaterno;

    @Column(name = "ApellidoMaterno", length = 50, nullable = false)
    private String ApellidoMaterno;

    @OneToMany(mappedBy = "persona", cascade = {CascadeType.PERSIST})
    private List<Tramite> listaTramites;

    @OneToMany(mappedBy = "propietario", cascade = {CascadeType.PERSIST})
    private List<Vehiculo> listaVehiculos;

    public Persona() {
    }

    public Persona(String RFC, String Telefono, String CURP, Date FechaNacimiento, String Nombres, String ApellidoPaterno, String ApellidoMaterno) {
        this.RFC = RFC;
        this.Telefono = Telefono;
        this.CURP = CURP;
        this.FechaNacimiento = FechaNacimiento;
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {

        if (listaVehiculos == null) {
            this.listaVehiculos = new LinkedList<>();
        }
        this.listaVehiculos.add(vehiculo);
    }

    public void agregarTramite(Tramite tramite) {

        if (listaTramites == null) {
            this.listaTramites = new LinkedList<>();
        }
        this.listaTramites.add(tramite);
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public List<Tramite> getListaTramites() {
        return listaTramites;
    }

    public void setListaTramites(List<Tramite> listaTramites) {
        this.listaTramites = listaTramites;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", RFC=" + RFC + ", Telefono=" + Telefono + ", CURP=" + CURP + ", FechaNacimiento=" + FechaNacimiento + ", Nombres=" + Nombres + ", ApellidoPaterno=" + ApellidoPaterno + ", ApellidoMaterno=" + ApellidoMaterno + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idPersona;
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
        final Persona other = (Persona) obj;
        return this.idPersona == other.idPersona;
    }

}
