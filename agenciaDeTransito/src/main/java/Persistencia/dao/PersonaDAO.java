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
    
}
