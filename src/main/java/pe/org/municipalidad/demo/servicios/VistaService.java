/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import  pe.org.municipalidad.demo.entity.Vista;


public interface VistaService {
    Vista create(Vista  vista);
    Vista  update(Vista  vista);
    void delete(int id);
    Vista  read(int id);
    List<Vista > readAll();
}
