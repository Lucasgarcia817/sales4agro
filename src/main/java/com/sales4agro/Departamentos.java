package com.sales4agro;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Departamentos produtos")
public class Departamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String departamentoId;

    @Column(name = "nome")
    private String nome;

    public Departamentos(String departamentoId, String nome) {
        this.departamentoId = departamentoId;
        this.nome = nome;
    }

    public Departamentos() {

    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
