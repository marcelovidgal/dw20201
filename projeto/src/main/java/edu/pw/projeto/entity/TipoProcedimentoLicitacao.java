package edu.pw.projeto.entity;

import javax.persistence.*;

@Entity
public class TipoProcedimentoLicitacao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
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
    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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