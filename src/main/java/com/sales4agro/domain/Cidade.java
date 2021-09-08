package com.sales4agro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cidade")
public class Cidade {
    @Id
    private Integer codigoIBGE;

    @Column(name = "Cidade")
    private String cidade;

    public Cidade(){

    }

    public Cidade(Integer codigoIBGE, String cidade) {
        this.codigoIBGE = codigoIBGE;
        this.cidade = cidade;
    }

    public Integer getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Integer codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
