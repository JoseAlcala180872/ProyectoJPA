/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.dao;

import Dominio.Persona;
import Persistencia.conexion.Conexion;
import excepciones.PersistenciaException;
import interfaces.IPersonaDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author TADEO
 */
public class PersonaDAO implements IPersonaDAO{
    
    EntityManagerFactory emf;

    public PersonaDAO() {
        this.emf = Conexion.getConexion();
    }
    
    
    
    @Override
    public Persona insertar(Persona personaInsertar) throws PersistenciaException {
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(personaInsertar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return personaInsertar;
    }
    
    @Override
    public Persona actualizar(Persona personaActualizar)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(personaActualizar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return personaActualizar;
    }
    
    @Override
    public Persona eliminar(Persona personaEliminar)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            if (!em.contains(personaEliminar)) {
                // Si no está administrada, busca la entidad en el contexto de persistencia
                personaEliminar = em.merge(personaEliminar);
            }
            em.remove(personaEliminar);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage());
        }
        return personaEliminar;
    }
    
    @Override
    public Persona buscar(int idPersona)throws PersistenciaException{
        EntityManager em = emf.createEntityManager();
        Persona personaBuscar = null;
        try{
            em.getTransaction().begin();
            personaBuscar = em.find(Persona.class, idPersona);
            em.getTransaction().commit();
        }catch(Exception e){
            em.getTransaction().rollback();
        }
        return personaBuscar;
    }
    
}
