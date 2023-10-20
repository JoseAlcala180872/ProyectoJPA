/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.itson.agenciadetransito;

import Dominio.Persona;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author YeisiPC
 */
public class AgenciaDeTransito {

    public static void main(String[] args) {
        EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU");
        EntityManager entityManager=managerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Date fecha=new Date(2023, 10, 5);
        Persona persona=new Persona("xxx", "643597845", "xxx", fecha, "Yalamsito papa", "asdfasdf", "asdfasdf");
        entityManager.persist(persona);
        entityManager.getTransaction().commit();
    }
}
