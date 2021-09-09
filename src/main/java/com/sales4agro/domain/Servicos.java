package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Servicos")
public class Servicos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "descrição")
    private String descricao;

    @Column(name = "vídeo")
    private String video;

    @Column(name = "imagem")
    private String imagem;

    @Column(name = "preço")
    private String preco;

    @Column(name = "tipo_serviço")
    private String tipoServico;

    @OneToMany
    @JoinColumn(name = "servico_id")
    private List<Anuncio> anuncios;

    public Servicos(String descricao, String video, String imagem, String preco, String tipoServico) {
        this.descricao = descricao;
        this.video = video;
        this.imagem = imagem;
        this.preco = preco;
        this.tipoServico = tipoServico;
    }

    public Servicos() {

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

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}