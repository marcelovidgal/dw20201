package edu.pw.projeto.entity;

import javax.persistence.*;

@Entity
public class TipoDocumento {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
	@Column(name = "nome")
	private String nome;
    
    @Column(name = "tipoDocumentoId")
	private Integer tipoDocumentoId;
    
	public TipoDocumento() {
    }
    
    public TipoDocumento(String nome, Integer tipoDocumentoId) {
        this.nome = nome;
        this.tipoDocumentoId = tipoDocumentoId;
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

	public Integer getTipoDocumentoId() {
		return tipoDocumentoId;
	}

	public void setTipoDocumentoId(Integer tipoDocumentoId) {
		this.tipoDocumentoId = tipoDocumentoId;
	}

}