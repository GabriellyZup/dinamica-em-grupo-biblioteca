package br.com.biblioteca.controllers;

import br.com.biblioteca.dtos.LivroRequestDTO;
import br.com.biblioteca.dtos.LivroResponseDTO;
import br.com.biblioteca.services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private LivroService livroService;


    @PostMapping
    public ResponseEntity<LivroResponseDTO> cradastrarLivro (@RequestBody LivroRequestDTO requestDTO){

        return ResponseEntity.ok(livroService.cadastraLivro(requestDTO));
    }
}
