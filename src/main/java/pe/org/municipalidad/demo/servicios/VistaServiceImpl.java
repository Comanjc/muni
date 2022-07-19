/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import pe.org.municipalidad.demo.entity.Vista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.municipalidad.demo.repository.VistaRepository;


@Service
public class VistaServiceImpl implements VistaService {

    @Autowired
    private VistaRepository vistarepository;
    
    
    
    
    @Override
    public Vista create(Vista vista) {
        return vistarepository.save( vista);
    }

    @Override
    public Vista update(Vista vista) {
        return vistarepository.save(vista);
    }

    @Override
    public void delete(int id) {
        vistarepository.deleteById(id);
    }

    @Override
    public Vista read(int id) {
        return vistarepository.findById(id).get();
    }

    @Override
    public List<Vista> readAll() {
        return vistarepository.findAll();
    }

}
