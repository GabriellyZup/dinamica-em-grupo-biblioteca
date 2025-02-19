package br.com.biblioteca.controllers;




import org.springframework.web.bind.annotation.GetMapping;

import br.com.biblioteca.dtos.LivroRequestDTO;
import br.com.biblioteca.dtos.LivroResponseDTO;
import br.com.biblioteca.services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private LivroService livroService;

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<LivroResponseDTO>> listarLivros() {
        return ResponseEntity.ok(livroService.listarLivros());
    }

    @PostMapping
    public ResponseEntity<LivroResponseDTO> cradastrarLivro (@RequestBody LivroRequestDTO requestDTO){

        return ResponseEntity.ok(livroService.cadastraLivro(requestDTO));
    }
}
