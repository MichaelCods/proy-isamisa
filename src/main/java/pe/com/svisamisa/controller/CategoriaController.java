
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
import pe.com.svisamisa.entity.CategoriaEntity;
import pe.com.svisamisa.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaservice;
    
    @GetMapping
    public List<CategoriaEntity>findAll(){
        return categoriaservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<CategoriaEntity> findAllCustom() {
        return categoriaservice.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<CategoriaEntity> findById(@PathVariable Long id) {
        return categoriaservice.findById(id);
    }
    
    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity c) {
        return categoriaservice.add(c);
    }
    
    @PutMapping("/{id}")
    public CategoriaEntity update(@PathVariable long id, @RequestBody CategoriaEntity c) {
        c.setId(id);
        return categoriaservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id) {
        CategoriaEntity objcat=new CategoriaEntity();
        objcat.setEstado(false);
        return categoriaservice.delete(CategoriaEntity.builder().id(id).build());     
    }
    
}
