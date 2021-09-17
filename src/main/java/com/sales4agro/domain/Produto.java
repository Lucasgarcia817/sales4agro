package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false)
    private UUID id;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "unidade")
    private String unidade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "preco", nullable = false)
    private String preco;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Video> videos;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private List<Imagem> imagens;

    public Produto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<Imagem> getImagens() {
        return imagens;
    }

    public void setImagens(List<Imagem> imagens) {
        this.imagens = imagens;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public Produto update(Produto produto){
        this.setDescricao(produto.getDescricao());
        this.setPreco(produto.getPreco());
        this.setQuantidade(produto.getQuantidade());

        return this;
    }
}
