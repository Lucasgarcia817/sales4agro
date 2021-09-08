package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Classes_serviços")
public class Classes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classesId;

    @Column(name = "nome")
    private String nome;

    public Classes(int classesId, String nome) {
        this.classesId = classesId;
        this.nome = nome;
    }

    public Classes() {

    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
