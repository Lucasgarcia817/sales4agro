package com.sales4agro.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "carrinho")
public class Carrinho{
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToMany
    @JoinColumn(name = "carrinho_id")
    private List<Anuncio> anuncios;

    public Carrinho(){

    }

    public Carrinho(UUID id, List<Anuncio> anuncio) {
        this.id = id;
        this.anuncios = anuncio;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
