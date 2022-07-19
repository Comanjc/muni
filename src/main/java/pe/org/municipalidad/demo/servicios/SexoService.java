/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import pe.org.municipalidad.demo.entity.Sexo;


public interface SexoService {
      Sexo create(Sexo  sexo);
    Sexo  update(Sexo  sexo);
    void delete(int id);
    Sexo  read(int id);
    List<Sexo > readAll();
}
