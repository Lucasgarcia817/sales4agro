package com.sales4agro.domain;

import javax.persistence.*;

@Entity
@Table(name="Departamentos")
public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer departamentoId;

    @Column(name = "nome")
    private String nome;

    public Departamentos(int departamentoId, String nome) {
        this.departamentoId = departamentoId;
        this.nome = nome;
    }

    public Departamentos() {

    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Integer departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
