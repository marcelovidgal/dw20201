import React from 'react';
import { Nav, NavDropdown, Button, Navbar, Form, FormControl, Accordion, Card } from 'react-bootstrap';
import { withKeycloak } from '@react-keycloak/web';


import './styles.css'

function NavBar(props) {

    if(props.isLandingPage === true){
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
                    <Nav.Link id="loginDrawer" href="Login">Login</Nav.Link>                  
                  </Nav>                
                  <Nav.Link id="loginLink" href="Login">Login</Nav.Link>                
                </Navbar.Collapse>
                </div>
          </Navbar>
          
          <div className="navContent">
            <h3>{props.title}</h3>
          </div>
        </header>
        </>
      )
    }else{

      return(
        <>
        <header>
        <Navbar  variant="dark" expand="lg" id="navbar">
            <div class="customHeader">
              <div class="logoButton">
                <Navbar.Brand href="/Home">Aplicação TCE</Navbar.Brand>
                <Navbar.Toggle aria-controls="basic-navbar-nav" />
              </div>
              <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="mr-auto">
                  <Nav.Link href="Home">Home</Nav.Link>
                  <Nav.Link href="Dashboard">Dashboard</Nav.Link>
                  <NavDropdown title="Listagens" id="basic-nav-dropdown" alignRight className="dropdown">
                    <NavDropdown.Item href="Servidores">Servidores</NavDropdown.Item>
                    <NavDropdown.Item href="Contratos">Contratos</NavDropdown.Item>
                    <NavDropdown.Item href="Fornecedores">Fornecedores</NavDropdown.Item>                  
                    <NavDropdown.Item href="Licitacoes">Licitações</NavDropdown.Item>
                    <NavDropdown.Divider />
                    <NavDropdown.Item href="Entes">Entes</NavDropdown.Item>
                  </NavDropdown>               
                  <Nav.Link id="loginDrawer" href="Login">Logout</Nav.Link>       
                </Nav>                
                <Nav.Link id="loginLink" href="Login">Logout</Nav.Link>                
              </Navbar.Collapse>
              </div>
          </Navbar>
          
          <div className="navContent">
            <h3>{props.title}</h3>
          </div>
          </header>
          </>
      );
    }

}

export default NavBar;