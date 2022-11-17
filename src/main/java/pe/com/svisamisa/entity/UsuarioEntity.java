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
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="UsuarioEntity")
@Table(name="usuarios")
public class UsuarioEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="id_usuario")
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private long id;
    @Column(name="direccion")
    private String direccion;
    @Column(name="email")
    private String email;
    @Column(name="contraseña")
    private String contraseña; 
    @Column(name="estado")
    private boolean estado;  
}
