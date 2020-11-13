import React, { useState, useEffect } from 'react';
import api from '../../services/api';

import {Spinner} from 'react-bootstrap';
import BootstrapTable from 'react-bootstrap-table-next';
import paginatorFactory from 'react-bootstrap-table2-paginator';
import ToolkitProvider, { Search, CSVExport } from 'react-bootstrap-table2-toolkit';

import Footer from '../../components/Footer';
import NavBar from '../../components/Navbar';

import './styles.css';

function Contratos () {

    const [ contratos, setContratos ] = useState([]);
    const [ loading, setLoading ] = useState(true);
    const { SearchBar } = Search;  
    const { ExportCSVButton } = CSVExport;

    async function getContratos(){
        try{
            // O "api" (importado da pasta services) vai fazer uma requisição do tipo get na rota '/contratos' e então terá como resposta o que vem do frontend
            await api.get('/contratos').then(response => {
                setContratos(response.data);
                setLoading(false);
                console.log(response.data);
            });
        }catch (e) {
            console.log(e);
        }
    }

    useEffect(() => {
        getContratos();        
    }, []);

    const columns = [      
        { dataField: "contratoId", text: "Contrato Id", sort: true},        
        { dataField: "anoContrato", text: "Ano Contrato", sort: true},
        { dataField: "coronavirus", text: "Coronavírus", sort: true},
        { dataField: "dataAssinatura", text: "Data Assinatura", sort: true},
        { dataField: "dataEnvio", text: "Data Envio", sort: true},
        { dataField: "dataEnvioPublicacao", text: "Data Envio Publicação", sort: true},
        { dataField: "dataPublicacaoContrato", text: "Data Publicação Contrato", sort: true},        
        { dataField: "dataVigenciaInicio", text: "Data Vigência Início", sort: true},
        { dataField: "dataVigenciaFim", text: "Data Vigência Fim", sort: true},
        { dataField: "exercicio", text: "Execício", sort: true},
        { dataField: "licitacaoId", text: "Licitação Id", sort: true},
        { dataField: "meioPublicacao", text: "Meio Publicação", sort: true},
        { dataField: "numeroContrato", text: "Número Contrato", sort: true},
        { dataField: "objeto", text: "Objeto", sort: true},
       /* { dataField: "status", text: "Status", sort: true},*/
        /*{ dataField: "unidade", text: "Unidade", sort: true},*/
        { dataField: "valorContrato", text: "Valor Contrato", sort: true}
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
          text: 'All', value: contratos.length
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
                        data={ contratos }
                        columns={ columns }
                        search
                        exportCSV={{
                            fileName: "listagemContratos.csv"
                        }}
                    >
                        {
                          props => (
                            <div className="containerForm">
                              <h3>Contratos</h3>
                              <div className="tools">
                                <SearchBar { ...props.searchProps }  placeholder="Buscar"/>
                                <ExportCSVButton { ...props.csvProps } className="btn btn-success">Exportar CSV</ExportCSVButton>
                              </div>
                              <hr />
                              <BootstrapTable striped hover id="tableContratos"
                                keyField="id"
                                data={contratos}
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

export default Contratos