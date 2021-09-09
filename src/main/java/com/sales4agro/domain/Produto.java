package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "unidade")
    private String unidade;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "tipo_produto")
    private String tipoProduto;

    @Column(name = "vídeo")
    private String video;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "preço")
    private String preco;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Anuncio> anuncios;

    public Produto() {
    }

    public Produto(UUID id, Integer quantidade, String unidade, String descricao, String tipoProduto, String video, String imagem, String preco) {
        this.id = id;
        this.quantidade = quantidade;
        this.unidade = unidade;
        this.descricao = descricao;
        this.tipoProduto = tipoProduto;
        this.video = video;
        this.imagem = imagem;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
