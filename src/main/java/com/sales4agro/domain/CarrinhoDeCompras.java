package com.sales4agro.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CarrinhoDeCompras")
public class CarrinhoDeCompras {
    @Id
    @Column(name = "carrinhoCompraId")
    private UUID carrinhoCompraId;

    @Column(name = "anuncioId")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carrinhodecompras")
    private List<Anuncio> anuncios = new ArrayList<>();

    public CarrinhoDeCompras(){

    }

    public CarrinhoDeCompras(UUID carrinhoCompraId, List<Anuncio> anuncios) {
        this.carrinhoCompraId = carrinhoCompraId;
        this.anuncios = anuncios;
    }

    public UUID getCarrinhoCompraId() {
        return carrinhoCompraId;
    }

    public void setCarrinhoCompraId(UUID carrinhoCompraId) {
        this.carrinhoCompraId = carrinhoCompraId;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }
}
