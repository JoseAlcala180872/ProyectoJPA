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
            em.getTransaction().commit();
            em.persist(tramiteInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return tramiteInsertar;
    }
    
}
