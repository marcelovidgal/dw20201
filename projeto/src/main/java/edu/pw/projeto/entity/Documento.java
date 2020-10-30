package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Documento {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
	@Column(name = "assunto")
	private String assunto;
    
	@Column(name = "dataEnvio")
    private String dataEnvio;
    
    @Column(name = "documentoId")
	private Integer documentoId;
    
    @Transient
    @Column(name = "licitacao")
    private JsonNode licitacao;

    @Column(name = "link")
	private String link;
    
	@Column(name = "nome")
    private String nome;
    
    @Transient
    @Column(name = "tipoDocumento")
    private JsonNode tipoDocumento;
    
	public Documento() {
    }
    
    public Documento(String assunto, String dataEnvio, Integer documentoId, 
                     JsonNode licitacao, String link, String nome, JsonNode tipoDocumento) {
        this.assunto = assunto;
        this.dataEnvio = dataEnvio;
        this.documentoId = documentoId;
        this.licitacao = licitacao;
        this.link = link;
        this.nome = nome;
        this.tipoDocumento = tipoDocumento;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Integer getDocumentoId() {
		return documentoId;
	}

	public void setDocumentoId(Integer documentoId) {
		this.documentoId = documentoId;
	}

	public JsonNode getLicitacao() {
		return licitacao;
	}

	public void setLicitacao(JsonNode licitacao) {
		this.licitacao = licitacao;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public JsonNode getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(JsonNode tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

}