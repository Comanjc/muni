/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import pe.org.municipalidad.demo.entity.Persona;

/**
 *
 * @author estef
 */
public interface PersonaService {
        Persona create(Persona persona);
    Persona  update(Persona persona  );
    void delete(int id);
    Persona  read(int id);
    List<Persona > readAll();
}
