# Gerenciador de Séries

Este projeto é um gerenciador de séries desenvolvido em **Java 17** utilizando **Spring Boot 3.4.1**. Ele permite cadastrar, listar, atualizar e excluir informações sobre séries, ajudando os usuários a organizar as séries que estão assistindo ou pretendem assistir.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.4.1**
- **Maven**
- **H2 Database** (para testes e desenvolvimento local)
- **Thymeleaf** (para renderização de templates no front-end)
- **Spring Data JPA** (para interação com o banco de dados)
- **Lombok** (para reduzir o boilerplate no código)

## Funcionalidades

1. **Cadastrar Séries**: Permite adicionar novas séries ao banco de dados com informações como nome, gênero, e status (assistindo, pendente, concluído).
2. **Listar Séries**: Exibe todas as séries cadastradas com possibilidade de filtros e ordenações.
3. **Atualizar Séries**: Permite editar as informações de uma série já cadastrada.
4. **Excluir Séries**: Remove uma série do banco de dados.

## Configuração do Ambiente

### Pré-requisitos

1. **Java 17** instalado
2. **Maven** instalado
3. IDE de sua preferência (IntelliJ IDEA recomendado)

### Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/kurjata/Gerenciador_Series_Spring_Boot.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd Gerenciador_Series_Spring_Boot
   ```

3. Compile o projeto com Maven:
   ```bash
   mvn clean install
   ```

4. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse a aplicação em seu navegador no endereço:
   ```
   http://localhost:8080
   ```

## Endpoints da API

| Método | Endpoint          | Descrição                      |
|---------|-------------------|----------------------------------|
| GET     | `/series`         | Lista todas as séries           |
| POST    | `/series`         | Cadastra uma nova série         |
| GET     | `/series/{id}`    | Detalha uma série específica    |
| PUT     | `/series/{id}`    | Atualiza uma série existente     |
| DELETE  | `/series/{id}`    | Remove uma série do sistema      |

## Estrutura do Projeto

```plaintext
src/
|-- main/
    |-- java/
        |-- com.example.series/
            |-- GerenciadorSeriesApplication.java  # Classe principal
            |-- controller/
                |-- SeriesController.java          # Controlador REST
            |-- model/
                |-- Series.java                    # Entidade Series
            |-- repository/
                |-- SeriesRepository.java          # Repositório JPA
            |-- service/
                |-- SeriesService.java             # Regras de negócio
    |-- resources/
        |-- application.properties                # Configurações do Spring
        |-- templates/
            |-- index.html                        # Template inicial com Thymeleaf
|-- test/
    |-- com.example.series/
        |-- SeriesControllerTest.java             # Testes unitários
```

## Configurações Adicionais

### Banco de Dados

Por padrão, este projeto utiliza o H2 Database para fins de desenvolvimento e testes. As credenciais padrão estão definidas no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:seriesdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

### Lombok

Certifique-se de que sua IDE possui suporte ao Lombok. No IntelliJ IDEA, ative o plugin do Lombok e habilite a anotação em `Preferences > Build, Execution, Deployment > Compiler > Annotation Processors`.


## Contribuição

Contribuições são bem-vindas! Abra issues ou envie pull requests para melhorias no projeto.

