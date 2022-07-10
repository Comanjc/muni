/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.org.municipalidad.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/main")
public class LoginController {

    @GetMapping("/login")
    public String main() {
        return "/login";
    }
    
    @GetMapping( "/recuperarcontra")
    public String recu (){
    
    return"/recuperarcontra";
    }

}
