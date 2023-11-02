/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Tramite;
import Persistencia.dao.TramiteDAO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import excepciones.ValidacionesException;
import interfaces.ITramiteDAO;

/**
 *
 * @author TADEO
 */
public class TramiteBO {
    
    ITramiteDAO tramiteDAO = new TramiteDAO();
    
    public TramiteBO(){}
    
    public Tramite insertar(Tramite tramiteInsertar) throws BOException{
        try{
            this.validarInsertarTramite(tramiteInsertar);
            return tramiteDAO.insertar(tramiteInsertar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Tramite actualizar(Tramite tramiteActualizar) throws BOException{
        try{
            this.validarActualizarTramite(tramiteActualizar);
            return tramiteDAO.actualizar(tramiteActualizar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Tramite eliminar(Tramite tramiteEliminar) throws BOException{
        try{
            this.validarEliminarTramite(tramiteEliminar);
            return tramiteDAO.eliminar(tramiteEliminar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Tramite buscar(int idTramite) throws BOException{
        try{
            this.validarBuscarTramite(idTramite);
            return tramiteDAO.buscar(idTramite);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    private void validarInsertarTramite(Tramite tramiteValidar) throws ValidacionesException{
        if(tramiteValidar == null){
            throw new ValidacionesException("Tramite a insertar nulo/No hay información");
        }
    }
    
    private void validarActualizarTramite(Tramite tramiteValidar) throws ValidacionesException{
        if(tramiteValidar == null){
            throw new ValidacionesException("Tramite a actualizar es nulo/No hay información");
        }
    }
    
    private void validarEliminarTramite(Tramite tramiteValidar) throws ValidacionesException{
        if(tramiteValidar == null){
            throw new ValidacionesException("Tramite a eliminar es nulo/No hay información");
        }
    }
    
    private void validarBuscarTramite(int tramiteValidar) throws ValidacionesException{
        if(tramiteValidar <= 0){
            throw new ValidacionesException("Tramite buscado es nulo/No hay información");
        }
    }
}
