/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notificaciones")
@Entity
public class Notificacion implements  Serializable{
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idnotificacion")
    private int idnotificacion;
    
    private String descripcion;
    private String documento;
    private String responsable;
    private String fecha;
    private String estado;
    
    
}
