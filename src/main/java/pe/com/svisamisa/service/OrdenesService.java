/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.OrdenesEntity;

/**
 *
 * @author USER
 */
public interface OrdenesService {
    List<OrdenesEntity>findAll();
    List<OrdenesEntity>findAllCustom();
    Optional<OrdenesEntity>findById(Long id);
    OrdenesEntity add(OrdenesEntity o);
    OrdenesEntity update(OrdenesEntity o);
    OrdenesEntity delete(OrdenesEntity o); 
}
