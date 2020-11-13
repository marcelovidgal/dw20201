import React, {useState} from 'react';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemIcon from '@material-ui/core/ListItemIcon';
import ListItemText from '@material-ui/core/ListItemText';
import ListSubheader from '@material-ui/core/ListSubheader';
import PersonIcon from '@material-ui/icons/Person';
import HomeIcon from '@material-ui/icons/Home';
import ExitToAppIcon from '@material-ui/icons/ExitToApp';
import MonetizationOnIcon from '@material-ui/icons/MonetizationOn';
import PeopleIcon from '@material-ui/icons/People';
import DescriptionIcon from '@material-ui/icons/Description';
import AssignmentIcon from '@material-ui/icons/Assignment';
import Divider from '@material-ui/core/Divider';

import { useKeycloak } from '@react-keycloak/web';

function ListDashboard (){

  const { keycloak, initialized } = useKeycloak();
  const [ nomeUsuario, setNomeUsuario ] = useState(); 

  const infoUsuario = keycloak.loadUserInfo().then( userInfo => {
    setNomeUsuario(userInfo.name);
  });

  return(
    <>
    <List>    
      <ListItem>
        <ListItemIcon>
          <PersonIcon />
        </ListItemIcon>
        <ListItemText primary={nomeUsuario} />
      </ListItem>
      <Divider/>
      <ListItem button component="a" href="/">
        <ListItemIcon>
          <HomeIcon />
        </ListItemIcon>
        <ListItemText primary="Início" />
      </ListItem>
      <ListItem button component="a" href="/Servidores">
        <ListItemIcon>
          <PeopleIcon />
        </ListItemIcon>
        <ListItemText primary="Servidores" />
      </ListItem>
      <ListItem button component="a" href="/Contratos">
        <ListItemIcon>
          <DescriptionIcon />
        </ListItemIcon>
        <ListItemText primary="Contratos" />
      </ListItem>
      <ListItem button component="a" href="/Fornecedores">
        <ListItemIcon>
          <MonetizationOnIcon />
        </ListItemIcon>
        <ListItemText primary="Fornecedores" />
      </ListItem>
      <ListItem button component="a" href="/Licitacoes">
        <ListItemIcon>
          <AssignmentIcon />
        </ListItemIcon>
        <ListItemText primary="Licitações" />
      </ListItem>
      <Divider/>
      <ListSubheader inset>Encerrar sessão</ListSubheader>
      <ListItem button component="a" onClick={() => keycloak.logout()}>
        <ListItemIcon>
          <ExitToAppIcon />
        </ListItemIcon>
        <ListItemText primary="Sair" />
      </ListItem>
    </List>
    </>
  );
}

export default ListDashboard;