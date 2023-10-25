
package Negocio;
import Dominio.Persona;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Persistencia.PersonaJpaController;
/**
 *
 * @author marcos_zr
 */
public class PersonaNegocio {
    
    EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU");
    private PersonaJpaController personaControlador;
    
    public PersonaNegocio(){
        this.personaControlador = new PersonaJpaController(managerFactory);
    }
    
    public void registrarPersona(Persona persona){
        
        try{
            personaControlador.create(persona);
        }catch(Exception e){
            e.getMessage();
        }
        
    }
    
    public Persona obtenerPersona(int id){
        
        return personaControlador.findPersona(id);
    }
}
