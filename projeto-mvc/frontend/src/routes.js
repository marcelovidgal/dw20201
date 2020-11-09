import React from 'react';

import { BrowserRouter, Route } from 'react-router-dom'; // BrowserRouter é um tipo de roteamento e Route é usado para definir as rotas
import Contratos from './pages/Contratos';
import Entes from './pages/Entes';
import Fornecedores from './pages/Fornecedores';
import Licitacoes from './pages/Licitacoes';
import Servidores from './pages/Servidores';
import TelaPrincipal from './pages/TelaPrincipal';

function Routes() {
    return (
        <BrowserRouter>
            <Route path="/" exact component={TelaPrincipal} />
            <Route path="/servidores" component={Servidores} />
            <Route path="/fornecedores" component={Fornecedores} />
            <Route path="/contratos" component={Contratos} />
            <Route path="/licitacoes" component={Licitacoes} />
            <Route path="/entes" component={Entes} />
        </BrowserRouter>
    );
}

export default Routes;