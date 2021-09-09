package com.sales4agro.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "carrinho")
public class Carrinho{
    @Id
    @Column(name = "id")
    private UUID id;

    @OneToMany
    @JoinColumn(name = "anuncio_id")
    private List<Anuncio> anuncio;

    public Carrinho(){

    }

    public Carrinho(UUID id, List<Anuncio> anuncio) {
        this.id = id;
        this.anuncio = anuncio;
    }

    public List<Anuncio> getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(List<Anuncio> anuncio) {
        this.anuncio = anuncio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
