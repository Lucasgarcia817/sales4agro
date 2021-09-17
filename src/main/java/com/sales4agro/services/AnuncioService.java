package com.sales4agro.services;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Produto;
import com.sales4agro.repository.AnuncioRepository;
import com.sales4agro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class AnuncioService {
    private final AnuncioRepository anuncioRepository;
    private final ProdutoRepository produtoRepository;

    @Autowired
    public AnuncioService(AnuncioRepository anuncioRepository, ProdutoRepository produtoRepository) {
        this.anuncioRepository = anuncioRepository;
        this.produtoRepository = produtoRepository;
    }

    public List<Anuncio> findAll(){
        return anuncioRepository.findAll();
    }

}
