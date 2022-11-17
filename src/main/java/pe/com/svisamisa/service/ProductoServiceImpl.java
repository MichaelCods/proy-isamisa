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
import pe.com.svisamisa.entity.ProductoEntity;
import pe.com.svisamisa.repository.ProductoRepository;

/**
 *
 * @author USER
 */
@Service
public class ProductoServiceImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository productorepository;
    
    
    @Override
    public List<ProductoEntity> findAll() {
        return productorepository.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return productorepository.findAllCustom();
    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return productorepository.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return productorepository.save(p);
    }

    @Override
    public ProductoEntity update(ProductoEntity p) {
        ProductoEntity objproducto=productorepository.getById(p.getId());
        BeanUtils.copyProperties(p, objproducto);
        return productorepository.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objproducto=productorepository.getById(p.getId());
        objproducto.setEstado(false);
        return productorepository.save(objproducto);
    }
    
    
}