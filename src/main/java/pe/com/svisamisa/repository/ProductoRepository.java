/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.svisamisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.svisamisa.entity.ProductoEntity;


public interface ProductoRepository  extends JpaRepository<ProductoEntity, Long>{
    @Query("Select p from ProductoEntity p where p.estado=1")
    List<ProductoEntity>findAllCustom();
    
}