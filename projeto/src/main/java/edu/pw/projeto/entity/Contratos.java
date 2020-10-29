package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contratos {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    
    @Column(name = "contratoId")
    private Integer contratoId;
    
    @Column(name = "anoContrato")
	private String anoContrato;

	@Column(name="coronavirus")
	private Boolean coronavirus;

	@Column(name="dataAssinatura")
	private String dataAssinatura;

	@Column(name="dataEnvio")
    private String dataEnvio;
    
	@Column(name="dataEnvioPublicacao")
    private String dataEnvioPublicacao;
    
	@Column(name="dataPublicacaoContrato")
    private String dataPublicacaoContrato;
        
	@Column(name="dataRecisao")
    private String dataRecisao;
        
	@Column(name="dataVigenciaFim")
    private String dataVigenciaFim;
        
	@Column(name="dataVigenciaInicio")
    private String dataVigenciaInicio;
	
    @Transient    
	@Column(name = "documentos")
	private JsonNode documentos;
    
    @Transient
    @Column(name = "fornecedor")
    private JsonNode fornecedor;

    @Transient
    @Column(name = "status")
    private JsonNode status;

    @Transient
    @Column(name = "unidade")  // USAR A MESMA CLASSE?
    private JsonNode unidade;  // USAR A MESMA CLASSE?

	@Column(name = "exercicio")
	private Integer exercicio;

	@Column(name = "licitacaoId")
	private Integer licitacaoId;

    @Column(name = "meioPublicacao")
	private String meioPublicacao;

    @Column(name = "motivoRecisao")
	private String motivoRecisao;

    @Column(name = "numeroContrato")
    private String numeroContrato;
    
    @Column(name = "objeto")
    private String objeto;
    
    @Column(name = "recisao")
    private String recisao;

    @Column(name = "valorContrato")
    private Double valorContrato;
    


	//@ManyToOne(cascade = {CascadeType.ALL})
	//@JoinColumn(name = "naturezaCargoId")
	//private NaturezaCargo naturezaCargoId;
//
	//@ManyToOne(cascade = {CascadeType.ALL})
	//@JoinColumn(name = "unidadeId")
	//private Unidade unidadeId;

	public Contratos() {
	}

	public Contratos(Integer contratoId,  JsonNode fornecedor, JsonNode status, JsonNode unidade, String objeto, Integer exercicio, 
					 Integer licitacaoId, String dataAssinatura, String numeroContrato, String dataVigenciaInicio, String dataVigenciaFim, 
					 String dataPublicacaoContrato, String dataEnvioPublicacao,  String dataEnvio, Double valorContrato, String meioPublicacao, 
					 String recisao, String dataRecisao, String motivoRecisao, String anoContrato, Boolean coronavirus, JsonNode documentos) {
		this.contratoId = contratoId;
		this.anoContrato = anoContrato;
		this.coronavirus = coronavirus;
		this.dataAssinatura = dataAssinatura;
		this.dataEnvio = dataEnvio;
		this.dataEnvioPublicacao = dataEnvioPublicacao;
		this.dataPublicacaoContrato = dataPublicacaoContrato;
		this.dataRecisao = dataRecisao;
		this.dataVigenciaFim = dataVigenciaFim;
		this.dataVigenciaInicio = dataVigenciaInicio;
		this.documentos = documentos;
		this.fornecedor = fornecedor;
		this.status = status;
		this.unidade = unidade;
		this.exercicio = exercicio;
		this.licitacaoId = licitacaoId;
		this.meioPublicacao = meioPublicacao;
		this.motivoRecisao = motivoRecisao;
		this.numeroContrato = numeroContrato;
		this.objeto = objeto;
		this.recisao = recisao;
		this.valorContrato = valorContrato;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getContratoId() {
		return contratoId;
	}

	public void setContratoId(Integer contratoId) {
		this.contratoId = contratoId;
	}

	public String getAnoContrato() {
		return anoContrato;
	}

	public void setAnoContrato(String anoContrato) {
		this.anoContrato = anoContrato;
	}

	public Boolean getCoronavirus() {
		return coronavirus;
	}

	public void setCoronavirus(Boolean coronavirus) {
		this.coronavirus = coronavirus;
	}

	public String getDataAssinatura() {
		return dataAssinatura;
	}

	public void setDataAssinatura(String dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public String getDataEnvioPublicacao() {
		return dataEnvioPublicacao;
	}

	public void setDataEnvioPublicacao(String dataEnvioPublicacao) {
		this.dataEnvioPublicacao = dataEnvioPublicacao;
	}

	public String getDataPublicacaoContrato() {
		return dataPublicacaoContrato;
	}

	public void setDataPublicacaoContrato(String dataPublicacaoContrato) {
		this.dataPublicacaoContrato = dataPublicacaoContrato;
	}

	public String getDataRecisao() {
		return dataRecisao;
	}

	public void setDataRecisao(String dataRecisao) {
		this.dataRecisao = dataRecisao;
	}

	public String getDataVigenciaFim() {
		return dataVigenciaFim;
	}

	public void setDataVigenciaFim(String dataVigenciaFim) {
		this.dataVigenciaFim = dataVigenciaFim;
	}

	public String getDataVigenciaInicio() {
		return dataVigenciaInicio;
	}

	public void setDataVigenciaInicio(String dataVigenciaInicio) {
		this.dataVigenciaInicio = dataVigenciaInicio;
	}

	public JsonNode getDocumentos() {
		return documentos;
	}

	public void setDocumentos(JsonNode documentos) {
		this.documentos = documentos;
	}

	public JsonNode getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(JsonNode fornecedor) {
		this.fornecedor = fornecedor;
	}

	public JsonNode getStatus() {
		return status;
	}

	public void setStatus(JsonNode status) {
		this.status = status;
	}

	public JsonNode getUnidade() {
		return unidade;
	}

	public void setUnidade(JsonNode unidade) {
		this.unidade = unidade;
	}

	public Integer getExercicio() {
		return exercicio;
	}

	public void setExercicio(Integer exercicio) {
		this.exercicio = exercicio;
	}

	public Integer getLicitacaoId() {
		return licitacaoId;
	}

	public void setLicitacaoId(Integer licitacaoId) {
		this.licitacaoId = licitacaoId;
	}

	public String getMeioPublicacao() {
		return meioPublicacao;
	}

	public void setMeioPublicacao(String meioPublicacao) {
		this.meioPublicacao = meioPublicacao;
	}

	public String getMotivoRecisao() {
		return motivoRecisao;
	}

	public void setMotivoRecisao(String motivoRecisao) {
		this.motivoRecisao = motivoRecisao;
	}

	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getRecisao() {
		return recisao;
	}

	public void setRecisao(String recisao) {
		this.recisao = recisao;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}

}