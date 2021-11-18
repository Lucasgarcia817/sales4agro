package com.sales4agro.controller;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Produto;
import com.sales4agro.services.AnuncioService;
import com.sales4agro.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {
    @Autowired
    private AnuncioService anuncioService;

    @RequestMapping(value = "/lista", method = RequestMethod.GET)
    public List<Anuncio> listar() {
        return this.anuncioService.find();
    }

    @RequestMapping(value = "/pesquisar", method = RequestMethod.GET)
    public Anuncio procurarPeloId(@PathVariable UUID id) {
        return this.anuncioService.findById(id);
    }
}
