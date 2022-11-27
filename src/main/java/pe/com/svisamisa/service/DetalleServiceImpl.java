
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.svisamisa.entity.DetalleEntity;
import pe.com.svisamisa.repository.DetalleRepository;

@Service
public class DetalleServiceImpl implements DetalleService{
    
    @Autowired
    private DetalleRepository detallerepository;
    
    @Override
    public List<DetalleEntity> findAll() {
        return detallerepository.findAll();
    }

    @Override
    public List<DetalleEntity> findAllCustom() {
        return detallerepository.findAllCustom();
    }

    @Override
    public Optional<DetalleEntity> findById(Long id) {
        return detallerepository.findById(id);
    }

    @Override
    public DetalleEntity add(DetalleEntity d) {
        return detallerepository.save(d);
    }

    @Override
    public DetalleEntity update(DetalleEntity d) {
        DetalleEntity objdetalle=detallerepository.getById(d.getId());
        BeanUtils.copyProperties(d,objdetalle);
        return detallerepository.save(objdetalle);
    }

    @Override
    public DetalleEntity delete(DetalleEntity d) {
        DetalleEntity objdetalle=detallerepository.getById(d.getId());
        objdetalle.setEstado(false);
        return detallerepository.save(objdetalle);
    }
}
