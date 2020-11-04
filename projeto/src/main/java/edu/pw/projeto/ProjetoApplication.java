package edu.pw.projeto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import edu.pw.projeto.entity.*;
import edu.pw.projeto.repository.*;
import java.util.*;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.core.*;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

@SpringBootApplication
public class ProjetoApplication {

	private static final Logger log = LoggerFactory.getLogger(ProjetoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate, EntesRepository entesRepository, ServidoresRepository servidoresRepository,
								FornecedoresRepository fornecedoresRepository, ContratosRepository contratosRepository,
								LicitacoesRepository licitacoesRepository) throws Exception {

		return args -> {

			final ObjectMapper objectMapper = new ObjectMapper();

			// ============== ENTES ==============
			Entes[] entes  = restTemplate.getForObject("http://app.tce.ma.gov.br:8889/tce/api/entes", Entes[].class);

			for (Entes ente : entes) {
				entesRepository.save(new Entes(ente.getEnteId(), ente.getNome(), ente.getOrgaos()));
			}
			
			//URL jsonUrl = new URL("http://app.tce.ma.gov.br:8889/tce/api/entes");
			//ObjectMapper mapper = new ObjectMapper();
			//Entes[] entes = mapper.readValue(jsonUrl, Entes[].class);
			

			// ============== SERVIDORES ==============
			URL jsonUrl = new URL("http://app.tce.ma.gov.br:80/tce/api/servidores/"+entes[0].getEnteId());	

			JsonFactory factory = new JsonFactory();
			JsonParser parser = factory.createParser(jsonUrl);

			// avança o stream até chegar no array
			while (parser.nextToken() != JsonToken.START_ARRAY) {
			    parser.nextToken();
			}

			

			final List<Servidores> servidores = objectMapper.readValue(parser, new TypeReference<List<Servidores>>() {});

			for (Servidores servidor : servidores) {
				ObjectMapper mapper = new ObjectMapper();			
				NaturezaCargo naturezaCargo = mapper.readValue(servidor.getNaturezaCargo().toString(), NaturezaCargo.class);		
				Unidade unidade = mapper.readValue(servidor.getUnidade().toString(), Unidade.class);			

				servidoresRepository.save(new Servidores(servidor.getServidorId(), servidor.getNome(), servidor.getCargo(),  servidor.getCnpj(), 
				servidor.getCpf(), servidor.getMes(), servidor.getAno(), servidor.getValorBruto(),
				naturezaCargo, unidade,
				servidor.getAcumulos(), servidor.getValorBrutoTotal(), servidor.getNomeUnidadeLotacao()));
			}
			

			// ============== FORNECEDORES ============== 
			//ResponseEntity<Fornecedores[]> fornecedores = restTemplate.getForEntity("http://app.tce.ma.gov.br:8889/tce/api/fornecedores?filtro=20005", Fornecedores[].class);
			//ObjectMapper mapper = new ObjectMapper();

			//for(Fornecedores fornecedor : fornecedores.getBody()){
			//	//System.out.println(fornecedor.getNome());
			//	Socios socio = mapper.readValue(fornecedor.getSocios().toString(), Socios.class);	
			//	fornecedoresRepository.save(new Fornecedores(fornecedor.getFornecedorId(), fornecedor.getNome(), fornecedor.getCpfCnpj(), socio));
			//}

			// ============== CONTRATOS ==============
			jsonUrl = new URL("http://app.tce.ma.gov.br:80/tce/api/contratos?enteId="+entes[0].getEnteId());	

			factory = new JsonFactory();
			parser = factory.createParser(jsonUrl);

			// avança o stream até chegar no array
			while (parser.nextToken() != JsonToken.START_ARRAY) {
			    parser.nextToken();
			}

			final List<Contratos> contratos = objectMapper.readValue(parser, new TypeReference<List<Contratos>>() {});

			for (Contratos contrato : contratos) {
				Fornecedores fornecedor = objectMapper.readValue(contrato.getFornecedor().toString(), Fornecedores.class);
				Unidade unidade = objectMapper.readValue(contrato.getUnidade().toString(), Unidade.class);
				Entes ente = objectMapper.readValue(unidade.getEnte().toString(), Entes.class);
				StatusLicitacao status = objectMapper.readValue(contrato.getStatus().toString(), StatusLicitacao.class);

				contratosRepository.save(new Contratos(contrato.getContratoId(), fornecedor, status, unidade, contrato.getObjeto(), contrato.getExercicio(),
				contrato.getLicitacaoId(), contrato.getDataAssinatura(), contrato.getNumeroContrato(), contrato.getDataVigenciaInicio(), contrato.getDataVigenciaFim(),
				contrato.getDataPublicacaoContrato(), contrato.getDataEnvioPublicacao(), contrato.getDataEnvio(), contrato.getValorContrato(), contrato.getMeioPublicacao(),
				contrato.getAnoContrato(), contrato.getCoronavirus()));
			}

			// ============== LICITAÇÕES ==============
			jsonUrl = new URL("http://app.tce.ma.gov.br:80/tce/api/licitacoes?size=100&enteId="+entes[0].getEnteId());	
			factory = new JsonFactory();
			parser = factory.createParser(jsonUrl);
			// avança o stream até chegar no array
			while (parser.nextToken() != JsonToken.START_ARRAY) {
			    parser.nextToken();
			}

			final List<Licitacoes> licitacoes = objectMapper.readValue(parser, new TypeReference<List<Licitacoes>>() {});
			for (Licitacoes licitacao : licitacoes) {
				Unidade unidade = objectMapper.readValue(licitacao.getUnidade().toString(), Unidade.class);
				TipoLicitacao tipoLicitacao = objectMapper.readValue(licitacao.getTipoLicitacao().toString(), TipoLicitacao.class);
				TipoProcedimentoLicitacao tipoProcedimentoLicitacao = objectMapper.readValue(licitacao.getTipoProcedimentoLicitacao().toString(), TipoProcedimentoLicitacao.class);
				StatusLicitacao status = objectMapper.readValue(licitacao.getStatusLicitacao().toString(), StatusLicitacao.class);
				TipoObjeto tipoObjeto = objectMapper.readValue(licitacao.getTipoObjeto().toString(), TipoObjeto.class);
				TipoResultado tipoResultado = objectMapper.readValue(licitacao.getTipoResultado().toString(), TipoResultado.class);
				Licitantes[] licitantes = objectMapper.readValue(licitacao.getLicitantes().toString(), Licitantes[].class);

				
				licitacoesRepository.save(new Licitacoes(licitacao.getLicitacaoId(), licitacao.getNumeroProcesso(), licitacao.getAnoProcesso(), unidade,
				licitacao.getNomeAutoridade(), licitacao.getCpfAutoridade(), licitacao.getCargoAutoridade(), licitacao.getNomeHomologador(), licitacao.getTipoItemObjeto(), licitacao.getObjeto(),
				licitacao.getDataPublicacao(), licitacao.getDataAbertura(), tipoLicitacao, tipoProcedimentoLicitacao, status, tipoObjeto, licitacao.getVeiculoDivulgacao(), licitacao.getValorDotacao(),
				licitacao.getDotacaoReforcada(), licitacao.getValorTotalDespesa(), licitacao.getValorGlobalAdjudicado(), licitacao.getDataHomologacao(), licitacao.getDataPublicacaoResultado(),
				licitacao.getMeioPublicacaoResultado(), licitacao.getDataEnvio(), licitacao.getDataAviso(), tipoResultado, licitacao.getNaturezaDespesa(), licitacao.getOrigemRecurso(),
				licitantes[0], licitacao.getCoronavirus()));				

			}

		};
	}

}