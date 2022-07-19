/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.org.municipalidad.demo.entity.Sexo;
import pe.org.municipalidad.demo.repository.SexoRepository;

@Service
public class SexoServiceImpl implements  SexoService{
        @Autowired
    private SexoRepository sexoRepository ;
        
        
         @Override
    public Sexo create(Sexo sexo) {
        return sexoRepository.save( sexo);
    }

    @Override
    public Sexo update(Sexo vista) {
        return sexoRepository.save(vista);
    }

    @Override
    public void delete(int id) {
        sexoRepository.deleteById(id);
    }

    @Override
    public Sexo read(int id) {
        return sexoRepository.findById(id).get();
    }

    @Override
    public List<Sexo> readAll() {
        return sexoRepository.findAll();
    }

}
