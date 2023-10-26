/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import Dominio.Vehiculo;
import excepciones.PersistenciaException;

/**
 *
 * @author TADEO
 */
public interface IVehiculoDAO {
    
    public Vehiculo insertar(Vehiculo vehiculoInsertar) throws PersistenciaException;
    
    public Vehiculo actualizar(Vehiculo vehiculoActualizar) throws PersistenciaException;
}
