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
import pe.com.svisamisa.entity.UsuarioEntity;
import pe.com.svisamisa.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuariorepository;

    @Override
    public List<UsuarioEntity> findAll() {
        return usuariorepository.findAll();
    }

    @Override
    public List<UsuarioEntity> findAllCustom() {
        return usuariorepository.findAllCustom();
    }

    @Override
    public Optional<UsuarioEntity> findById(Long id) {
        return usuariorepository.findById(id);
    }

    @Override
    public UsuarioEntity add(UsuarioEntity u) {
        return usuariorepository.save(u);
    }

    @Override
    public UsuarioEntity update(UsuarioEntity u) {
        UsuarioEntity objusuario=usuariorepository.getById(u.getId());
        BeanUtils.copyProperties(u, objusuario);
        return usuariorepository.save(objusuario);
    }

    @Override
    public UsuarioEntity delete(UsuarioEntity u) {
        UsuarioEntity objusuario=usuariorepository.getById(u.getId());
        objusuario.setEstado(false);
        return usuariorepository.save(objusuario);
    }
    
}
