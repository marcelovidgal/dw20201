package edu.pw.projeto.entity;

import javax.persistence.*;

@Entity
public class StatusLicitacao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
	@Column(name = "nome")
	private String nome;
    
    @Column(name = "statusId")
	private Integer statusId;
    
	public StatusLicitacao() {
    }
    
    public StatusLicitacao(String nome, Integer statusId) {
        this.nome = nome;
        this.statusId = statusId;
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

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

}