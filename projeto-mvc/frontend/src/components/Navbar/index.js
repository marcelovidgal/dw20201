import React from 'react';
import { Nav, NavDropdown, Button, Navbar, Form, FormControl, Accordion, Card } from 'react-bootstrap';


import './styles.css'

function NavBar(props) {

    return (
      <>
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
                <Nav.Link href="#link">Dashboard</Nav.Link>
                <NavDropdown title="Listagens" id="basic-nav-dropdown" alignRight className="dropdown">
                  <NavDropdown.Item href="Servidores">Servidores</NavDropdown.Item>
                  <NavDropdown.Item href="Contratos">Contratos</NavDropdown.Item>
                  <NavDropdown.Item href="Fornecedores">Fornecedores</NavDropdown.Item>                  
                  <NavDropdown.Item href="Licitacoes">Licitações</NavDropdown.Item>
                  <NavDropdown.Divider />
                  <NavDropdown.Item href="Entes">Entes</NavDropdown.Item>
                </NavDropdown>
              </Nav>  
            </Navbar.Collapse>
            </div>
        </Navbar>
        
        <div className="navContent">
          <h3>{props.title}</h3>
        </div>

        </header>
        </>
    )
}

export default NavBar;