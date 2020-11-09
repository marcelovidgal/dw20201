import React, { useState, useEffect } from 'react';
import api from '../../services/api';

import {Spinner} from 'react-bootstrap';
import BootstrapTable from 'react-bootstrap-table-next';
import paginatorFactory from 'react-bootstrap-table2-paginator';
import ToolkitProvider, { Search, CSVExport } from 'react-bootstrap-table2-toolkit';

import NavBar from '../../components/Navbar';
import Footer from '../../components/Footer';

import './styles.css';

function Licitacoes () {

    const [ licitacoes, setLicitacoes ] = useState([]);
    const [ loading, setLoading ] = useState(true);
    const { SearchBar } = Search;  
    const { ExportCSVButton } = CSVExport;

    async function getLicitacoes(){
        try{
            // O "api" (importado da pasta services) vai fazer uma requisição do tipo get na rota '/entes' e então terá como resposta o que vem do frontend
            await api.get('/licitacoes').then(response => {
                setLicitacoes(response.data);
                setLoading(false);
                console.log(response.data);
            });
        }catch (e) {
            console.log(e);
        }
    }

    useEffect(() => {
        getLicitacoes();        
    }, []);

    const columns = [      
        { dataField: "licitacaoId", text: "Licitação Id", sort: true},
        { dataField: "anoProcesso", text: "Ano Processo", sort: true},
        { dataField: "cargoAutoridade", text: "Cargo Autoridade", sort: true},
        { dataField: "cpfAutoridade", text: "CPF Autoridade", sort: true},
        { dataField: "coronavirus", text: "Coronavírus", sort: true},
        { dataField: "dataAbertura", text: "Data Abertura", sort: true},
        { dataField: "dataAviso", text: "Data Aviso", sort: true},
        { dataField: "dataEnvio", text: "Data Envio", sort: true},
        { dataField: "dataHomologacao", text: "Data Homologação", sort: true},        
        { dataField: "dataPublicacao", text: "Data Publicação", sort: true},
        { dataField: "dataPublicacaoResultado", text: "Data Publicação Resultado", sort: true},
        { dataField: "dotacaoReforcada", text: "Dotação Reforçada", sort: true},
        { dataField: "meioPublicacaoResultado", text: "Meio Publicação Resultado", sort: true},
        { dataField: "naturezaDespesa", text: "Natureza Despesa", sort: true},
        { dataField: "nomeAutoridade", text: "Nome Autoridade", sort: true},
        { dataField: "nomeHomologador", text: "Nome Homologador", sort: true},
        { dataField: "numeroProcesso", text: "Número Processo", sort: true},
        { dataField: "objeto", text: "Objeto", sort: true},
        { dataField: "origemRecurso", text: "Origem Recurso", sort: true},
      /*  { dataField: "statusLicitacao", text: "Status Licitação", sort: true}, */
        { dataField: "tipoItemObjeto", text: "Tipo Item Objeto", sort: true},
      /*  { dataField: "tipoLicitacao", text: "Tipo Licitação", sort: true}, */
      /*  { dataField: "tipoObjeto", text: "Tipo Objeto", sort: true}, v
      /*  { dataField: "tipoProcedimentoLicitacao", text: "Tipo Procedimento Licitação", sort: true}, */
      /*  { dataField: "tipoResultado", text: "Tipo Resultado", sort: true}, */
      /*  { dataField: "unidade", text: "Unidade", sort: true}, */
        { dataField: "valorDotacao", text: "Valor Dotação", sort: true},
        { dataField: "valorGlobalAdjudicado", text: "Valor Global Adjudicado", sort: true},
        { dataField: "veiculoDivulgacao", text: "Valor Divulgação", sort: true}, 
        { dataField: "valorTotalDespesa", text: "Valor Total Despesa", sort: true}
    ];
    
    const customTotal = (from, to, size) => (
        <span className="react-bootstrap-table-pagination-total">
          Exibindo { from } a { to } de { size } Resultados
        </span>
      );
      
    const options = {
        paginationSize: 4,
        pageStartIndex: 1,
        // alwaysShowAllBtns: true, // Always show next and previous button
        // withFirstAndLast: false, // Hide the going to First and Last page button
        hideSizePerPage: true, // Hide the sizePerPage dropdown always
        // hidePageListOnlyOnePage: true, // Hide the pagination list when only one page
        firstPageText: 'Primeira',
        prePageText: 'Anterior',
        nextPageText: 'Próxima',
        lastPageText: 'Última',
        nextPageTitle: 'First page',
        prePageTitle: 'Pre page',
        firstPageTitle: 'Next page',
        lastPageTitle: 'Last page',
        showTotal: true,
        paginationTotalRenderer: customTotal,
        disablePageTitle: true,
        sizePerPageList: [{
          text: '10', value: 10
        }, {
          text: 'All', value: licitacoes.length
        }] // A numeric array is also available. the purpose of above example is custom the text
    };



    return ( 
        <>
            <NavBar title="Listagens"/>
            <div className="container">
            { loading ? (
                    <Spinner className="loadingAnim" animation="border" />
                ) : (                    
                    <ToolkitProvider
                        bootstrap4
                        keyField="id"
                        data={ licitacoes }
                        columns={ columns }
                        search
                        exportCSV={{
                            fileName: "listagemLicitacoes.csv"
                        }}
                    >
                        {
                          props => (
                            <div className="containerForm">
                              <h3>Licitações</h3>
                              <div className="tools">
                                <SearchBar { ...props.searchProps } placeholder="Buscar"/>
                                <ExportCSVButton { ...props.csvProps } className="btn btn-success">Exportar CSV</ExportCSVButton>
                              </div>
                              <hr />
                              <BootstrapTable striped hover id="tableLicitacoes"
                                keyField="id"
                                data={licitacoes}
                                columns={columns}
                                pagination={paginatorFactory(options)} 
                                { ...props.baseProps }
                              />
                            </div>
                          )
                        }
                  </ToolkitProvider>
                               
                )}
        </div>
        <Footer/>
        </>
    )
}

export default Licitacoes