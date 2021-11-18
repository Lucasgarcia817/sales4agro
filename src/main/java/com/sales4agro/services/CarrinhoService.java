package com.sales4agro.services;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Carrinho;
import com.sales4agro.repository.CarrinhoRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@Transactional
public class CarrinhoService {
    private CarrinhoRepository carrinhoRepository;

    public List<Anuncio> verAnunciosDoCarrinho(UUID id){
        return carrinhoRepository.findById(id).map(Carrinho::getAnuncios).orElse(null);
    }

    public void excluirCarrinho(UUID id){
        carrinhoRepository.deleteById(id);
    }
}
