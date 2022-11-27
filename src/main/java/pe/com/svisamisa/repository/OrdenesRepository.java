
package pe.com.svisamisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.svisamisa.entity.OrdenesEntity;

public interface OrdenesRepository extends JpaRepository<OrdenesEntity, Long>{
    @Query("Select o from OrdenesEntity o where o.estado=1")
    List<OrdenesEntity>findAllCustom();
    
}

