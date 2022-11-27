
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.svisamisa.entity.RolesEntity;
import pe.com.svisamisa.repository.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService{

    @Autowired
    private RolesRepository rolesrepository;
    
    @Override
    public List<RolesEntity> findAll() {
        return rolesrepository.findAll();
    }

    @Override
    public List<RolesEntity> findAllCustom() {
        return rolesrepository.findAllCustom();
    }

    @Override
    public Optional<RolesEntity> findById(Long id) {
        return rolesrepository.findById(id);
    }

    @Override
    public RolesEntity add(RolesEntity r) {
        return rolesrepository.save(r);
    }

    @Override
    public RolesEntity update(RolesEntity r) {
        RolesEntity objroles=rolesrepository.getById(r.getId());
        BeanUtils.copyProperties(r,objroles);
        return rolesrepository.save(objroles);
    }

    @Override
    public RolesEntity delete(RolesEntity r) {
        RolesEntity objroles=rolesrepository.getById(r.getId());
        objroles.setEstado(false);
        return rolesrepository.save(objroles);
    }
    
}
