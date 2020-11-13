import React from 'react';

import { BrowserRouter, Route } from 'react-router-dom'; // BrowserRouter é um tipo de roteamento e Route é usado para definir as rotas
import { useKeycloak } from '@react-keycloak/web';

import PrivateRoute from './utils/PrivateRoute';
import Contratos from './pages/Contratos';
import Fornecedores from './pages/Fornecedores';
import Licitacoes from './pages/Licitacoes';
import Servidores from './pages/Servidores';
import TelaPrincipal from './pages/TelaPrincipal';
import Dashboard from './pages/Dashboard';

function Routes() {

    const { keycloak, initialized } = useKeycloak()
    if (!initialized) {
        return <></>;
    }

    return (
        <BrowserRouter>
            <Route path="/" exact component={TelaPrincipal} />
            <PrivateRoute roles={['usuario']} path="/Servidores" component={Servidores} />
            <PrivateRoute roles={['usuario']} path="/Fornecedores" component={Fornecedores} />
            <PrivateRoute roles={['usuario']} path="/Contratos" component={Contratos} />
            <PrivateRoute roles={['usuario']} path="/Licitacoes" component={Licitacoes} />            
            <PrivateRoute roles={['usuario']} path="/Dashboard" component={Dashboard} />                             
        </BrowserRouter>
    );
}

export default Routes;