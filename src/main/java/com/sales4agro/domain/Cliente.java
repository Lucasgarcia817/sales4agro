package com.sales4agro.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome_social")
    private String nomeSocial;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "ativo")
    private Boolean ativo;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "UF")
    private Integer uf;

    @Column(name = "país")
    private Integer pais;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "complemento_endereço")
    private String complementoEndereco;

    @Column(name = "logradouro_endereço")
    private String logradouroEndereco;

    @Column(name = "número_endereço")
    private String numeroEndereco;

    @Column(name = "data_cadastro")
    private Date dataCadastro;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "email")
    private String email;

    @Column(name = "número_telefone_fixo")
    private String numeroFixo;

    @Column(name = "número_telefone_celular")
    private String numeroCelular;

    @Column(name = "senha")
    private String senha;

    public Cliente(){

    }

    public Cliente(String nomeSocial, String nomeFantasia, Boolean ativo, String bairro, String cidade, Integer uf, Integer pais, String cep, String complementoEndereco, String logradouroEndereco, String numeroEndereco, Date dataCadastro, Date dataNascimento, String email, String numeroFixo, String numeroCelular, String senha) {
        this.nomeSocial = nomeSocial;
        this.nomeFantasia = nomeFantasia;
        this.ativo = ativo;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.pais = pais;
        this.cep = cep;
        this.complementoEndereco = complementoEndereco;
        this.logradouroEndereco = logradouroEndereco;
        this.numeroEndereco = numeroEndereco;
        this.dataCadastro = dataCadastro;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroFixo = numeroFixo;
        this.numeroCelular = numeroCelular;
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getLogradouroEndereco() {
        return logradouroEndereco;
    }

    public void setLogradouroEndereco(String logradouroEndereco) {
        this.logradouroEndereco = logradouroEndereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroFixo() {
        return numeroFixo;
    }

    public void setNumeroFixo(String numeroFixo) {
        this.numeroFixo = numeroFixo;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

