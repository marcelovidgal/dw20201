package edu.pw.projetomvc.entity;

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
    private Long id;
    
    @Column(name = "unidadeId")
	private Integer unidadeId;

	@Column(name = "nome") //, nullable = false (obrigatório)
	private String nome;

	@Transient
	@Column(name = "ente")
	private JsonNode ente;

	public Unidade() {
	}

	public Unidade(Integer unidadeId, String nome) {  // Integer unidadeId, String nome, JsonNode ente, Orgao orgaoId
        this.unidadeId = unidadeId;
		this.nome = nome;		
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

}