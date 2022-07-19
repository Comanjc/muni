/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import pe.org.municipalidad.demo.servicios.PersonaService;




@Controller
@RequestMapping("/auth/main")
public class register_os {
    
    
    
    
     
         @Autowired
    private PersonaService personaservice ;
      
  @GetMapping("/register_os")
    public String notify( org.springframework.ui.Model model){
        
        model.addAttribute("persona", personaservice.readAll());
        
    return "/register_os";
    
    }
    
    
    
    
    
    
    
    /*
   @GetMapping("/auth/main/register_os")
    public String main(){
    
        
        return "/register_os";
    }*/
    
    
}
