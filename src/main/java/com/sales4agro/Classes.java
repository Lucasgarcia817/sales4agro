package com.sales4agro;

import javax.persistence.*;

@Entity
@Table(name = "Classes serviços")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String classesId;

    @Column(name = "nome")
    private String nome;

    public Classes(String classesId, String nome) {
        this.classesId = classesId;
        this.nome = nome;
    }

    public Classes() {

    }

    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
