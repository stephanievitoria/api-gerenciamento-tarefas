# API de Gerenciamento de Tarefas

API REST desenvolvida em **Java** utilizando **Spring Boot** para gerenciamento de tarefas.
O projeto segue arquitetura em camadas e implementa operações CRUD completas, além de testes unitários.

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* H2 Database
* JUnit
* Mockito
* Maven

## Arquitetura

O projeto segue uma arquitetura em camadas:

- **controller** → responsável pelos endpoints da API  
- **service** → contém a lógica de negócio  
- **repository** → acesso ao banco de dados  
- **model** → entidades da aplicação

Estrutura de pacotes:

src/main/java/com/exemplo/taskmanager

controller
service
repository
model

## Funcionalidades

* Criar tarefa
* Listar tarefas
* Buscar tarefa por ID
* Atualizar tarefa
* Deletar tarefa

## Endpoints da API

GET /tarefas
Lista todas as tarefas

GET /tarefas/{id}
Busca uma tarefa pelo ID

POST /tarefas
Cria uma nova tarefa

PUT /tarefas/{id}
Atualiza uma tarefa existente

DELETE /tarefas/{id}
Remove uma tarefa

## Exemplo de requisição

### Criar tarefa

POST /tarefas

Body:

{
"titulo": "Estudar Spring Boot",
"concluida": false
}

### Resposta

{
"id": 1,
"titulo": "Estudar Spring Boot",
"concluida": false
}

## Executando o projeto

1. Clone o repositório

git clone https://github.com/stephanievitoria/api-gerenciamento-tarefas.git

2. Acesse a pasta do projeto

3. Execute a aplicação

./mvnw spring-boot:run

ou pela IDE (IntelliJ / Eclipse).

A API estará disponível em:

http://localhost:8080/tarefas

## Banco de dados

O projeto utiliza **H2 Database** em memória para facilitar a execução.

Console do H2 disponível em:

http://localhost:8080/h2-console

## Executando os testes

Para rodar os testes unitários:

mvn test

Os testes utilizam:

* JUnit 5
* Mockito

## Autor

Projeto desenvolvido para fins de estudo e portfólio.
