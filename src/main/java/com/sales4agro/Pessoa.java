package com.sales4agro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "Pessoa")
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo usuario")
    private String tipoUsuario;

    @Column(name = "tipo pessoa")
    private String tipoPessoa;

    @Column(name = "nome social")
    private String nomeSocial;

    @Column(name = "nome fantasia")
    private String nomeFantasia;

    @Column(name = "ativo")
    private String ativo;

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

    @Column(name = "complemento endereço")
    private String complementoEndereco;

    @Column(name = "logradouro endereço")
    private String logradouroEndereco;

    @Column(name = "número endereço")
    private String numeroEndereco;

    @Column(name = "data cadastro")
    private Date dataCadastro;

    @Column(name = "data nascimento")
    private Date dataNascimento;

    @Column(name = "email")
    private String email;

    @Column(name = "número telefone fixo")
    private String numeroFixo;

    @Column(name = "número telefone celular")
    private String numeroCelular;

    @Column(name = "senha")
    private String senha;

    public Pessoa(){

    }

    public Pessoa(Integer id, String tipoUsuario, String tipoPessoa, String nomeSocial, String nomeFantasia, String ativo, String bairro, String cidade, Integer uf, Integer pais, String cep, String complementoEndereco, String logradouroEndereco, String numeroEndereco, Date dataCadastro, Date dataNascimento, String email, String numeroFixo, String numeroCelular, String senha) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
        this.tipoPessoa = tipoPessoa;
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
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

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
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