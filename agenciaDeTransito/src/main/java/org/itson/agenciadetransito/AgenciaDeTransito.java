

package org.itson.agenciadetransito;

import Dominio.*;
import Negocio.*;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
/**
 *
 * @author YeisiPC
 */
public class AgenciaDeTransito {

    public static void main(String[] args) throws NonexistentEntityException {
        
        PersonaNegocio personaNegocio = new PersonaNegocio();
        AutomovilNegocio automovilNegocio = new AutomovilNegocio();
        LicenciaNegocio licenciaNegocio = new LicenciaNegocio();
        PlacaNegocio placaNegocio = new PlacaNegocio();
        
        Date fecha = new Date(2002, 6, 10);
 
        //Registrar Persona para crear tabla en la base de datos
        Persona personaNueva = new Persona("------", "6444773020", "MAZR060107HSR", fecha, "tadeo", "zayas", "guerrero");
        personaNegocio.registrarPersona(personaNueva);
        
        Persona persona = personaNegocio.obtenerPersona(2);
        
        //Registrar automovil para crear tabla de vehiculo y automovil en la base de datos
        Automovil automovilNuevo = new Automovil("------", "HHH999", "verde", "Tessla", "2023", "2760-9090-1010", persona);
        automovilNegocio.registrarAutomovil(automovilNuevo);

        //Registrar licencia para crear tabla de tramite y licencia en la base de datos
        Licencia licenciaNueva = new Licencia(2, fecha, "discapacitado", fecha, 500, persona);
        licenciaNegocio.registrarLicencia(licenciaNueva);
        
        //Registrar placa para crear tabla de tramite y placa en la base de datos
        Placa placaNueva = new Placa(true, "HHH999", fecha, fecha, 3500, persona);
        placaNegocio.registrarPlaca(placaNueva);
        
        
   
    }
}
