/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author estef
 */

@Controller
public class actualizar_os {
    
       @GetMapping("/auth/main/actualizar_os")
    public String main(){
    
        
        return "/actualizar_os";
    }
    
}
