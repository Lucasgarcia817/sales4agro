package com.sales4agro.controller;

import com.sales4agro.domain.Produto;
import com.sales4agro.services.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/listagem")
    public ResponseEntity<?> teste(){
        var produtos = produtoService.findAll();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping("/cadastrar")
    public Produto cadastroProdutos(@RequestBody Produto produto){
        return produtoService.save(produto);
    }

}
