
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
import pe.com.svisamisa.entity.ClienteEntity;
import pe.com.svisamisa.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteservice;
    
    @GetMapping
    public List<ClienteEntity>findAll(){
        return clienteservice.findAll();
    }
   
    @GetMapping("/custom")
    public List<ClienteEntity> findAllCustom() {
        return clienteservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<ClienteEntity> findById(@PathVariable Long id) {
        return clienteservice.findById(id);
    }  
    @PostMapping
    public ClienteEntity add(@RequestBody ClienteEntity c) {
        return clienteservice.add(c);
    }
    
    @PutMapping("/{id}")
    public ClienteEntity update(@PathVariable long id, @RequestBody ClienteEntity c) {
        c.setId(id);
        return clienteservice.update(c);
    }
    
    @DeleteMapping("/{id}")
    public ClienteEntity delete(@PathVariable long id) {
        ClienteEntity objcli=new ClienteEntity();
        objcli.setEstado(false);
        return clienteservice.delete(ClienteEntity.builder().id(id).build());     
    }
}
