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
import pe.com.svisamisa.entity.CategoriaEntity;
import pe.com.svisamisa.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    private CategoriaRepository categoriarepository;
    
    @Override
    public List<CategoriaEntity> findAll() {
        return categoriarepository.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriarepository.findAllCustom();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriarepository.findById(id);
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return categoriarepository.save(c);
    }
    

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcate=categoriarepository.getById(c.getId());
        BeanUtils.copyProperties(c,objcate);
        return categoriarepository.save(objcate);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcate=categoriarepository.getById(c.getId());
        objcate.setEstado(false);
        return categoriarepository.save(objcate);
    }
    
}
