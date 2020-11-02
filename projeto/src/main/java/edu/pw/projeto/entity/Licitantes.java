package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Licitantes {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "licitanteId")
	private Integer licitanteId;

	@Column(name = "habilitado")
    private String habilitado;
        
	public Licitantes() {
	}

	public Licitantes(Integer licitanteId, String habilitado) {
        this.licitanteId = licitanteId;
        this.habilitado = habilitado;
	}
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLicitanteId() {
		return licitanteId;
	}

	public void setLicitanteId(Integer licitanteId) {
		this.licitanteId = licitanteId;
    }

	public String getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}

}