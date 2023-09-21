package com.example.mainbooks.controller;

import com.example.mainbooks.model.Livro;
import com.example.mainbooks.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping("/")
    public String listarLivros(Model model) {
        List<Livro> livros = livroService.listarLivros();
        model.addAttribute("livros", livros);
        return "listagem";
    }

    @GetMapping("/adicionar")
    public String adicionarLivroForm(Model model) {
        model.addAttribute("livro", new Livro());
        return "formulario";
    }

    @PostMapping("/adicionar")
    public String adicionarLivro(@ModelAttribute Livro livro) {
        livroService.salvarLivro(livro);
        return "redirect:/livros/";
    }

    @GetMapping("/editar/{id}")
    public String editarLivroForm(@PathVariable Long id, Model model) {
        Livro livro = livroService.buscarLivro(id);
        model.addAttribute("livro", livro);
        return "formulario";
    }

    @PostMapping("/editar/{id}")
    public String editarLivro(@ModelAttribute Livro livro) {
        livroService.editarLivro(livro);
        return "redirect:/livros/";
    }

    @GetMapping("/excluir/{id}")
    public String excluirLivro(@PathVariable Long id) {
        livroService.excluirLivro(id);
        return "redirect:/livros/";
    }
}
