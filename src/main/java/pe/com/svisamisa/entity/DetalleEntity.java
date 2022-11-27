/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.svisamisa.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="DetalleEntity")
@Table(name="detalles")
public class DetalleEntity implements Serializable{
     
   
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_detalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="cantidad")
    private double cantidad;
    @Column(name="precio")
    private double precio;
    @Column(name="total")
    private double total;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_producto", nullable=false)
    private ProductoEntity producto;
    
}
