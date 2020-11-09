package edu.pw.projetomvc.entity;

import javax.persistence.*;

@Entity
public class TipoObjeto {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "tipoObjetoId")
	private Integer tipoObjetoId;

	@Column(name = "nome")
	private String nome;

	public TipoObjeto() {
	}

	public TipoObjeto(Integer tipoObjetoId, String nome) {
        this.tipoObjetoId = tipoObjetoId;
        this.nome = nome;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoObjetoId() {
		return tipoObjetoId;
	}

	public void setTipoObjetoId(Integer tipoObjetoId) {
		this.tipoObjetoId = tipoObjetoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}