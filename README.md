# dw20201

# Git Tutorial

Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.

## Instalação

Instale o [Git](https://git-scm.com/download/mac) no Mac Os 

Instale o [Git](https://gitforwindows.org/) no Windows 

Instale o [Git](https://book.git-scm.com/download/linux) no Linux

## Criando novo repositório

Crie uma nova pasta, abra-a e execute o comando para criar um novo repositório.

```
git init
```

## Obtenha um repositório

Crie uma cópia de trabalho em um repositório local executando o comando.
```
git clone /caminho/para/o/repositório
```
Quando usar um servidor remoto, seu comando será.
```
git clone usuário@servidor:/caminho/para/o/repositório
```


## Fluxo de trabalho

Seus repositórios locais consistem em três "árvores" mantidas pelo git. a primeira delas é sua **Working Directory** que contém os arquivos vigentes. a segunda **Index** que funciona como uma área temporária e finalmente a **HEAD** que aponta para o último commit (confirmação) que você fez.

