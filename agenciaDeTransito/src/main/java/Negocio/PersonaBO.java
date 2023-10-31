/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Persona;
import Persistencia.dao.PersonaDAO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import excepciones.ValidacionesException;
import interfaces.IPersonaDAO;

/**
 *
 * @author TADEO
 */
public class PersonaBO {
    
    IPersonaDAO personaDAO = new PersonaDAO();
    
    public PersonaBO(){}
    
    public Persona insertar(Persona personaInsertar) throws BOException{
        try{
            this.validarInsertarPersona(personaInsertar);
            return personaDAO.insertar(personaInsertar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
      
    public Persona actualizar(Persona personaActualizar) throws BOException{
        try{
            this.validarActualizarPersona(personaActualizar);
            return personaDAO.actualizar(personaActualizar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Persona eliminar(Persona personaEliminar) throws BOException{
        try{
            this.validarEliminarPersona(personaEliminar);
            return personaDAO.eliminar(personaEliminar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Persona buscar(int idPersona) throws BOException{
        try{
            return personaDAO.buscar(idPersona);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }
    }
    
    private void validarInsertarPersona(Persona personaValidar) throws ValidacionesException{
        if(personaValidar == null){
            throw new ValidacionesException("Persona a insertar es nulo/No hay información");
        }
    }
    
    private void validarActualizarPersona(Persona personaValidar) throws ValidacionesException{
        if(personaValidar == null){
            throw new ValidacionesException("Persona a actualizar es nulo/No hay información");
        }
    }
    
    private void validarEliminarPersona(Persona personaValidar) throws ValidacionesException{
        if(personaValidar == null){
            throw new ValidacionesException("Persona a eliminar es nulo/No hay información");
        }
    }
}
