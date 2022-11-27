
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
import pe.com.svisamisa.entity.EmpleadoEntity;
import pe.com.svisamisa.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoservice;
    
    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return empleadoservice.findAll();
    }
    
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom(){
        return empleadoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable Long id) {
        return empleadoservice.findById(id);
    }

    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity e) {
        return empleadoservice.add(e);
    }
    
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity e) {
        e.setId(id);
        return empleadoservice.update(e);
    }
    
    @DeleteMapping("/{id}")
    public EmpleadoEntity delete(@PathVariable long id) {
        EmpleadoEntity objemp=new EmpleadoEntity();
        objemp.setEstado(false);
        return empleadoservice.delete(EmpleadoEntity.builder().id(id).build());     
    }
}
