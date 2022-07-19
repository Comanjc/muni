/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import  pe.org.municipalidad.demo.servicios.NotificacionService;




@Controller
  @RequestMapping("/auth/main")
public class MenuController {

    
    
         @Autowired
    private NotificacionService notificacionservice ;
      
  @GetMapping("/notifi_os")
    public String notify( org.springframework.ui.Model model){
        
        model.addAttribute("notificacion", notificacionservice.readAll());
        
    return "notifi_os";
    
    }
  
    @GetMapping("/menu")
    public String main(){
        return "menu";
        
    }
    
    
    

    
    

   
    
}
