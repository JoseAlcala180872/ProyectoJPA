/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    @Column(name = "FechaNacimiento", nullable = false)
    private Date FechaNacimiento;

    @Column(name = "Nombres", length = 50, nullable = false)
    private String Nombres;

    @Column(name = "ApellidoPaterno", length = 50, nullable = false)
    private String ApellidoPaterno;

    @Column(name = "ApellidoMaterno", length = 50, nullable = false)
    private String ApellidoMaterno;

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
