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
import pe.com.svisamisa.entity.ClienteEntity;
import pe.com.svisamisa.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienterepository;
    
    @Override
    public List<ClienteEntity> findAll() {
        return clienterepository.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return clienterepository.findAllCustom();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return clienterepository.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return clienterepository.save(c);
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcli=clienterepository.getById(c.getId());
        BeanUtils.copyProperties(c, objcli);
        return clienterepository.save(objcli);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcli=clienterepository.getById(c.getId());
        objcli.setEstado(false);
        return clienterepository.save(objcli);
    }
    
}
