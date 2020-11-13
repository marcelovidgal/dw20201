# Instruções para Aplicação TCE

A seguir será apresentado um passo a passo de como executar o projeto em questão.
Vale lembrar que todo o projeto foi desenvolvido e testado no Visual Studio Code e usando o java 8.

## API Rest

A API Rest está localizada no projeto chamado "projeto-rest".

1- Primeiramente, você deve estar localizado nesta pasta a partir da seguinte linha de comando:
```
cd dw20201-master\projeto-rest
```

2- Uma vez na pasta, basta executar o comando abaixo na linha de comando para rodar a aplicação:
```
./mvnw spring-boot:run
```

## Inicializando o servidor Keycloak

Para ativar o servidor do Keycloak, você precisa abrir a pasta "keycloak-11.0.3" existente na raíz do repositório e em seguida deve seguir os passos abaixo:

1- Vá até o diretório `bin`.
```
cd keycloak-11.0.3\bin
```

2- Nessa etapa você precisa executar o arquivo `standalone` com um duplo clique.
    Para usuários Windows, execute o arquivo `.bat`:
```
standalone.bat
```
    Para usuários Linux/Unix, execute o arquivo `.sh`:
```
standalone.sh
```

Pronto, o servidor Keycloak estará rodando.

## Inicializando o frontend da aplicação

Para a execução do frontend, você deve abrir outro projeto no Visual Studio Code, mas mantenha o projeto da Rest API rodando.

1- Primeiramente esteja na pasta do projeto. Você deve abrir a pasta "projeto-mvc" e em seguida a pasta "frontend".
```
cd dw20201-master\projeto-mvc\frontend
```

2- Uma vez na pasta correta, execute o comando abaixo na linha de comando para iniciar a aplicação
```
yarn start
```

## Acessando a aplicação
Após executar a aplicação, a mesma abrirá automaticamente no seu navegador. Entretanto, para fins de informação, é importante saber que a aplicação estará rodando no endereço `http://localhost:3000`.