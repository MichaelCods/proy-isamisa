
package pe.com.svisamisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.svisamisa.entity.ClienteEntity;


public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{
    @Query("select c from ClienteEntity c where c.estado=1")
    List<ClienteEntity>findAllCustom();
}
