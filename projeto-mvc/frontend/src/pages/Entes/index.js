import React, { useState, useEffect } from 'react';
import api from '../../services/api';

import {Spinner} from 'react-bootstrap';
import BootstrapTable from 'react-bootstrap-table-next';
import paginatorFactory from 'react-bootstrap-table2-paginator';
import ToolkitProvider, { Search, CSVExport } from 'react-bootstrap-table2-toolkit';

import NavBar from '../../components/Navbar';
import Footer from '../../components/Footer';
import Login from '../Login';

import './styles.css';

const Entes = () => {

    const [ entes, setEntes ] = useState([]);
    const [ loading, setLoading ] = useState(true);
    const { SearchBar } = Search;  
    const { ExportCSVButton } = CSVExport;

    async function getEntes(){
        try{
            // O "api" (importado da pasta services) vai fazer uma requisição do tipo get na rota '/entes' e então terá como resposta o que vem do frontend
            await api.get('/entes').then(response => {
                setEntes(response.data);
                setLoading(false);
                //console.log(response.data[0].nome);
            });
        }catch (e) {
            console.log(e);
        }
    }

    useEffect(() => {
        getEntes();        
    }, []);

    const columns = [
        { dataField: "id", text: "Id", sort: true},
        { dataField: "nome", text: "Nome", sort: true}        
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
          text: 'All', value: entes.length
        }] // A numeric array is also available. the purpose of above example is custom the text
    };

    return (
        <>
        <Login component={this} isComponent={true} ></Login>
        <NavBar title="Listagens" isLandingPage={false}/>
        <div className="container">
            { loading ? (
                    <Spinner className="loadingAnim" animation="border" />
                ) : (                    
                    <ToolkitProvider
                        bootstrap4
                        keyField="id"
                        data={ entes }
                        columns={ columns }
                        search
                        exportCSV={{
                            fileName: "listagemEntes.csv"
                        }}
                    >
                        {
                          props => (
                            <div className="containerForm">
                              <h3>Entes</h3>
                              <div className="tools">
                                <SearchBar { ...props.searchProps }  placeholder="Buscar"/>
                                <ExportCSVButton { ...props.csvProps } className="btn btn-success">Exportar CSV</ExportCSVButton>
                              </div>
                              <hr />
                              <BootstrapTable
                                striped
                                hover
                                keyField="id"
                                data={entes}
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

export default Entes;