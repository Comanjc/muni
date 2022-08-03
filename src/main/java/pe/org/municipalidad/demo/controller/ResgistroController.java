/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pe.org.municipalidad.demo.entity.Persona;
import pe.org.municipalidad.demo.servicios.PersonaService;




@Controller
@RequestMapping("/auth/main")
public class ResgistroController {
    
    @Autowired
    private PersonaService personaservice ;
      
  @GetMapping("/all")
    public String notify( org.springframework.ui.Model model){    
    model.addAttribute("persona", personaservice.readAll());
        
    return "/Jd/junta";
    
    }
     
    @PostMapping("/add")
    public String savePed(@Valid @ModelAttribute Persona ped, BindingResult result, Model model, RedirectAttributes attributes) {
        personaservice.create(ped);
        //model.addAttribute("persona", personaservice.readAll());
        return "redirect:/auth/main/all";
    }
        
    @GetMapping("/form")
    public String createPed(Model model) {
        model.addAttribute("titulo", "Registrar Junta Directiva");
        model.addAttribute("persona", new Persona());
        return "/Jd/agregar";
    }
    
    @GetMapping("/del/{id}")
    public String deletePed(Model model, @PathVariable("id") Integer idper) {
        personaservice.delete(idper);
        return "redirect:/auth/main/all";
    }//PUT,PATCH,GET;DELETE,POST

    @GetMapping("/edit/{id}")
    public String editPed(Model model, @PathVariable("id") Integer idper) {
        Persona persona = personaservice.read(idper);
        model.addAttribute("titulo", "Modificar Registro");
        model.addAttribute("persona", persona);
        return "/Jd/agregar";
    }
    
    
    
}
