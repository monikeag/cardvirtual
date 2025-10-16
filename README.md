<h1> Cartão Virtual </h1>
<p> Este projeto é uma API REST desenvolvida com <strong>Java + Spring Boot</strong>, que permite gerar <strong>cartões virtuais com números aleatórios</strong> a partir do envio de um e-mail. Os dados são armazenados em um banco de dados em memória (H2-console) e podem ser consultados posteriormente.</p>

<h2>Funcionalidades</h2>

- POST /cartoes → Cria um novo cartão virtual com base no e-mail enviado.
- GET /cartoes → Lista todos os cartões virtuais gerados.


<h2>Tecnologias Utilizadas</h2>

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Postman (para testes)


 <h2>Estrutura do Projeto</h2>

src/
├── controller/      # Endpoints REST
├── service/         # Lógica de negócio
├── model/           # Entidade CardVirtual
├── repository/      # Interface de acesso ao banco
└── resources/
    └── application.properties
