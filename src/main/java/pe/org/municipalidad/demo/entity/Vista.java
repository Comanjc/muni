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

/**
 *
 * @author estef
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vista")
@Entity
public class Vista implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idvista")
    private int id;
    
    private String nombre;
    private String tipo_os;
    private String fecha_emision;
    private String fecha_inicio;
    private String fecha_fin;

}
