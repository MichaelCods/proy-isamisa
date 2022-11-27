
package pe.com.svisamisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.svisamisa.entity.RolesEntity;


public interface RolesRepository extends JpaRepository<RolesEntity, Long>{
    @Query("select r from RolesEntity r where r.estado=1")
    List<RolesEntity>findAllCustom();
}
