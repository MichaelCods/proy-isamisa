
package pe.com.svisamisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.svisamisa.entity.DetalleEntity;

public interface DetalleRepository extends JpaRepository<DetalleEntity, Long> {
    @Query("Select d from DetalleEntity d where d.estado=1")
    List<DetalleEntity>findAllCustom();
}
