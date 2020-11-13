import React from 'react';

import NavBar from '../../components/Navbar';
import Carrossel from '../../components/Carrossel';
import Footer from '../../components/Footer';

import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faTachometerAlt, faMapMarkerAlt, faFileCsv, faClipboardList } from "@fortawesome/free-solid-svg-icons";

import './styles.css';

function TelaPrincipal () {

    return ( 
        <>
            <NavBar title="Home"/>            
            <Carrossel/>
            <div className="infoSecao">
                <table className="table">
                    <tbody>
                        <tr className="itemLista">
                            <td className="blocoLista">
                                <p>
                                    <FontAwesomeIcon icon={faClipboardList} size="5x"/>
                                </p>
                                <p>
                                    A aplicação apresenta uma listagem dos dados referentes a 
                                    Servidores, Contratos, Fornecedores e Licitações, obtidos pelo 
                                    Tribunal de Contas do Estado do Maranhão. Os dados são organizados em 
                                    tabelas interativas.
                                </p>
                            </td>
                            <td className="blocoLista">
                                <p>
                                    <FontAwesomeIcon icon={faFileCsv} size="5x"/>
                                </p>
                                <p>
                                    Além de listar os dados obtidos, a aplicação também permite extrair
                                    toda a informação listada em arquivos CSV. Basta um simples clique!
                                </p>
                            </td>
                        </tr>
                        <tr className="itemLista">
                            <td className="blocoLista">
                                <p>
                                    <FontAwesomeIcon icon={faMapMarkerAlt} size="5x"/>                                
                                </p>
                                <p>                                
                                    A aplicação recupera dados 100% maranhense, oriundos de uma API Pública 
                                    do Tribunal de Contas do Estado.
                                </p>
                            </td>
                            <td className="blocoLista">
                                <p>
                                    <FontAwesomeIcon icon={faTachometerAlt} size="5x"/>
                                </p>
                                <p>
                                    O projeto conta ainda com uma Dashboard responsável por informar dados 
                                    importantes da aplicação.
                                </p>
                            </td>
                        </tr>
                    </tbody>
                </table>                
            </div>
            <Footer/>
        </>
    )
}

export default TelaPrincipal