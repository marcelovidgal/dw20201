package edu.pw.projetomvc.entity;

import javax.persistence.*;

@Entity
public class Entes {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "enteId")
	private Integer enteId;

	@Column(name = "nome") //, nullable = false (obrigatório)
	private String nome;

	@Column(name="orgaos")
	private String orgaos;

	public Entes() {
	}

	public Entes(Integer enteId, String nome, String orgaos) {
        this.enteId = enteId;
        this.nome = nome;
		this.orgaos = orgaos;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEnteId() {
		return enteId;
	}

	public void setEnteId(Integer enteId) {
		this.enteId = enteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOrgaos() {
		return orgaos;
	}

	public void setOrgaos(String orgaos) {
		this.orgaos = orgaos;
	}


	@Override
	public String toString() {
		return "{" +
            "id=" + id +
            ", enteId='" + enteId + "\'" +
			", nome='" + nome + "\'" +
			", orgaos='" + orgaos + "\'" +
			"}";
	}
}