package com.sales4agro;

import com.sun.xml.internal.ws.developer.Serialization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Serviços")
public class Servicos implements Serializable {
    @Serialization
    private static final long serialVersionUID = 1L;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "vídeo")
    private String video;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "preço")
    private String preco;

    @Column(name = "tipo serviço")
    private String tipoServico;
    @Id
    private Long id;

    public Servicos(String descricao, String video, String imagem, String preco, String tipoServico) {
        this.descricao = descricao;
        this.video = video;
        this.imagem = imagem;
        this.preco = preco;
        this.tipoServico = tipoServico;
    }

    public Servicos() {

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

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}