package com.example.biblioteca;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Una clase que va a responder a peticiones HTTP
@RequestMapping("/") // La ruta que vamos a tener que escribir en el navegador para que se ejecute
public class BienvenidaController {

    @GetMapping // Cuando en la URL hagamos una peticion Get, entre parentesis podriamos especificar la ruta: @GetMapping("")
    public String bienvenida() { return "Bienvenid@ al IES Monte Naranco";}
}
