/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

import Dominio.Automovil;
import Dominio.Vehiculo;
import Persistencia.dao.VehiculoDAO;
import excepciones.BOException;
import excepciones.PersistenciaException;
import excepciones.ValidacionesException;
import interfaces.IVehiculoDAO;

/**
 *
 * @author TADEO
 */
public class VehiculoBO {
    
    IVehiculoDAO vehiculoDAO = new VehiculoDAO();
    
    public VehiculoBO(){}
    
    public Vehiculo insertar(Vehiculo vehiculoInsertar) throws BOException{
        try{
            this.validarInsertarVehiculo(vehiculoInsertar);
            return vehiculoDAO.insertar(vehiculoInsertar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Vehiculo actualizar(Vehiculo vehiculoActualizar) throws BOException{
        try{
            this.validarActualizarAutomovil(vehiculoActualizar);
            return vehiculoDAO.actualizar(vehiculoActualizar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Vehiculo eliminar(Vehiculo vehiculoEliminar) throws BOException{
        try{
            this.validarEliminarVehiculo(vehiculoEliminar);
            return vehiculoDAO.eliminar(vehiculoEliminar);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    public Vehiculo buscar(int idVehiculo) throws BOException{
        try{
            this.validarBuscarVehiculo(idVehiculo);
            return vehiculoDAO.buscar(idVehiculo);
        }catch(PersistenciaException e){
            throw new BOException(e.getMessage(), e);
        }catch(ValidacionesException a){
            throw new BOException(a.getMessage(), a);
        }
    }
    
    private void validarInsertarVehiculo(Vehiculo vehiculoValidar) throws ValidacionesException{
        if(vehiculoValidar == null){
            throw new ValidacionesException("Vehiculo a insertar es nulo/No hay informacion");
        }
    }
    
    private void validarActualizarAutomovil(Vehiculo vehiculoValidar) throws ValidacionesException{
        if(vehiculoValidar == null){
            throw new ValidacionesException("Vehiculo a actualizar es nulo/No hay informacion");
        }
    }
    
    private void validarEliminarVehiculo(Vehiculo vehiculoValidar) throws ValidacionesException{
        if(vehiculoValidar == null){
            throw new ValidacionesException("Vehiculo a eliminar es nulo/No hay información");
        }
    }
    
    private void validarBuscarVehiculo(int vehiculoValidar) throws ValidacionesException {
        if(vehiculoValidar <= 0){
            throw new ValidacionesException("Vehiculo a buscar es nulo/No hay información");
        }
    }
    
}
