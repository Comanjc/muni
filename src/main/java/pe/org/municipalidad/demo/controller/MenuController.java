/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author estef
 */

@Controller
  @RequestMapping("/auth/main")
public class MenuController {
    
  
    @GetMapping("/menu")
    public String main(){
        return "menu";
    }
   
        @GetMapping("/notifi_os")
    public String notifica(){
    
        return "notifi_os";
    
    }
    
}
