# DESAFIO API RESTFUL - BRADESCO JAVA CLOUD NATIVE 2025

API RESTful criada para o desafio do Bootcamp Bradesco Java Cloud Native 2025.

## Principais Tecnologias
 - **Java 17**: Essa é a versão LTS do Java onde dá para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: A versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Explorando como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Para criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: Facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.


## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
    class Coordinator {
        +String id
        +String name
    }

    class Leader {
        +String id
        +String name
        +String phone
    }

    class Test {
        +String id
        +Question[] questions
    }

    class Question {
        +int id
        +String text
        +String[] alternatives
        +int correctAlternative
    }

    class Result {
        +int testId
        +int leaderId
        +Answer[] answers
    }

    class Answer {
        +String questionId
        +String answeredQuestion
        +int selectedAlternative
        +int correctAlternative
    }

    class ExamSystem {
        +String name
        +Coordinator[] coordinators
        +Leader[] leaders
        +Test[] tests
        +Result[] results
    }

    ExamSystem --> Coordinator : has
    ExamSystem --> Leader : has
    ExamSystem --> Test : has
    ExamSystem --> Result : has
    Test --> Question : contains
    Result --> Answer : contains
```
