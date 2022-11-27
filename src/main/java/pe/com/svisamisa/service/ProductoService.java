
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.ProductoEntity;




public interface ProductoService {
    List<ProductoEntity>findAll();
    List<ProductoEntity>findAllCustom();
    Optional<ProductoEntity>findById(Long id);
    ProductoEntity add(ProductoEntity p);
    ProductoEntity update(ProductoEntity p);
    ProductoEntity delete(ProductoEntity p);
    
}