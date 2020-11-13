import React from 'react';

import { BrowserRouter, Route } from 'react-router-dom'; // BrowserRouter é um tipo de roteamento e Route é usado para definir as rotas
import Contratos from './pages/Contratos';
import Entes from './pages/Entes';
import Fornecedores from './pages/Fornecedores';
import Licitacoes from './pages/Licitacoes';
import Servidores from './pages/Servidores';
import TelaPrincipal from './pages/TelaPrincipal';
import Dashboard from './pages/Dashboard';
import Login from './pages/Login';
import LandingPage from './pages/LandingPage';

function Routes() {
    return (
        <BrowserRouter>
            <Route path="/" exact component={LandingPage} />
            <Route path="/Home" exact component={TelaPrincipal} />
            <Route path="/Servidores" component={Servidores} />
            <Route path="/Fornecedores" component={Fornecedores} />
            <Route path="/Contratos" component={Contratos} />
            <Route path="/Licitacoes" component={Licitacoes} />
            <Route path="/Entes" component={Entes} />
            <Route path="/Dashboard" component={Dashboard} />            
            <Route path="/Login" component={Login} />            
        </BrowserRouter>
    );
}

export default Routes;