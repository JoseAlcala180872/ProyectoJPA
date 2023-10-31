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
 
    @Override
    public Vehiculo eliminar(Vehiculo vehiculoEliminar)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            if (!em.contains(vehiculoEliminar)) {
                // Si no está administrada, busca la entidad en el contexto de persistencia
                vehiculoEliminar = em.merge(vehiculoEliminar);
            }
            em.remove(vehiculoEliminar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        return vehiculoEliminar;
    }
    
    @Override
    public Vehiculo buscar(int idVehiculo)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        Vehiculo vehiculoBuscar = null;
        try{
            em.getTransaction().begin();
            vehiculoBuscar = em.find(Vehiculo.class, idVehiculo);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return vehiculoBuscar;
    }
}
