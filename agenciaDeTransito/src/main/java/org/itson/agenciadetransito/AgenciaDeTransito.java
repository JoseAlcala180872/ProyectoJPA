

package org.itson.agenciadetransito;


import Dominio.Automovil;
import Dominio.Licencia;
import Dominio.Persona;
import Dominio.Placa;
import Dominio.Tramite;
import Dominio.Vehiculo;
import GUI.frmInicial;
import Negocio.PersonaBO;
import Negocio.*;
import excepciones.BOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author YeisiPC
 */
public class AgenciaDeTransito {

    public static void main(String[] args) {

//        PersonaBO personaBO = new PersonaBO();
//        VehiculoBO vehiculoBO = new VehiculoBO();
//        TramiteBO tramiteBO = new TramiteBO();
//        Tramite tramite = new Tramite();
//        Vehiculo vehiculo = new Vehiculo();
//        
//        Date fecha = new Date(2002, 6, 10);
// 
//        //Registrar Persona para crear tabla en la base de datos
//        Persona personaNueva = new Persona("------", "6444773020", "MAZR060107HSR", fecha, "tadeo", "zayas", "guerrero");
//        
//        //Registrar placa para crear tabla de tramite y placa en la base de datos
//        Placa placaNueva = new Placa(true, "HHH999", fecha, fecha, 3500, personaNueva);
//        personaNueva.agregarTramite(placaNueva);
//        
//        //Registra un automovil para creal la tabla de Vehiculo y Automovil en la base de datos
//        Automovil automovilNuevo = new Automovil("Aveo", "ASX999", "Blanco", "Chevrolet", "2006", "120", personaNueva);
//        personaNueva.agregarVehiculo(automovilNuevo);
//        
//        //No estoy seguro de como, pero esto es lo que hace que funcione la base de datos por completo
//        //no le muevan, dejenlo ahí y siempre dejenlo al final de todo.
//        try{
//            personaBO.insertar(personaNueva);
//        }catch(BOException ex){
//            Logger.getLogger(AgenciaDeTransito.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//        
//        Persona personaPrueba = new Persona("---", "6441317080", "MARZ060101SRHKKRA1", fecha, "marcos", "zazueta", "ruiz");
//        
//        try{
//            personaBO.insertar(personaPrueba);
//        }catch(BOException ex){
//            Logger.getLogger(AgenciaDeTransito.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try{
//            Persona persona = personaBO.buscar(1);
//            Licencia licencia = new Licencia(3, fecha, "discapacitado", fecha, 1500, persona);
//            tramiteBO.insertar(licencia);  
//        }catch(BOException ex){
//            Logger.getLogger(AgenciaDeTransito.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Inicio del programa
        frmInicial inicial=new frmInicial();
        inicial.setVisible(true);
    }
}
