package edu.pw.projetomvc.entity;

import javax.persistence.*;

@Entity
public class NaturezaCargo {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "naturezaCargoId")
	private Integer naturezaCargoId;

	@Column(name = "nome") //, nullable = false (obrigatório)
	private String nome;

	public NaturezaCargo() {
	}

	public NaturezaCargo(Integer naturezaCargoId, String nome) {
        this.naturezaCargoId = naturezaCargoId;
        this.nome = nome;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNaturezaCargoId() {
		return naturezaCargoId;
	}

	public void setNaturezaCargoId(Integer naturezaCargoId) {
		this.naturezaCargoId = naturezaCargoId;
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