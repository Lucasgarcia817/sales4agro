package com.sales4agro.services;

import com.sales4agro.domain.Produto;
import com.sales4agro.repository.ProdutoRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Transactional
public class ProdutoService {

    private ProdutoRepository produtoRepository;
    private List<Produto> produtos;

    public void createProdutoList() {
        if(produtos == null) {
            produtos = new ArrayList<>();
        }
    }

    public List<Produto> find() {
        createProdutoList();
        return produtos;
    }

    public Produto findById(Long id) {
        return produtos.stream().filter(t -> id == t.getId()).collect(Collectors.toList()).get(0);
    }
}
