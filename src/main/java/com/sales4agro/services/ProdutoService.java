package com.sales4agro.services;

import com.sales4agro.domain.Produto;
import com.sales4agro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public Produto update(Produto produto) {
        var produtoRecuperado = produtoRepository.findById(produto.getId())
                .map(produtoSalvo -> produtoSalvo.update(produto))
                .orElseThrow(() -> new ExpressionException("Não é possivel editar um produto inexistente!"));

        return save(produtoRecuperado);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void delete(Produto produto) {
        produtoRepository.delete(produtoRepository.findById(produto.getId())
                .orElseThrow(() -> new ExpressionException("Não é possivel deletar um produto inexistente!")));
    }
}
