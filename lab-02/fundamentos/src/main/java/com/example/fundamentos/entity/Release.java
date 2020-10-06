package com.example.fundamentos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Release {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String dataLiberacao;

    private String descricao;

    public Release() {
    }

    public Release(Integer id, String descricao, String dataLiberacao){
        this.id = id;
        this.dataLiberacao = dataLiberacao;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataLiberacao() {
        return dataLiberacao;
    }

    public void setDataLiberacao(String dataLiberacao) {
        this.dataLiberacao = dataLiberacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}