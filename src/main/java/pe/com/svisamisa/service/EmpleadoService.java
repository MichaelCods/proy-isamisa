
package pe.com.svisamisa.service;

import java.util.List;
import java.util.Optional;
import pe.com.svisamisa.entity.EmpleadoEntity;


public interface EmpleadoService {
    List<EmpleadoEntity>findAll();
    List<EmpleadoEntity>findAllCustom();
    Optional<EmpleadoEntity>findById(Long id);
    EmpleadoEntity add(EmpleadoEntity e);
    EmpleadoEntity update(EmpleadoEntity e);
    EmpleadoEntity delete(EmpleadoEntity e);
}
