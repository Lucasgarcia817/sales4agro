package com.sales4agro.domain;

import javax.persistence.*;

@Entity
@Table(name = "FormaPagamento")
public class FormaPagamento{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "formaPagamento")
    private Integer formaPagamento;

    public FormaPagamento(){

    }

    public FormaPagamento(Integer id, Integer formaPagamento) {
        this.id = id;
        this.formaPagamento = formaPagamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
