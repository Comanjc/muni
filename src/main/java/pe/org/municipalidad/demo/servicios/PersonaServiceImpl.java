/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.municipalidad.demo.entity.Persona;
import pe.org.municipalidad.demo.repository.PersonaRepository;


@Service
public class PersonaServiceImpl implements  PersonaService{
    
    @Autowired
    private PersonaRepository  personarepository;
    
    
    
    
    @Override
    public Persona create(Persona vista) {
        return personarepository.save( vista);
    }

    @Override
    public Persona update(Persona vista) {
        return personarepository.save(vista);
    }

    @Override
    public void delete(int id) {
        personarepository.deleteById(id);
    }

    @Override
    public Persona read(int id) {
        return personarepository.findById(id).get();
    }

    @Override
    public List<Persona> readAll() {
        return personarepository.findAll();
    }

    
    
    
}
