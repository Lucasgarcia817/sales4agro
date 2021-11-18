package com.sales4agro.controller;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Carrinho;
import com.sales4agro.domain.Pedido;
import com.sales4agro.services.CarrinhoService;
import com.sales4agro.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;

    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public List<Anuncio> listar(@PathVariable UUID id) {
        return this.carrinhoService.verAnunciosDoCarrinho(id);
    }

    @RequestMapping(value = "/limpar", method = RequestMethod.GET)
    public void excluirCarrinho(@PathVariable UUID id){
        this.carrinhoService.excluirCarrinho(id);
    }
}
