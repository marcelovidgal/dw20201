package edu.pw.projetomvc.entity;

import javax.persistence.*;

@Entity
public class TipoLicitacao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "tipoLicitacaoId")
	private Integer tipoLicitacaoId;

	@Column(name = "nome")
	private String nome;

	public TipoLicitacao() {
	}

	public TipoLicitacao(Integer tipoLicitacaoId, String nome) {
        this.tipoLicitacaoId = tipoLicitacaoId;
        this.nome = nome;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoLicitacaoId() {
		return tipoLicitacaoId;
	}

	public void setTipoLicitacaoId(Integer tipoLicitacaoId) {
		this.tipoLicitacaoId = tipoLicitacaoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}