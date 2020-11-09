package edu.pw.projetorest.models;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Licitacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "licitacaoId")
    private Integer licitacaoId;

    @Column(name = "numeroProcesso")
    private String numeroProcesso;

    @Column(name = "anoProcesso")
    private String anoProcesso;

    @Transient
    @Column(name = "unidade")
    private JsonNode unidade;

    @Column(name = "nomeAutoridade")
    private String nomeAutoridade;

    @Column(name = "cpfAutoridade")
    private String cpfAutoridade;

    @Column(name = "cargoAutoridade")
    private String cargoAutoridade;

    @Column(name = "nomeHomologador")
    private String nomeHomologador;

    @Column(name = "tipoItemObjeto")
    private String tipoItemObjeto;

    @Column(name = "objeto", columnDefinition = "TEXT")
    private String objeto;

    @Column(name = "dataPublicacao")
    private String dataPublicacao;

    @Column(name = "dataAbertura")
    private String dataAbertura;

    @Transient
    @Column(name = "tipoLicitacao")
    private JsonNode tipoLicitacao;

    @Transient
    @Column(name = "tipoProcedimentoLicitacao")
    private JsonNode tipoProcedimentoLicitacao;

    @Transient
    @Column(name = "statusLicitacao")
    private JsonNode statusLicitacao;

    @Transient
    @Column(name = "tipoObjeto")
    private JsonNode tipoObjeto;

    @Column(name = "veiculoDivulgacao")
    private String veiculoDivulgacao;

    @Column(name = "valorDotacao")
    private Double valorDotacao;

    @Column(name = "dotacaoReforcada")
    private String dotacaoReforcada;

    @Column(name = "valorTotalDespesa")
    private Double valorTotalDespesa;

    @Column(name = "valorGlobalAdjudicado")
    private Double valorGlobalAdjudicado;

    @Column(name = "dataHomologacao")
    private String dataHomologacao;

    @Column(name = "dataPublicacaoResultado")
    private String dataPublicacaoResultado;

    @Column(name = "meioPublicacaoResultado")
    private String meioPublicacaoResultado;

    @Column(name = "dataEnvio")
    private String dataEnvio;

    @Column(name = "dataAviso")
    private String dataAviso;

    @Transient
    @Column(name = "tipoResultado")
    private JsonNode tipoResultado;

    @Column(name = "naturezaDespesa")
    private String naturezaDespesa;

    @Column(name = "origemRecurso")
    private String origemRecurso;

    @Transient
    @Column(name = "licitantes")
    private JsonNode licitantes;

    @Column(name = "coronavirus")
    private Boolean coronavirus;

    // Relacionamentos
    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "tipoLicitacaoId")
    private TipoLicitacao tipoLicitacaoId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "tipoProcedimentoLicitacaoId")
    private TipoProcedimentoLicitacao tipoProcedimentoLicitacaoId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "statusId")
    private StatusLicitacao statusId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "tipoObjetoId")
    private TipoObjeto tipoObjetoId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "tipoResultadoId")
    private TipoResultado tipoResultadoId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "licitantesId")
    private Licitantes licitantesId;

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "unidadeId")
    private Unidade unidadeId;

    public Licitacoes() {

    }

    public Licitacoes(Integer licitacaoId, String numeroProcesso, String anoProcesso, Unidade unidadeId,
            String nomeAutoridade, String cpfAutoridade, String cargoAutoridade, String nomeHomologador,
            String tipoItemObjeto, String objeto, String dataPublicacao, String dataAbertura,
            TipoLicitacao tipoLicitacaoId, TipoProcedimentoLicitacao tipoProcedimentoLicitacaoId,
            StatusLicitacao statusId, TipoObjeto tipoObjetoId, String veiculoDivulgacao, Double valorDotacao,
            String dotacaoReforcada, Double valorTotalDespesa, Double valorGlobalAdjudicado, String dataHomologacao,
            String dataPublicacaoResultado, String meioPublicacaoResultado, String dataEnvio, String dataAviso,
            TipoResultado tipoResultadoId, String naturezaDespesa, String origemRecurso, Licitantes licitantesId,
            Boolean coronavirus) {
        this.licitacaoId = licitacaoId;
        this.numeroProcesso = numeroProcesso;
        this.anoProcesso = anoProcesso;
        this.unidadeId = unidadeId;
        this.nomeAutoridade = nomeAutoridade;
        this.cpfAutoridade = cpfAutoridade;
        this.cargoAutoridade = cargoAutoridade;
        this.nomeHomologador = nomeHomologador;
        this.tipoItemObjeto = tipoItemObjeto;
        this.objeto = objeto;
        this.dataPublicacao = dataPublicacao;
        this.dataAbertura = dataAbertura;
        this.tipoLicitacaoId = tipoLicitacaoId;
        this.tipoProcedimentoLicitacaoId = tipoProcedimentoLicitacaoId;
        this.statusId = statusId;
        this.tipoObjetoId = tipoObjetoId;
        this.veiculoDivulgacao = veiculoDivulgacao;
        this.valorDotacao = valorDotacao;
        this.dotacaoReforcada = dotacaoReforcada;
        this.valorTotalDespesa = valorTotalDespesa;
        this.valorGlobalAdjudicado = valorGlobalAdjudicado;
        this.dataHomologacao = dataHomologacao;
        this.dataPublicacaoResultado = dataPublicacaoResultado;
        this.meioPublicacaoResultado = meioPublicacaoResultado;
        this.dataEnvio = dataEnvio;
        this.dataAviso = dataAviso;
        this.tipoResultadoId = tipoResultadoId;
        this.naturezaDespesa = naturezaDespesa;
        this.origemRecurso = origemRecurso;
        this.licitantesId = licitantesId;
        this.coronavirus = coronavirus;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getLicitacaoId() {
        return licitacaoId;
    }

    public void setLicitacaoId(Integer licitacaoId) {
        this.licitacaoId = licitacaoId;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getAnoProcesso() {
        return anoProcesso;
    }

    public void setAnoProcesso(String anoProcesso) {
        this.anoProcesso = anoProcesso;
    }

    public JsonNode getUnidade() {
        return unidade;
    }

    public void setUnidade(JsonNode unidade) {
        this.unidade = unidade;
    }

    public String getNomeAutoridade() {
        return nomeAutoridade;
    }

    public void setNomeAutoridade(String nomeAutoridade) {
        this.nomeAutoridade = nomeAutoridade;
    }

    public String getCpfAutoridade() {
        return cpfAutoridade;
    }

    public void setCpfAutoridade(String cpfAutoridade) {
        this.cpfAutoridade = cpfAutoridade;
    }

    public String getCargoAutoridade() {
        return cargoAutoridade;
    }

    public void setCargoAutoridade(String cargoAutoridade) {
        this.cargoAutoridade = cargoAutoridade;
    }

    public String getNomeHomologador() {
        return nomeHomologador;
    }

    public void setNomeHomologador(String nomeHomologador) {
        this.nomeHomologador = nomeHomologador;
    }

    public String getTipoItemObjeto() {
        return tipoItemObjeto;
    }

    public void setTipoItemObjeto(String tipoItemObjeto) {
        this.tipoItemObjeto = tipoItemObjeto;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public JsonNode getTipoLicitacao() {
        return tipoLicitacao;
    }

    public void setTipoLicitacao(JsonNode tipoLicitacao) {
        this.tipoLicitacao = tipoLicitacao;
    }

    public JsonNode getTipoProcedimentoLicitacao() {
        return tipoProcedimentoLicitacao;
    }

    public void setTipoProcedimentoLicitacao(JsonNode tipoProcedimentoLicitacao) {
        this.tipoProcedimentoLicitacao = tipoProcedimentoLicitacao;
    }

    public JsonNode getStatusLicitacao() {
        return statusLicitacao;
    }

    public void setStatusLicitacao(JsonNode statusLicitacao) {
        this.statusLicitacao = statusLicitacao;
    }

    public JsonNode getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(JsonNode tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public String getVeiculoDivulgacao() {
        return veiculoDivulgacao;
    }

    public void setVeiculoDivulgacao(String veiculoDivulgacao) {
        this.veiculoDivulgacao = veiculoDivulgacao;
    }

    public Double getValorDotacao() {
        return valorDotacao;
    }

    public void setValorDotacao(Double valorDotacao) {
        this.valorDotacao = valorDotacao;
    }

    public String getDotacaoReforcada() {
        return dotacaoReforcada;
    }

    public void setDotacaoReforcada(String dotacaoReforcada) {
        this.dotacaoReforcada = dotacaoReforcada;
    }

    public Double getValorTotalDespesa() {
        return valorTotalDespesa;
    }

    public void setValorTotalDespesa(Double valorTotalDespesa) {
        this.valorTotalDespesa = valorTotalDespesa;
    }

    public Double getValorGlobalAdjudicado() {
        return valorGlobalAdjudicado;
    }

    public void setValorGlobalAdjudicado(Double valorGlobalAdjudicado) {
        this.valorGlobalAdjudicado = valorGlobalAdjudicado;
    }

    public String getDataHomologacao() {
        return dataHomologacao;
    }

    public void setDataHomologacao(String dataHomologacao) {
        this.dataHomologacao = dataHomologacao;
    }

    public String getDataPublicacaoResultado() {
        return dataPublicacaoResultado;
    }

    public void setDataPublicacaoResultado(String dataPublicacaoResultado) {
        this.dataPublicacaoResultado = dataPublicacaoResultado;
    }

    public String getMeioPublicacaoResultado() {
        return meioPublicacaoResultado;
    }

    public void setMeioPublicacaoResultado(String meioPublicacaoResultado) {
        this.meioPublicacaoResultado = meioPublicacaoResultado;
    }

    public String getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(String dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getDataAviso() {
        return dataAviso;
    }

    public void setDataAviso(String dataAviso) {
        this.dataAviso = dataAviso;
    }

    public JsonNode getTipoResultado() {
        return tipoResultado;
    }

    public void setTipoResultado(JsonNode tipoResultado) {
        this.tipoResultado = tipoResultado;
    }

    public String getNaturezaDespesa() {
        return naturezaDespesa;
    }

    public void setNaturezaDespesa(String naturezaDespesa) {
        this.naturezaDespesa = naturezaDespesa;
    }

    public String getOrigemRecurso() {
        return origemRecurso;
    }

    public void setOrigemRecurso(String origemRecurso) {
        this.origemRecurso = origemRecurso;
    }

    public JsonNode getLicitantes() {
        return licitantes;
    }

    public void setLicitantes(JsonNode licitantes) {
        this.licitantes = licitantes;
    }

    public Boolean getCoronavirus() {
        return coronavirus;
    }

    public void setCoronavirus(Boolean coronavirus) {
        this.coronavirus = coronavirus;
    }
}