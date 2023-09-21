package com.example.mainbooks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoLivro;
    private String titulo;
    private String autor;
    private String isbn;
    private String editora;

    // getters e setters
}
