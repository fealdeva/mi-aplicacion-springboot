package com.investigacion.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class holaController {

    @GetMapping("/")
    public String hola(Model model) {
        model.addAttribute("mensaje", "Hola Mundo desde SpringBoot en la investigación Felipe Delgado Valverde");
        return "holamundo";
    }
    
}