import Keycloak from 'keycloak-js'
const keycloakConfig = {
    url: "http://localhost:8080/auth/",
    realm: "App-TCE",
    clientId: "login"
}
const keycloak = new Keycloak(keycloakConfig);
export default keycloak