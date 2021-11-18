package com.sales4agro.controller;

import com.sales4agro.domain.Pedido;
import com.sales4agro.domain.Produto;
import com.sales4agro.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public List<Pedido> listar() {
        return this.pedidoService.verPedidos();
    }
}
