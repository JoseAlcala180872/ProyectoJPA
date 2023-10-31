/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Tramite;
import Persistencia.conexion.Conexion;
import excepciones.PersistenciaException;
import interfaces.ITramiteDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author TADEO
 */
public class TramiteDAO implements ITramiteDAO{

    EntityManagerFactory emf;
    
    public TramiteDAO(){
        this.emf = Conexion.getConexion();
    }
    
    @Override
    public Tramite insertar(Tramite tramiteInsertar) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(tramiteInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return tramiteInsertar;
    }
    
    @Override
    public Tramite actualizar(Tramite tramiteActualizar) throws PersistenciaException {
         EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(tramiteActualizar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return tramiteActualizar;
    }
    
    @Override
    public Tramite eliminar(Tramite tramiteEliminar)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            if (!em.contains(tramiteEliminar)) {
                // Si no está administrada, busca la entidad en el contexto de persistencia
                tramiteEliminar = em.merge(tramiteEliminar);
            }
            em.remove(tramiteEliminar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        return tramiteEliminar;
    }
    
    @Override
    public Tramite buscar(int idTramite)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        Tramite tramiteBuscar = null;
        try{
            em.getTransaction().begin();
            tramiteBuscar = em.find(Tramite.class, idTramite);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return tramiteBuscar;
    }
    
}
