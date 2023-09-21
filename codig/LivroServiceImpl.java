package com.example.mainbooks.service;

import com.example.mainbooks.model.Livro;
import com.example.mainbooks.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    @Override
    public Livro buscarLivro(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    @Override
    public void salvarLivro(Livro livro) {
        livroRepository.save(livro);
    }

    @Override
    public void editarLivro(Livro livro) {
        livroRepository.save(livro);
    }

    @Override
    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
