package com.example.fundamentos.entity;

import javax.persistence.*;

@Entity
public class Aplicacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "aplicacao_id")
	private Integer id;

	@Column(name = "nome_aplicacao", nullable = false)
	private String nome;

	@Column(length = 2000)
	private String descricao;

	private String proprietario;

	public Aplicacao() {
	}

	public Aplicacao(String nome, String proprietario, String descricao) {
		this.nome = nome;
		this.proprietario = proprietario;
		this.descricao = descricao;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Aplicacao {" +
			"id=" + id +
			", nome='" + nome + "\'" +
			", proprietario=" + proprietario +
			", descricao='" + descricao + "\'" +
			"}";
	}
}