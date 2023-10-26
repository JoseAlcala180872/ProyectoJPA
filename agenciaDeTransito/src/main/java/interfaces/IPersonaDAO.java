/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author TADEO
 */
public interface IPersonaDAO {
    
    public Persona insertar(Persona personaInsertar) throws PersistenciaException;

}
