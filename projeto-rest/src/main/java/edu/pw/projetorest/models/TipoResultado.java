package edu.pw.projetorest.models;

import javax.persistence.*;

@Entity
public class TipoResultado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "tipoResultadoId")
	private Integer tipoResultadoId;

	@Column(name = "nome")
	private String nome;

	public TipoResultado() {
	}

	public TipoResultado(Integer tipoResultadoId, String nome) {
		this.tipoResultadoId = tipoResultadoId;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTipoResultadoId() {
		return tipoResultadoId;
	}

	public void setTipoResultadoId(Integer tipoResultadoId) {
		this.tipoResultadoId = tipoResultadoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}