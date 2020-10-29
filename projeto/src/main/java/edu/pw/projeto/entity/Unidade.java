package edu.pw.projeto.entity;

import javax.persistence.*;

@Entity
public class Unidade {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "unidadeId")
	private Integer unidadeId;

	@Column(name = "nome") //, nullable = false (obrigatório)
	private String nome;

	public Unidade() {
	}

	public Unidade(Integer unidadeId, String nome) {
        this.unidadeId = unidadeId;
        this.nome = nome;
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
/*
	@Override
	public String toString() {
		return "{" +
            "id=" + id +
            ", enteId='" + enteId + "\'" +
			", nome='" + nome + "\'" +
			", orgaos='" + orgaos + "\'" +
			"}";
	}*/
}