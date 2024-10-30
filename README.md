# Gerenciador de Tarefas - Backend

API REST desenvolvida em Java com Spring Boot para gerenciamento de tarefas diárias.
É uma aplicação web intuitiva que permite aos usuários organizar suas tarefas diárias de forma eficiente. Com uma interface responsiva, os usuários podem adicionar, visualizar e remover tarefas facilmente, recebendo feedback imediato sobre suas ações. A aplicação foi projetada para oferecer uma experiência fluida e centrada no usuário.

![Gerenciador de Tarefas](https://github.com/user-attachments/assets/cb632e73-4347-4e10-b1a7-9885ea7c800d)

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven

## Pré-requisitos

- JDK 17 ou superior
- Maven
- PostgreSQL
- IDE (recomendado: IntelliJ IDEA)

## Configuração do Ambiente

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/gerenciador-tarefas-backend.git
cd gerenciador-tarefas-backend
```

2. Configure o banco de dados PostgreSQL no arquivo `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gerenciador_tarefas
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

3. Instale as dependências:
```bash
mvn clean install
```

## Executando o Projeto

1. Execute o projeto através do Maven:
```bash
mvn spring-boot:run
```

2. A API estará disponível em `http://localhost:8080`

## Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/nicolas/gerenciador/gerenciadortarefas
│   │       └── GerenciadorTarefasApplication
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       └── service/
│   └── resources/
│       └── application.properties
└── test/
```

## Endpoints da API

### Tarefas

- `GET /api/tasks` - Lista todas as tarefas
- `GET /api/tasks/{id}` - Busca uma tarefa específica
- `POST /api/tasks` - Cria uma nova tarefa
- `PUT /api/tasks/{id}` - Atualiza uma tarefa existente
- `DELETE /api/tasks/{id}` - Remove uma tarefa

## Testes

Para executar os testes:

```bash
mvn test
```

## Contribuindo

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## Autor

Nícolas Bággio

<div align="center">
  <h2>⭐ Se este repositório foi útil para você, não se esqueça de deixar uma estrela! ⭐</h2>

  <a href="mailto:nicolasbbaggio@gmail.com">
    <img src="https://img.shields.io/badge/Gmail-333333?style=for-the-badge&logo=gmail&logoColor=red">
  </a>
  <a href="https://www.linkedin.com/in/nicolasbaggio/">
    <img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white">
  </a> 
</div>
