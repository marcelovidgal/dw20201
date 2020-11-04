package edu.pw.projetorest.models;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.databind.JsonNode;

@Entity
@Table(name = "FORNECEDORES")
public class Fornecedores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer fornecedorId;
    private String nome;
    private String cpfCnpj;

    @Transient
    private JsonNode socios;

    public Integer getFornecedorId() {
        return fornecedorId;
    }

    public void setFornecedorId(Integer fornecedorId) {
        this.fornecedorId = fornecedorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public JsonNode getSocios() {
        return socios;
    }

    public void setSocios(JsonNode socios) {
        this.socios = socios;
    }

}
