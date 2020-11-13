import React from 'react';
import { Nav, NavDropdown, Button, Navbar, Form, FormControl, Accordion, Card } from 'react-bootstrap';
import { useKeycloak } from '@react-keycloak/web';

import './styles.css'

function NavBar(props) {
    const { keycloak, initialized } = useKeycloak();
      
      return (
        <>
          {keycloak && !keycloak.authenticated && (
            <header>
              <Navbar  variant="dark" expand="lg" id="navbar">
                  <div class="customHeader">
                    <div class="logoButton">
                      <Navbar.Brand href="/">Aplicação TCE</Navbar.Brand>
                      <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    </div>
                    <Navbar.Collapse id="basic-navbar-nav">
                      <Nav className="mr-auto">                                             
                      </Nav>          
                      <Form inline>                    
                        <Button variant="outline-light" onClick={() => keycloak.login()}>Login</Button>
                      </Form>                                      
                    </Navbar.Collapse>
                    </div>
              </Navbar>

              <div className="navContent">
                <h3>{props.title}</h3>
              </div>
            </header>
          )}

    
          {keycloak && keycloak.authenticated && (          
            <header>
              <Navbar  variant="dark" expand="lg" id="navbar">
                <div class="customHeader">
                  <div class="logoButton">
                    <Navbar.Brand href="/">Aplicação TCE</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                  </div>
                  <Navbar.Collapse id="basic-navbar-nav">
                    <Nav className="mr-auto">
                      <Nav.Link href="/">Home</Nav.Link>
                      <Nav.Link href="Dashboard">Dashboard</Nav.Link>
                      <NavDropdown title="Listagens" id="basic-nav-dropdown" alignRight className="dropdown">
                        <NavDropdown.Item href="Servidores">Servidores</NavDropdown.Item>
                        <NavDropdown.Item href="Contratos">Contratos</NavDropdown.Item>
                        <NavDropdown.Item href="Fornecedores">Fornecedores</NavDropdown.Item>                  
                        <NavDropdown.Item href="Licitacoes">Licitações</NavDropdown.Item>                   
                      </NavDropdown>                                         
                    </Nav>           
                    <Form inline>                    
                      <Button variant="outline-light" onClick={() => keycloak.logout()}>Logout</Button>
                    </Form>                                        
                  </Navbar.Collapse>
                  </div>
              </Navbar>
            
              <div className="navContent">
                <h3>{props.title}</h3>
              </div>
            </header>
          )}
        </>
      )

}

export default NavBar;