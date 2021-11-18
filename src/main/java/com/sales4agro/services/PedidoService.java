package com.sales4agro.services;

import com.sales4agro.domain.Pedido;
import com.sales4agro.repository.CarrinhoRepository;
import com.sales4agro.repository.PedidoRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class PedidoService {
    private PedidoRepository pedidoRepository;

    public List<Pedido> verPedidos(){
        return pedidoRepository.findAll();
    }
}
