<<<<<<< HEAD
## Ramificações (branches)

No git, o projeto pode ter ramificações que são utilizadas para desenvolver funcionalidades isoladas umas das outras. A estas ramificações é dado o nome *branch*.
Mas independente disso, todo projeto irá possuir um branch principal chamado *master*, e é a partir dele que outras ramificações serão criadas. A imagem abaixo ilustra esse processo.

<img>

Na imagem, o segmento chamado *feature* consiste em um branch criado a partir do *master*. Toda a versão do projeto, no momento em que o branch foi criado, será mantida em *feature*,
permitindo você trabalhar em ouras funcionalidades de forma isolada ao segmento principal.

Abaixo, encontra-se um código de exemplo onde criamos o brach *feature* e o selecionamos através do comando 'checkout':

```
git checkout -b feature
```

Se você deseja retornar para o branch *master*, basta usar o comando:

```
git checkout master
```

Você ainda pode remover um branch existente com o seguinte comando:

```
git branch -d feature
```

Uma vez criado, um branch não estará disponível a todos do projeto ao menos que você o envie para o repositório remoto, da seguinte forma:

```
git push origin <feature>
```

## Adicionando e confirmando alterações

Uma vez que seu código contém alterações em relação ao repositório remoto,
você poderá propor suas mudanças adicionando-as ao seu **Index**.

Se você deseja adicionar apenas um arquivo em específico que foi alterado, use o comando abaixo:

```
git add <arquivo_alterado> 
```

Entretanto, se você deseja adicionar todas as suas alterações feitas, utilize um asterisco para representar o todo:

```
git add *
```

Uma vez adicionada suas alterações, o próximo passo é confirmá-las.

:warning: Vale lembrar que suas mudanças serão enviadas para o **Head**, mas ainda não estarão localizadas no repositório remoto.

Para confirmar as alterações, utilize o comando 'commit' da seguinte forma:

```
git commit -m "comentários das alterações"
```

## Enviando ao repositório local

Agora que suas alterações se encontram no **Head** da sua versão local, você pode mandá-las para o repositório remoto através do comando:

```
git push origin master
```

:warning: Onde tem 'master', pode ser alterado por qualquer branch para onde você deseja enviar suas alterações.

Se por acaso você ainda não clonou um repositório existente até aqui e deseja conectar sua versão local a um servidor remoto, utilize o comando:

```
git remote add origin <servidor>
```

A partir disso, você poderá enviar suas alterações para o servidor remoto selecionado.
=======
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

>>>>>>> 33e6cde69baf73abe42392742e3fdffc85b58587
