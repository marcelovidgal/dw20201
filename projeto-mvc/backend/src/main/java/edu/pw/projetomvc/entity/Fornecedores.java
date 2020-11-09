package edu.pw.projetomvc.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fornecedores {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Integer fornecedorId;
    private String nome;
    private String cpfCnpj;

    @Transient
    private JsonNode socios;

    @ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "socioId")
    private Socios socioId;

    public Fornecedores() {
        
    }

    public Fornecedores(Integer fornecedorId, String nome, String cpfCnpj, Socios socioId) {
        this.fornecedorId = fornecedorId;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.socioId = socioId;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


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

    @Override
    public String toString() {
        return "Fornecedores{" +
                "fornecedorId=" + fornecedorId +
                ", nome='" + nome + '\'' +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", socios=" + socios +
                '}';
    }
}