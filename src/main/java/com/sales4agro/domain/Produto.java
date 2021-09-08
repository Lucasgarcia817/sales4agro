package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

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


    public Produto() {
    }

    public Produto(String descricao, String tipoProduto, String video, String imagem, String preco) {
        this.descricao = descricao;
        this.tipoProduto = tipoProduto;
        this.video = video;
        this.imagem = imagem;
        this.preco = preco;
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
