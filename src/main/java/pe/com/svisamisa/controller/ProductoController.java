
package pe.com.svisamisa.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.svisamisa.entity.ProductoEntity;
import pe.com.svisamisa.service.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoservicio;
    
    @GetMapping
    public List<ProductoEntity>findAll(){
        return productoservicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity>findAllCustom(){
        return productoservicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<ProductoEntity>findById(@PathVariable Long id){
        return productoservicio.findById(id);
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity p){
        return productoservicio.add(p);
    }
    
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id, @RequestBody ProductoEntity p) {
        p.setId(id);
        return productoservicio.update(p);
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id) {
        ProductoEntity objusuario=new ProductoEntity();
        objusuario.setEstado(false);
        return productoservicio.delete(ProductoEntity.builder().id(id).build());     
    }       
  
    
}

