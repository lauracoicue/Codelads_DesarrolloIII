package com.ejemplo.holamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Indica que esta clase es un controlador que maneja peticiones web

public class HolaMundoController {
    @GetMapping("/hola") //Define cuando un usuario visite, expone el endpoint
    public String hola() {
    return "Hola Mundo desde Sprint Boot!";
    }
}
