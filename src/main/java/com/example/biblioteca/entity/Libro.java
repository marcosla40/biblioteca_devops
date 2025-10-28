package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Data // Evita definir los getters y setters
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Se generara de forma automatica
    private Long id;

    @Column(name = "titulo_libro", nullable = false) // Al ponerlo a posterior, hay que modificar la propiedad ...
    private String titulo;

    @Column(name="autor_libro") // Como se va a llamar en la base de datos
    private String autor;
}
