package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "classes")
public class Classes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID classesId;

    @Column(name = "nome")
    private String nome;

    @OneToMany
    @JoinColumn(name = "classes_id")
    private List<Servicos> servicos;

    public UUID getClassesId() {
        return classesId;
    }

    public void setClassesId(UUID classesId) {
        this.classesId = classesId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
