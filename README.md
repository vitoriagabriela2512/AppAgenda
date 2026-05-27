AppAgenda 📱
📌 Sobre o Projeto

O AppAgenda é um aplicativo Android desenvolvido em Java no Android Studio com integração ao banco de dados SQLite.

O sistema permite:

Cadastrar pessoas;

Armazenar nome, CPF e telefone;

Listar registros;

Pesquisar contatos;

Atualizar informações;

Excluir registros.

O projeto foi desenvolvido utilizando conceitos de CRUD (Create, Read, Update e Delete) juntamente com menus, ListView e persistência de dados com SQLite.

🎯 Objetivo

Criar uma aplicação mobile simples e funcional para gerenciamento de contatos utilizando banco de dados interno no Android.

🛠️ Tecnologias Utilizadas

Java

Android Studio

XML

SQLite

Android SDK

AppCompat

ConstraintLayout

📂 Estrutura do Projeto

O projeto é composto pelas seguintes classes e arquivos:

Arquivo	Função

MainActivity.java -	Tela de cadastro

ListarPessoasActitivity.java -	Tela de listagem e pesquisa

Pessoa.java	 - Classe entidade

PessoaDAO.java	- Classe CRUD

Conexao.java	- Conexão com SQLite

activity_main.xml -	Layout principal

activity_listar_pessoa_activity.xml	- Layout da listagem

menu_principal.xml	- Menu superior

menu_contexto.xml	- Menu de contexto

📱 Funcionalidades

✅ Cadastro de Pessoas

O usuário pode inserir:

Nome;

CPF;

Telefone.

Os dados são armazenados no banco SQLite.

✅ Listagem de Pessoas

Os registros cadastrados são exibidos em uma ListView.

✅ Pesquisa de Pessoas

O aplicativo possui um campo de pesquisa no menu superior utilizando SearchView.

A pesquisa é realizada em tempo real.

✅ Atualização de Dados

Ao selecionar um item da lista:

O usuário pode editar os dados cadastrados;

Os dados são atualizados no banco.

✅ Exclusão de Dados

O usuário pode remover registros através do menu de contexto.

O sistema exibe uma confirmação antes da exclusão.

🗄️ Banco de Dados SQLite

O aplicativo utiliza o banco:

banco.db

Tabela criada:

pessoa

Campos:

Campo	Tipo

id	Integer

nome	Varchar

cpf	Varchar

telefone	Varchar

📐 CRUD Implementado

Create – Inserir

dao.inserir(pessoa);

Read – Consultar

dao.obterTodos();

Update – Atualizar

dao.atualizar(pessoa);

Delete – Excluir

dao.excluir(pessoa);

🧩 Componentes Utilizados

Layout Principal

EditText

Button

Tela de Listagem

ListView

Menus

Menu principal

Menu de contexto

SearchView

📋 Menus do Sistema

menu_principal.xml

Contém:

Botão cadastrar;
Campo de pesquisa.
menu_contexto.xml

Contém:

Excluir;
Atualizar.

⚙️ Configuração do Manifest

O projeto utiliza:

MainActivity
ListarPessoasActitivity

A activity principal da aplicação é:

ListarPessoasActitivity
📦 Dependências Utilizadas

Adicionar no arquivo build.gradle:

implementation 'androidx.appcompat:appcompat:1.6.1'

implementation 'androidx.constraintlayout:constraintlayout:2.1.4'

▶️ Como Executar o Projeto

Abrir o Android Studio;

Selecionar “Open Project”;

Abrir a pasta do AppAgenda;

Esperar sincronizar o Gradle;

Executar no:

Emulador Android;

Ou celular físico.

📱 Como Utilizar

##Cadastro:

Digite:

Nome;

CPF;

Telefone;

Clique em Salvar.

##Pesquisa:

Clique na lupa;

Digite o nome desejado;

O sistema filtrará automaticamente.

##Atualização:

Pressione e segure um item da lista;

Clique em Atualizar;

Edite os dados;

Salve novamente.

##Exclusão:

Pressione e segure um item;

Clique em Excluir;

Confirme a exclusão.

🖼️ Interface do Aplicativo

##O aplicativo possui:

Layout simples e intuitivo;

Menus interativos;

Pesquisa dinâmica;

Organização visual dos dados;

Navegação fácil.

🧠 Conceitos Trabalhados

##Durante o desenvolvimento foram utilizados conceitos de:

Programação Orientada a Objetos;

SQLite;

CRUD;

Android Studio;

XML;

Activities;

Intents;

Menus;

ListView;

Persistência de Dados.

✅ Resultado Esperado

##O aplicativo deverá:

Cadastrar contatos;

Salvar no banco SQLite;

Listar os dados;

Pesquisar contatos;

Atualizar registros;

Excluir registros;

Funcionar corretamente em emuladores e dispositivos Android.

👨‍💻 Desenvolvedora

Projeto desenvolvido para fins acadêmicos utilizando Java e Android Studio 
Feito por: Vitória Gabriela Fernandes da Luz.


