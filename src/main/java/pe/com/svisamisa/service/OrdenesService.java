
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.OrdenesEntity;


public interface OrdenesService {
    List<OrdenesEntity>findAll();
    List<OrdenesEntity>findAllCustom();
    Optional<OrdenesEntity>findById(Long id);
    OrdenesEntity add(OrdenesEntity o);
    OrdenesEntity update(OrdenesEntity o);
    OrdenesEntity delete(OrdenesEntity o); 
}
