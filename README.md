# API de Lista de Tarefas (To-Do List) com Spring Boot

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)

API RESTful desenvolvida como parte de um estudo prático sobre a construção de aplicações back-end robustas e modernas utilizando o ecossistema Spring.

## 🎯 Objetivo do Projeto

O objetivo principal deste projeto é aplicar e solidificar conhecimentos em Spring Boot, Spring Data JPA e boas práticas de desenvolvimento de APIs. A aplicação consiste em um sistema simples de "Lista de Tarefas" (To-Do List) que permite realizar as operações básicas de **Criar, Ler, Atualizar e Deletar** (CRUD).

---

## 🛠️ Tecnologias Utilizadas

* **[Java 21](https://www.oracle.com/java/)**: Versão mais recente da linguagem Java.
* **[Spring Boot](https://spring.io/projects/spring-boot)**: Framework principal para a criação da aplicação de forma rápida e configurável.
* **[Spring Web](https://docs.spring.io/spring-framework/reference/web/webmvc.html)**: Para a construção de endpoints RESTful.
* **[Spring Data JPA](https://spring.io/projects/spring-data-jpa)**: Para facilitar o acesso e a persistência de dados.
* **[Maven](https://maven.apache.org/)**: Gerenciador de dependências e build do projeto.
* **[H2 Database](https://www.h2database.com/html/main.html)**: Banco de dados em memória, utilizado para agilizar o desenvolvimento e testes.
* **[Lombok](https://projectlombok.org/)**: Para reduzir código boilerplate (getters, setters, construtores, etc.).

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java 21
* Maven

### Passo a Passo
1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/todolist-api-springboot.git](https://github.com/seu-usuario/todolist-api-springboot.git)
    ```
    *(Lembre-se de substituir `seu-usuario/todolist-api-springboot.git` pela URL real do seu repositório)*

2.  **Acesse a pasta do projeto:**
    ```bash
    cd todolist-api
    ```

3.  **Execute a aplicação:**
    ```bash
    mvn spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

---

## 📝 Endpoints da API

* **`GET /tarefas`**: Lista todas as tarefas cadastradas.
    * **Exemplo de Resposta:**
        ```json
        [
            {
                "id": 1,
                "titulo": "Configurar o Backend",
                "descricao": "Criar a entidade e o repositório da Tarefa.",
                "concluida": true
            },
            {
                "id": 2,
                "titulo": "Criar a API REST",
                "descricao": "Desenvolver o endpoint para listar as tarefas.",
                "concluida": false
            }
        ]
        ```

*(Futuramente, outros endpoints como POST, PUT e DELETE serão adicionados aqui)*

---

## 🔧 Estrutura do Projeto