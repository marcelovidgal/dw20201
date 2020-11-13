import React, { Component } from 'react';
import Keycloak from 'keycloak-js';
import UserInfo from '../Usuario/index';
import Logout from '../Logout/index';
import Dashboard from '../Dashboard/index';

class Login extends Component {

  constructor(props) {
    super(props);
    this.state = { keycloak: null, authenticated: false };  
  }

  componentDidMount() {
    const keycloak = Keycloak({
        realm: "spring",
        url: "http://localhost:8080/auth/",
        clientId: "login"        
    });

    keycloak.init({onLoad: 'login-required'}).then(authenticated => {
      this.setState({ keycloak: keycloak, authenticated: authenticated })
    })
  }

// return isso aqui embaixo
//<div>
//  <p>{this.props.title}</p>
//  <UserInfo keycloak={this.state.keycloak} />
//  <Logout keycloak={this.state.keycloak} />
//</div>

  render() {
    if(this.state.keycloak) {
      if(this.state.authenticated){ 
        if(this.props.isComponent===undefined){
          // Se não for um component, carrega a dashboard
          // Significa que o usuário clicou em login
          return (
            <>
            <Dashboard/>
            </>
          );
        }else{
          // Se for component, carrega o component passo como propriedade
          return (
            <>
            {this.props.component}
            <Logout keycloak={this.state.keycloak} />
            </>
          );
        }
      } else {
        return (
          <div>Unable to authenticate!</div>
      )}
    }
    return (
      <div>Initializing Keycloak...</div>
    );
  }
}
export default Login;
