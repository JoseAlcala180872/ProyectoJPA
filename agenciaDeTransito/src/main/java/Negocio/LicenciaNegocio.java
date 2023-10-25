
package Negocio;
import Dominio.Licencia;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Persistencia.LicenciaJpaController;
/**
 *
 * @author marcos_zr
 */
public class LicenciaNegocio {
    
    EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU");
    private LicenciaJpaController licenciaControlador;
    
    public LicenciaNegocio(){
        this.licenciaControlador = new LicenciaJpaController(managerFactory);
    }
    
    public void registrarLicencia(Licencia licencia){
        
        try{
            licenciaControlador.create(licencia);
        }catch(Exception e){
            e.getMessage();
        }
        
    }
}
