package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Orgao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "orgaoId")
	private Integer orgaoId;

	@Column(name = "nome")
	private String nome;

	@Transient
	@Column(name = "ente")
	private JsonNode ente;

	public Orgao() {

	}

	public Orgao(Integer orgaoId, String nome, JsonNode ente) {
        this.orgaoId = orgaoId;
		this.nome = nome;
		this.ente = ente;		
	}
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrgaoId() {
		return orgaoId;
	}

	public void setOrgaoId(Integer orgaoId) {
		this.orgaoId = orgaoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JsonNode getEntes() {
		return ente;
	}

	public void setEntes(JsonNode ente) {
		this.ente = ente;
	}

}