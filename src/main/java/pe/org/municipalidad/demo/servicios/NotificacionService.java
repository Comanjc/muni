/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import pe.org.municipalidad.demo.entity.Notificacion;


public interface NotificacionService {

    Notificacion create(Notificacion  notificacion);
    Notificacion update(Notificacion  notificacion);
    void delete(int id);
    Notificacion  read(int id);
    List<Notificacion> readAll();
    
    
    
    
}
