package edu.pw.projeto.entity;

import javax.persistence.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Socios {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;
    private String numero;
    private String percentualParticipacao;
    private String pessoaJuridica;
    private Integer socioId;

    public Socios(){
    
    }

    public Socios(String nome, String numero, String percentualParticipacao, String pessoaJuridica, Integer socioId) {
        this.nome = nome;
        this.numero = numero;
        this.percentualParticipacao = percentualParticipacao;
        this.pessoaJuridica = pessoaJuridica;
        this.socioId = socioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPercentualParticipacao() {
        return percentualParticipacao;
    }

    public void setPercentualParticipacao(String percentualParticipacao) {
        this.percentualParticipacao = percentualParticipacao;
    }

    public String getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(String pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Integer getSocioId() {
        return socioId;
    }

    public void setSocioId(Integer socioId) {
        this.socioId = socioId;
    }

    @Override
    public String toString() {
        return "Socios{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", percentualParticipacao='" + percentualParticipacao + '\'' +
                ", pessoaJuridica='" + pessoaJuridica + '\'' +
                ", socioId=" + socioId +
                '}';
    }
}
