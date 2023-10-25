
package Negocio;
import Dominio.Automovil;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Persistencia.AutomovilJpaController;
/**
 *
 * @author marcos_zr
 */
public class AutomovilNegocio {
    EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU");
    private AutomovilJpaController automovilControlador;
    
    public AutomovilNegocio(){
        this.automovilControlador = new AutomovilJpaController(managerFactory);
    }
    
    public void registrarAutomovil(Automovil automovil){
        
        try{
            automovilControlador.create(automovil);
        }catch(Exception e){
            e.getMessage();
        }
        
    }
}
