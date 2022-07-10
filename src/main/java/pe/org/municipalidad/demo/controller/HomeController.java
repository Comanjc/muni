/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import pe.org.municipalidad.demo.servicios.VistaService;


@Controller
public class HomeController {
    
    @Autowired
    private VistaService vistaservice ;
      
    @GetMapping()
    public String index( org.springframework.ui.Model model){
        
        model.addAttribute("vista", vistaservice.readAll());
        
    return "Interface";
    
    }
    
      @GetMapping("/Interface")
    public String inter(){
    return "Interface";
    
    }
    
    
    
    
  
    
}
