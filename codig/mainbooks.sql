CREATE DATABASE mainbooks;

USE mainbooks;

CREATE TABLE livro (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo_livro VARCHAR(255),
    titulo VARCHAR(255),
    autor VARCHAR(255),
    isbn VARCHAR(255),
    editora VARCHAR(255)
);
