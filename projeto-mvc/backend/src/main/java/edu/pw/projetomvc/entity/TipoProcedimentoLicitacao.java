package edu.pw.projetomvc.entity;

import javax.persistence.*;

@Entity
public class TipoProcedimentoLicitacao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;
    
    @Column(name = "tipoProcedimentoLicitacaoId")
	private Integer tipoProcedimentoLicitacaoId;

	@Column(name = "nome")
	private String nome;

	public TipoProcedimentoLicitacao() {
	}

	public TipoProcedimentoLicitacao(Integer tipoProcedimentoLicitacaoId, String nome) {
        this.tipoProcedimentoLicitacaoId = tipoProcedimentoLicitacaoId;
        this.nome = nome;
	}
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTipoProcedimentoLicitacaoId() {
		return tipoProcedimentoLicitacaoId;
	}

	public void setTipoProcedimentoLicitacaoId(Integer tipoProcedimentoLicitacaoId) {
		this.tipoProcedimentoLicitacaoId = tipoProcedimentoLicitacaoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}