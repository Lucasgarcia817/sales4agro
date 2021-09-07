package com.sales4agro;

import com.sun.xml.internal.ws.developer.Serialization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Produto")
public class Produto implements Serializable {
    @Serialization
    private static final long serialVersionUID = 1L;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "tipo produto")
    private String tipoProduto;

    @Column(name = "vídeo")
    private String video;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "preço")
    private String preco;
    @Id
    private Long id;

    public Produto() {
    }

    public Produto(String descricao, String tipoProduto, String video, String imagem, String preco) {
        this.descricao = descricao;
        this.tipoProduto = tipoProduto;
        this.video = video;
        this.imagem = imagem;
        this.preco = preco;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
