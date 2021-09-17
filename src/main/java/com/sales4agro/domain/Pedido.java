package com.sales4agro.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "dataPedido")
    private Date dataPedido;

    @Column(name = "valorTotal")
    private String valorTotal;

    @OneToOne
    @JoinColumn(name = "forma_pagamento_id")
    private FormaPagamento formaPagamentoId;

    @OneToOne
    @JoinColumn(name = "carrinho_id")
    private Carrinho carrinho;

    public Pedido(){

    }

    public FormaPagamento getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(FormaPagamento formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
