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
public class MenuspController {
    @GetMapping("/menusp")
    public String hola(){
    
    return"/menusp";
    }
    @GetMapping("/admisoli")
    public String admisol(){
    
    return"/admisoli";
    }
    @GetMapping("/histsoli")
    public String hist(){
    
    return"/histsoli";
    }
}
