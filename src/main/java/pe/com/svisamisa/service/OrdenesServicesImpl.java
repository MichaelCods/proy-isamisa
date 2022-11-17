/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.svisamisa.entity.OrdenesEntity;
import pe.com.svisamisa.repository.OrdenesRepository;

@Service
public class OrdenesServicesImpl implements OrdenesService{
    @Autowired
    private OrdenesRepository ordenesrepository;
    
    @Override
    public List<OrdenesEntity> findAll() {
        return ordenesrepository.findAll();
    }

    @Override
    public List<OrdenesEntity> findAllCustom() {
        return ordenesrepository.findAllCustom();
    }

    @Override
    public Optional<OrdenesEntity> findById(Long id) {
        return ordenesrepository.findById(id);
    }

    @Override
    public OrdenesEntity add(OrdenesEntity o) {
        return ordenesrepository.save(o);
    }

    @Override
    public OrdenesEntity update(OrdenesEntity o) {
        OrdenesEntity objordenes=ordenesrepository.getById(o.getId());
        BeanUtils.copyProperties(o, objordenes);
        return ordenesrepository.save(objordenes);
    }

    @Override
    public OrdenesEntity delete(OrdenesEntity o) {
        OrdenesEntity objordenes=ordenesrepository.getById(o.getId());
        objordenes.setEstado(false);
        return ordenesrepository.save(objordenes);
    }
}