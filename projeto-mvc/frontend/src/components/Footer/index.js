import React from 'react';
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from "mdbreact";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faEnvelope } from "@fortawesome/free-solid-svg-icons";
import { faGithub } from '@fortawesome/free-brands-svg-icons';

import './styles.css'

function FooterCustom() {
  return (
    <MDBFooter color="blue" className="font-small pt-4 mt-4" id="rodape">
      <MDBContainer fluid className="text-center text-md-center">
        <MDBRow>
          <MDBCol md="6" className="colunaRodape">
            <h5 className="title">Sobre o projeto</h5>
            <p>
              Aplicação desenvolvida como projeto da disciplina Programação Web Servidor do curso de Engenharia de Computação da UEMA
              no período 2020.1. A partir desta, é possível coletar dados a partir da API pública do Tribunal de Contas do Estado do 
              Maranhão e listá-los para melhor visualização dos dados.
            </p>
            
          </MDBCol>
          <MDBCol md="6" className="colunaRodape">
            <h5 className="title">Contatos</h5>
            <ul className="listaContatos">
              <li className="list-unstyled">
                <p>Bruno Gomes</p>                
                  <a href="mailto:brunogomess7@gmail.com"><FontAwesomeIcon icon={faEnvelope} /></a>                
                  <a href="https://github.com/BrunoGomes99" target="_blank"><FontAwesomeIcon icon={faGithub} /></a>                                
              </li>
              <li className="list-unstyled">
                <p>Matheus Adler</p>
                  <a href="mailto:matheusadler@gmail.com"><FontAwesomeIcon icon={faEnvelope} /></a>                
                  <a href="https://github.com/Matheusadler" target="_blank"><FontAwesomeIcon icon={faGithub} /></a>                 
              </li>
            </ul>
          </MDBCol>
        </MDBRow>
      </MDBContainer>
      <div className="footer-copyright text-center py-3">
        <MDBContainer fluid>
          &copy; {new Date().getFullYear()} Copyright: <a href="http://tce.ma.gov.br" target="_blank"> site.tce.ma.gov.br </a>
        </MDBContainer>
      </div>
    </MDBFooter>
  );
}

export default FooterCustom;
