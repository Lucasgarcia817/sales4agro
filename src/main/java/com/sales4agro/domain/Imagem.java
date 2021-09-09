package com.sales4agro.domain;

import javax.persistence.*;
import java.sql.Blob;
import java.util.UUID;

@Entity
@Table(name = "imagem")
public class Imagem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "imagem")
    private Blob imagem;

    public Imagem(){

    }

    public Imagem(UUID id, Blob imagem) {
        this.id = id;
        this.imagem = imagem;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }
}
