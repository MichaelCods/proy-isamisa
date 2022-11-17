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
import pe.com.svisamisa.entity.OrdenesEntity;
import pe.com.svisamisa.service.OrdenesService;

@RestController
@RequestMapping("/orden")
public class OrdenesController {

    @Autowired
    private OrdenesService ordenesservicio;

    @GetMapping
    public List<OrdenesEntity> findAll() {
        return ordenesservicio.findAll();
    }

    @GetMapping("/custom")
    public List<OrdenesEntity> findAllCustom() {
        return ordenesservicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<OrdenesEntity> findById(@PathVariable Long id) {
        return ordenesservicio.findById(id);
    }

    @PostMapping
    public OrdenesEntity add(@RequestBody OrdenesEntity o) {
        return ordenesservicio.add(o);
    }

    @PutMapping("/{id}")
    public OrdenesEntity update(@PathVariable long id, @RequestBody OrdenesEntity o) {
        o.setId(id);
        return ordenesservicio.update(o);
    }

    @DeleteMapping("/{id}")
    public OrdenesEntity delete(@PathVariable long id) {
        OrdenesEntity objordenes = new OrdenesEntity();
        objordenes.setEstado(false);
        return ordenesservicio.delete(OrdenesEntity.builder().id(id).build());
    }
}
