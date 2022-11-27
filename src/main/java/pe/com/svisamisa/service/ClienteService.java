/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.ClienteEntity;

public interface ClienteService {
    
    List<ClienteEntity>findAll();
    List<ClienteEntity>findAllCustom();
    Optional<ClienteEntity>findById(Long id);
    ClienteEntity add(ClienteEntity c);
    ClienteEntity update(ClienteEntity c);
    ClienteEntity delete(ClienteEntity c);
    
}
