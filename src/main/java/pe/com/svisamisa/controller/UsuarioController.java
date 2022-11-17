/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import pe.com.svisamisa.entity.UsuarioEntity;
import pe.com.svisamisa.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioservicio;
    
    @GetMapping
    public List<UsuarioEntity>finAll(){
        return usuarioservicio.findAll();
    }
   
    @GetMapping("/custom")
    public List<UsuarioEntity> findAllCustom() {
        return usuarioservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioEntity> findById(@PathVariable Long id) {
        return usuarioservicio.findById(id);
    }

    @PostMapping
    public UsuarioEntity add(@RequestBody UsuarioEntity u) {
        return usuarioservicio.add(u);
    }
    
    @PutMapping("/{id}")
    public UsuarioEntity update(@PathVariable long id, @RequestBody UsuarioEntity u) {
        u.setId(id);
        return usuarioservicio.update(u);
    }
    
    @DeleteMapping("/{id}")
    public UsuarioEntity delete(@PathVariable long id) {
        UsuarioEntity objusuario=new UsuarioEntity();
        objusuario.setEstado(false);
        return usuarioservicio.delete(UsuarioEntity.builder().id(id).build());     
    }       
    
}
