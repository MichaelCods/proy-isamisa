
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
