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
    private UUID id;

    @Column(name="título")
    private String titulo;

    @Column(name="data")
    private Date data;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    public Anuncio() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setAnuncio_id(UUID id) {
        this.id = id;
    }

    public UUID getAnuncio_id() {
        return id;
    }
}
