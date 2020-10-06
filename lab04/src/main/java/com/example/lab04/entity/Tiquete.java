package com.example.lab04.entity;

import javax.persistence.*;

@Entity
public class Tiquete {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String titulo;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "aplicacao_id")
    private Aplicacao aplicacao;

    @ManyToOne
    @JoinTable(name = "tiquete_release", joinColumns = @JoinColumn(name = "tiquete_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
    private Release release;

    private String status;

    public Tiquete() {
    }

    public Tiquete(String titulo, String descricao, Aplicacao aplicacao, Release release, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.aplicacao = aplicacao;
        this.release = release;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Aplicacao getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(Aplicacao aplicacao) {
        this.aplicacao = aplicacao;
    }

    public Release getRelease() {
        return release;
    }

    public void setRelease(Release release) {
        this.release = release;
    }
}
