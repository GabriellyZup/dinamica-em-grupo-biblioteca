package br.com.biblioteca.controllers;

import br.com.biblioteca.dtos.LivroResponseDTO;
import br.com.biblioteca.services.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<LivroResponseDTO>> listarLivros() {
        return ResponseEntity.ok(livroService.listarLivros());
    }

}
