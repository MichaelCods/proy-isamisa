/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.svisamisa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author USER
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name="OrdenesEntity")
@Table(name="ordenes")
public class OrdenesEntity implements Serializable{
    
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id")
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long id;
    
    @Column(name="fecha_creacion", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date fecha_creacion; 
    
    @Column(name="fecha_recibida", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date fecha_recibida;
    
    @Column(name="numero")
    private Integer numero;
   
    @Column(name="total")
    private double total;
    
    @Column(name="estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_usuario",nullable = false)
    private UsuarioEntity usuario;
    @OneToOne
    @JoinColumn(name="id_detalle",nullable = false)
    private DetalleEntity detalle;
}
