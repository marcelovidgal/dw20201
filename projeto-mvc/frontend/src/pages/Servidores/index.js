import React, { useState, useEffect } from 'react';
import api from '../../services/api';

import {Spinner} from 'react-bootstrap';
import BootstrapTable from 'react-bootstrap-table-next';
import paginatorFactory from 'react-bootstrap-table2-paginator';
import ToolkitProvider, { Search, CSVExport } from 'react-bootstrap-table2-toolkit';

import NavBar from '../../components/Navbar';
import Footer from '../../components/Footer';

import './styles.css';

function Servidores () {

    const [ servidores, setServidores ] = useState([]);
    const [ loading, setLoading ] = useState(true);
    const { SearchBar } = Search;  
    const { ExportCSVButton } = CSVExport;

    async function getServidores(){
        try{
            // O "api" (importado da pasta services) vai fazer uma requisição do tipo get na rota '/servidores' e então terá como resposta o que vem do frontend
            await api.get('/servidores').then(response => {
                setServidores(response.data);
                setLoading(false);
                console.log(response.data);
            });
        }catch (e) {
            console.log(e);
        }
    }

    useEffect(() => {
      getServidores();        
    }, []);

    const columns = [      
        { dataField: "servidorId", text: "Servidor Id", sort: true},
        { dataField: "nome", text: "Nome", sort: true},
        { dataField: "ano", text: "Ano", sort: true},
        { dataField: "mes", text: "Mês", sort: true},
        { dataField: "cnpj", text: "Cnpj", sort: true},
        { dataField: "cargo", text: "Cargo", sort: true},        
       /* { dataField: "naturezaCargo", text: "Natureza Cargo", sort: true}, */
        { dataField: "nomeUnidadeLotacao", text: "Nome Unidade Lotação", sort: true},
      /*  { dataField: "unidade", text: "Unidade", sort: true}, */
        { dataField: "valorBruto", text: "Valor Bruto", sort: true},        
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
          text: 'All', value: servidores.length
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
                        data={ servidores }
                        columns={ columns }
                        search
                        exportCSV={{
                            fileName: "listagemServidores.csv"
                        }}
                    >
                        {
                          props => (
                            <div className="containerForm">
                              <h3>Servidores</h3>
                              <div className="tools">
                                <SearchBar { ...props.searchProps }  placeholder="Buscar"/>
                                <ExportCSVButton { ...props.csvProps } className="btn btn-success">Exportar CSV</ExportCSVButton>
                              </div>
                              <hr />
                              <BootstrapTable striped hover id="tableServidores"
                                keyField="id"
                                data={servidores}
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

export default Servidores