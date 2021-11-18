package com.sales4agro.controller;

import com.sales4agro.domain.Produto;
import com.sales4agro.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoServiceservice;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Produto> listar() {
        return this.produtoServiceservice.find();
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public Produto procurarPeloId(@PathVariable Long id) {
        return this.produtoServiceservice.findById(id);
    }
}
