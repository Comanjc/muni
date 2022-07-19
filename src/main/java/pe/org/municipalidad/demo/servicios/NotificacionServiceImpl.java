/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import pe.org.municipalidad.demo.entity.Notificacion;
import pe.org.municipalidad.demo.repository.NotificacionRepository;

/**
 *
 * @author estef
 */
public class NotificacionServiceImpl   implements  NotificacionService{
    
       @Autowired
    private NotificacionRepository  notificacionRepository;
    
    
    
    
    @Override
    public Notificacion create(Notificacion vista) {
        return notificacionRepository.save( vista);
    }

    @Override
    public Notificacion update(Notificacion vista) {
        return notificacionRepository.save(vista);
    }

    @Override
    public void delete(int id) {
        notificacionRepository.deleteById(id);
    }

    @Override
    public Notificacion read(int id) {
        return notificacionRepository.findById(id).get();
    }

    @Override
    public List<Notificacion> readAll() {
        return notificacionRepository.findAll();
    }
}
