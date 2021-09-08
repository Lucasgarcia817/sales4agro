package com.sales4agro.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

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

    @Column(name = "frete")
    private String frete;

    private UUID vendedorId;

    private UUID clienteId;

    private UUID formaPagamentoId;

    public Pedido(){

    }

    public Pedido(Integer id, Date dataPedido, String valorTotal, String frete, UUID vendedorId, UUID clienteId, UUID formaPagamentoId) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.frete = frete;
        this.vendedorId = vendedorId;
        this.clienteId = clienteId;
        this.formaPagamentoId = formaPagamentoId;
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

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public UUID getVendedorId() {
        return vendedorId;
    }

    public void setVendedorId(UUID vendedorId) {
        this.vendedorId = vendedorId;
    }

    public UUID getClienteId() {
        return clienteId;
    }

    public void setClienteId(UUID clienteId) {
        this.clienteId = clienteId;
    }

    public UUID getFormaPagamentoId() {
        return formaPagamentoId;
    }

    public void setFormaPagamentoId(UUID formaPagamentoId) {
        this.formaPagamentoId = formaPagamentoId;
    }
}
