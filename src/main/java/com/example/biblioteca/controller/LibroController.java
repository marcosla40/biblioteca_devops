package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.LibroServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class LibroController {

    private final LibroServiceImpl libroServiceImpl; //Se inyecta dependencia

    public LibroController(LibroServiceImpl libroServiceImpl) {
        this.libroServiceImpl = libroServiceImpl;
    }

    @GetMapping
    public List<Libro> obtenerTodos() {
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id) {
        return this.libroServiceImpl.getLibro(id);

    }

    @PostMapping
    void guardarOActualizarLibro(@RequestBody Libro libro) {
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @DeleteMapping("/{libroId}")
    void eliminarLibro(@PathVariable("libroId") Long libroId) {
        this.libroServiceImpl.eliminarLibro(libroId);
    }

}
