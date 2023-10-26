/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author TADEO
 */
public class Conexion {
    
    private final String DIRECCION_PERSISTENCE = "org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU";
    private static EntityManagerFactory entityManagerFactory;
    private static Conexion conexion;
    
    private Conexion(){
        entityManagerFactory = Persistence.createEntityManagerFactory(DIRECCION_PERSISTENCE);
    }
    
    public static EntityManagerFactory getConexion(){
        
        if(conexion == null){
            conexion = new Conexion();
        }
        return entityManagerFactory;
    }
}
