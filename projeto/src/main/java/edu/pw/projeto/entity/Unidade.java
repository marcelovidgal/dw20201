package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Unidade {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "unidadeId")
	private Integer unidadeId;

	@Column(name = "nome") //, nullable = false (obrigatório)
	private String nome;

	@Transient
	@Column(name = "ente")
	private JsonNode ente;

	@Transient
	@Column(name = "orgao")
	private JsonNode orgao;

	public Unidade() {
	}

	public Unidade(Integer unidadeId, String nome, JsonNode ente, JsonNode orgao) {
        this.unidadeId = unidadeId;
		this.nome = nome;
		this.ente = ente;
		this.orgao = orgao;
	}
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUnidadeId() {
		return unidadeId;
	}

	public void setUnidadeId(Integer unidadeId) {
		this.unidadeId = unidadeId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JsonNode getEnte() {
		return ente;
	}

	public void setEnte(JsonNode ente) {
		this.ente = ente;
	}

	public JsonNode getOrgao() {
		return orgao;
	}

	public void setOrgao(JsonNode orgao) {
		this.orgao = orgao;
	}

}