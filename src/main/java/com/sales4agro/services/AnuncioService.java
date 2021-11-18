package com.sales4agro.services;

import com.sales4agro.domain.Anuncio;
import com.sales4agro.domain.Produto;
import com.sales4agro.repository.AnuncioRepository;
import com.sales4agro.repository.ProdutoRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
@Transactional
public class AnuncioService {
    private AnuncioRepository anuncioRepository;
    private List<Anuncio> anuncios;

    public void createAnuncioList() {
        if(anuncios == null) {
            anuncios = new ArrayList<>();
        }
    }

    public List<Anuncio> find() {
        createAnuncioList();
        return anuncios;
    }

    public Anuncio findById(UUID id) {
        return anuncios.stream().filter(t -> id == t.getId()).collect(Collectors.toList()).get(0);
    }
}