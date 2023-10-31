/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Dominio.Tramite;
import excepciones.PersistenciaException;

/**
 *
 * @author TADEO
 */
public interface ITramiteDAO {
    
    public Tramite insertar(Tramite tramiteInsertar) throws PersistenciaException;
    
    public Tramite actualizar(Tramite vehiculoActualizar) throws PersistenciaException;
    
    public Tramite eliminar(Tramite vehiculoEliminar) throws PersistenciaException;
    
    public Tramite buscar(int idVehiculo) throws PersistenciaException;
    
}
