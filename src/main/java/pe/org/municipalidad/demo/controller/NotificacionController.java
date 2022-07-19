/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pe.org.municipalidad.demo.servicios.NotificacionService;

/**
 *
 * @author estef
 */

@Controller
public class NotificacionController {
    
    
    
     /*   @Autowired
    private  NotificacionService notificacionService;

    @GetMapping()
    public String lol( org.springframework.ui.Model model){

        model.addAttribute("notificacion", notificacionService.readAll());

    return "notifi_os";

    }*/
    
    
      
        @GetMapping("/notifi_os")
    public String notifica(){
    
        return "notifi_os";
    
    }
    
}
    

