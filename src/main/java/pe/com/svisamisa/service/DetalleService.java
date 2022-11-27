/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.DetalleEntity;

public interface DetalleService {
    List<DetalleEntity>findAll();
    List<DetalleEntity>findAllCustom();
    Optional<DetalleEntity>findById(Long id);
    DetalleEntity add(DetalleEntity d);
    DetalleEntity update(DetalleEntity d);
    DetalleEntity delete(DetalleEntity d);
}
