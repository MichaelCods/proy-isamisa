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
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ProductoEntity")
@Table(name="productos")
public class ProductoEntity implements Serializable{
   
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="imagen")
    private byte[] imagen;
    @Column(name="nombre")
    private String  nombre;
    @Column(name="precio")
    private double precio;
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_usuario",nullable=false)
    private UsuarioEntity usuario;    
}