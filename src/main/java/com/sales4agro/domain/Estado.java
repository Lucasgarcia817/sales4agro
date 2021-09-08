package com.sales4agro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.PublicKey;

@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    private Integer codigoIBGE;

    @Column(name = "estado")
    private String estado;

    public Estado(){

    }

    public Estado(Integer codigoIBGE, String estado) {
        this.codigoIBGE = codigoIBGE;
        this.estado = estado;
    }

    public Integer getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Integer codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
