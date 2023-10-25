
package Negocio;
import Dominio.Placa;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Persistencia.PlacaJpaController;
/**
 *
 * @author marcos_zr
 */
public class PlacaNegocio {
     EntityManagerFactory managerFactory= Persistence.createEntityManagerFactory("org.itson_agenciaDeTransito_jar_1.0-SNAPSHOTPU");
    private PlacaJpaController placaControlador;
    
    public PlacaNegocio(){
        this.placaControlador = new PlacaJpaController(managerFactory);
    }
    
    public void registrarPlaca(Placa placa){
        try{
            placaControlador.create(placa);
        }catch(Exception e){
            e.getMessage();
        }
    }
}
