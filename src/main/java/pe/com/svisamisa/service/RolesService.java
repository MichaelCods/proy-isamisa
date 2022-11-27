
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.RolesEntity;


public interface RolesService {
    List<RolesEntity>findAll();
    List<RolesEntity>findAllCustom();
    Optional<RolesEntity>findById(Long id);
    RolesEntity add(RolesEntity r);
    RolesEntity update(RolesEntity r);
    RolesEntity delete(RolesEntity r);
}
