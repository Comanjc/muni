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
@Table(name = "persona")
@Entity
public class Persona implements  Serializable{
    
    
    
      @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpersona")
    private int id;
    
    private String cargo;
    private String responsable;
    private String ape_p;
    private String ape_m;
    private String dni;
    private String fecha;
    private String sexo;

 
    
    
    
    
}
