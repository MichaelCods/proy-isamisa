/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.UsuarioEntity;

public interface UsuarioService{
    List<UsuarioEntity>findAll();
    List<UsuarioEntity>findAllCustom();
    Optional<UsuarioEntity> findById(Long id);
    UsuarioEntity add(UsuarioEntity u);
    UsuarioEntity update(UsuarioEntity u);
    UsuarioEntity delete(UsuarioEntity u);      
     
}