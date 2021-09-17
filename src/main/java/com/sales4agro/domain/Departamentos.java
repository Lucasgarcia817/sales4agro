package com.sales4agro.domain;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="Departamentos")
public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID departamentoId;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    @JoinColumn(name = "departamento_id")
    private List<Produto> produtos;

    public UUID getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(UUID departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
