
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.CategoriaEntity;


public interface CategoriaService {
    List<CategoriaEntity>findAll();
    List<CategoriaEntity>findAllCustom();
    Optional<CategoriaEntity>findById(Long id);
    CategoriaEntity add(CategoriaEntity c);
    CategoriaEntity update(CategoriaEntity c);
    CategoriaEntity delete(CategoriaEntity c);    
}
