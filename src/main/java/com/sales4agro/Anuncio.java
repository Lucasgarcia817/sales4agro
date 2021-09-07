package com.sales4agro;

import com.sun.xml.internal.ws.developer.Serialization;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Anuncio")
public class Anuncio implements Serializable {
    @Serialization
    private static final long serialVersionUID = 1L;

    @Column(name="título")
    private String titulo;

    @Column(name="usuarioAnuncioId")
    private String usuarioAnuncioId ;

    @Column(name="tipoAnuncio")
    private String tipoAnuncio;

    @Column(name="descrição")
    private String descricao;

    @Column(name="preço")
    private String preco;

    @Column(name="imagem")
    private String imagem;

    @Column(name="email")
    private String email;

    @Column(name="vídeo")
    private String video;

    @Column(name="numeroTelefoneFixo")
    private String numeroTelefoneFixo;

    @Column(name="numeroTelefoneCelular")
    private String numeroTelefoneCelular;

    @Column(name="data")
    private Date data;
    @Id
    private Long id;

    public Anuncio() {

    }

    public Anuncio(String titulo, String usuarioAnuncioId, String tipoAnuncio, String descricao, String preco, String imagem, String email, String video, String numeroTelefoneFixo, String numeroTelefoneCelular, Date data) {
        this.titulo = titulo;
        this.usuarioAnuncioId = usuarioAnuncioId;
        this.tipoAnuncio = tipoAnuncio;
        this.descricao = descricao;
        this.preco = preco;
        this.imagem = imagem;
        this.email = email;
        this.video = video;
        this.numeroTelefoneFixo = numeroTelefoneFixo;
        this.numeroTelefoneCelular = numeroTelefoneCelular;
        this.data = data;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuarioAnuncioId() {
        return usuarioAnuncioId;
    }

    public void setUsuarioAnuncioId(String usuarioAnuncioId) {
        this.usuarioAnuncioId = usuarioAnuncioId;
    }

    public String getTipoAnuncio() {
        return tipoAnuncio;
    }

    public void setTipoAnuncio(String tipoAnuncio) {
        this.tipoAnuncio = tipoAnuncio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getNumeroTelefoneFixo() {
        return numeroTelefoneFixo;
    }

    public void setNumeroTelefoneFixo(String numeroTelefoneFixo) {
        this.numeroTelefoneFixo = numeroTelefoneFixo;
    }

    public String getNumeroTelefoneCelular() {
        return numeroTelefoneCelular;
    }

    public void setNumeroTelefoneCelular(String numeroTelefoneCelular) {
        this.numeroTelefoneCelular = numeroTelefoneCelular;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
