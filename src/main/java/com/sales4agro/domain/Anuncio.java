package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Anuncio")
public class Anuncio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    private CarrinhoDeCompras carrinhoDeCompras;

    @Column(name="título")
    private String titulo;

    @Column(name="usuario_anuncio_id")
    private String usuarioAnuncioId;

    @Column(name="tipo_anuncio")
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

    @Column(name="numero_telefone_fixo")
    private String numeroTelefoneFixo;

    @Column(name="numero_telefone_celular")
    private String numeroTelefoneCelular;

    @Column(name="data")
    private Date data;

    @Column(name = "produtoId")
    private UUID produtoId;

    @Column(name = "servicoId")
    private UUID servicoId;

    public Anuncio() {

    }

    public Anuncio(UUID id, CarrinhoDeCompras carrinhoDeCompras, String titulo, String usuarioAnuncioId, String tipoAnuncio, String descricao, String preco, String imagem, String email, String video, String numeroTelefoneFixo, String numeroTelefoneCelular, Date data, UUID produtoId, UUID servicoId) {
        this.id = id;
        this.carrinhoDeCompras = carrinhoDeCompras;
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
        this.produtoId = produtoId;
        this.servicoId = servicoId;
    }

    public CarrinhoDeCompras getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public UUID getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(UUID produtoId) {
        this.produtoId = produtoId;
    }

    public UUID getServicoId() {
        return servicoId;
    }

    public void setServicoId(UUID servicoId) {
        this.servicoId = servicoId;
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

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }
}
