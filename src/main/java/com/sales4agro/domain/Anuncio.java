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
    private UUID anuncio_id;

    @Column(name="título")
    private String titulo;

    @Column(name="usuario_anuncio_id")
    private String usuarioAnuncioId;

    @Column(name="tipo_anuncio")
    private String tipoAnuncio;

    @Column(name="email")
    private String email;

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

    public Anuncio(UUID anuncio_id, String titulo, String usuarioAnuncioId, String tipoAnuncio, String email, String numeroTelefoneFixo, String numeroTelefoneCelular, Date data, UUID produtoId, UUID servicoId) {
        this.anuncio_id = anuncio_id;
        this.titulo = titulo;
        this.usuarioAnuncioId = usuarioAnuncioId;
        this.tipoAnuncio = tipoAnuncio;
        this.email = email;
        this.numeroTelefoneFixo = numeroTelefoneFixo;
        this.numeroTelefoneCelular = numeroTelefoneCelular;
        this.data = data;
        this.produtoId = produtoId;
        this.servicoId = servicoId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public void setAnuncio_id(UUID anuncio_id) {
        this.anuncio_id = anuncio_id;
    }

    public UUID getAnuncio_id() {
        return anuncio_id;
    }
}
