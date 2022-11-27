
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
import pe.com.svisamisa.entity.RolesEntity;
import pe.com.svisamisa.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {
    
    @Autowired
    private RolesService rolesservicio;
    
    @GetMapping
    public List<RolesEntity> findAll() {
        return rolesservicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<RolesEntity> findAllCustom() {
        return rolesservicio.findAll();
    }

    @GetMapping("/{id}")
    public Optional<RolesEntity> findById(@PathVariable Long id) {
        return rolesservicio.findById(id);
    }

    @PostMapping
    public RolesEntity add(@RequestBody RolesEntity r) {
        return rolesservicio.add(r);
    }
    
    @PutMapping("/{id}")
    public RolesEntity update(@PathVariable long id, @RequestBody RolesEntity r) {
        r.setId(id);
        return rolesservicio.update(r);
    }
    
    @DeleteMapping("/{id}")
    public RolesEntity delete(@PathVariable long id) {
        RolesEntity objroles=new RolesEntity();
        objroles.setEstado(false);
        return rolesservicio.delete(RolesEntity.builder().id(id).build());     
    }
}
