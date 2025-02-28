package com.investigacion.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class holaController {

    @GetMapping("/")
    public String hola(Model model) {
        model.addAttribute("mensaje", "HOLA MUNDO! DESDE SPRING BOOT! Investigación creada por Felipe Delgado Valverde como evidencia.");
        return "holamundo";
    }
    
}