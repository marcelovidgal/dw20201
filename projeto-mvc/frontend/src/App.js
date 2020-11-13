import React from 'react';
import './assets/styles/global.css';
import Routes from './routes';
import { ReactKeycloakProvider } from '@react-keycloak/web';
import { useKeycloak } from '@react-keycloak/web';
import keycloak from './services/keycloak';

function App() {
  
  return (
    <ReactKeycloakProvider
      authClient={keycloak}  
    >
      <div className="App">
        <Routes />    
      </div>    
    </ReactKeycloakProvider>
  );
}

export default App;
