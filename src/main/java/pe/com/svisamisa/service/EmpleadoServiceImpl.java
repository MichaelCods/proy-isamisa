
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.svisamisa.entity.EmpleadoEntity;
import pe.com.svisamisa.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

    @Autowired
    private EmpleadoRepository empleadorepository;
    
    @Override
    public List<EmpleadoEntity> findAll() {
        return empleadorepository.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return empleadorepository.findAllCustom();
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return empleadorepository.findById(id);
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity e) {
        return empleadorepository.save(e);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity e) {
        EmpleadoEntity objemp=empleadorepository.getById(e.getId());
        BeanUtils.copyProperties(e, objemp);
        return empleadorepository.save(objemp);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity e) {
        EmpleadoEntity objemp=empleadorepository.getById(e.getId());
        objemp.setEstado(false);
        return empleadorepository.save(objemp);
    }
    
}
