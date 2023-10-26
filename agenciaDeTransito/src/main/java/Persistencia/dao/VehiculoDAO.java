/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Vehiculo;
import Persistencia.conexion.Conexion;
import excepciones.PersistenciaException;
import interfaces.IVehiculoDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author TADEO
 */
public class VehiculoDAO implements IVehiculoDAO{
    
    EntityManagerFactory emf;
    
    public VehiculoDAO(){
        this.emf = Conexion.getConexion();
    }
    
    @Override
    public Vehiculo insertar(Vehiculo vehiculoInsertar) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(vehiculoInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return vehiculoInsertar;
    }

    @Override
    public Vehiculo actualizar(Vehiculo vehiculoActualizar) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(vehiculoActualizar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return vehiculoActualizar;
    }
    
}
