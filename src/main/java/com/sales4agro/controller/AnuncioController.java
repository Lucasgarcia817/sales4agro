package com.sales4agro.controller;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Produto;
import com.sales4agro.services.AnuncioService;
import com.sales4agro.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/anuncio")
public class AnuncioController {
    private final AnuncioService anuncioService;
    private final ProdutoService produtoService;

    public AnuncioController(AnuncioService anuncioService, ProdutoService produtoService) {
        this.anuncioService = anuncioService;
        this.produtoService = produtoService;
    }

    @PostMapping("/publicar")
    public Anuncio cadastroAnuncio(@RequestBody Produto produto,
                                   @RequestBody Anuncio anuncio){
        produtoService.save(produto);
        anuncio.setProduto(produto);
        anuncioService.save(anuncio);

        return anuncio;
    }

    @GetMapping("/listagem")
    public ResponseEntity<?> teste(){
        var anuncios = anuncioService.findAll();
        return ResponseEntity.ok(anuncios);
    }
}
