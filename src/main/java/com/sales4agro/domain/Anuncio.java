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
    @Column(name = "id")
    private UUID anuncio_id;

    @Column(name="título")
    private String titulo;

    @Column(name="email")
    private String email;

    @Column(name="numero_telefone_fixo")
    private String numeroTelefoneFixo;

    @Column(name="numero_telefone_celular")
    private String numeroTelefoneCelular;

    @Column(name="data")
    private Date data;

    public Anuncio() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
