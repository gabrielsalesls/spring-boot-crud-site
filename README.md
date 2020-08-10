# spring-framework-crud-site

<p align="center">
  <img src="https://img.shields.io/github/languages/count/gabrielsales311/spring-framework-CRUD?style=for-the-badge">
  <img src="https://img.shields.io/github/languages/code-size/gabrielsales311/spring-framework-CRUD?style=for-the-badge">
  <img src="https://img.shields.io/github/stars/gabrielsales311/spring-framework-CRUD?style=for-the-badge">
  <img src="https://img.shields.io/github/last-commit/gabrielsales311/spring-framework-CRUD?style=for-the-badge">
</p>

## *:books: DESCRIÇÃO*
  <h4>Site que realiza quatro operações básicas (Create, Read, Update e Delete) utilizando um modelo simples de Produto.<h4>

## *:computer: TECNOLOGIAS*
As seguintes ferramentas foram usadas na construção do projeto:

- [Java 8](https://www.java.com/pt_BR/download/)
- [Spring Boot](https://spring.io/)
- [Bootstrap](https://getbootstrap.com/)
- [Thymeleaf](https://www.thymeleaf.org/)
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/)

## *:rocket: INSTALAÇÃO*

Importe os arquivos do projeto para a IDE de sua preferência e de build com o Maven. 

## *:hammer: BANCO DE DADOS*
Crie um novo banco de dados no MySql com o nome 'springbootdb' e configure o arquivo `/resources/application.properties`.  
A configuração padrão é :

```
spring.datasource.url=jdbc:mysql://localhost:3306/springbootdb?useTimezone=true&serverTimezone=UTC
spring.datasource.username={nome de usuario}
spring.datasource.password={senha}

spring.jpa.hibernate.ddl-auto=update

```

## *:dart: COMO UTILIZAR*
Após executar o projeto, o caminho padrão para acessar a aplicação é em [http://localhost:8080](http://localhost:8080)

*Cadastrar um novo produto*
[http://localhost:8080/novoproduto](http://localhost:8080/novoproduto)

*Acesso à lista de produtos*
[http://localhost:8080/produtos](http://localhost:8080/produtos)

## *:page_with_curl: LICENÇA*

Esse repositório está licenciado pela *MIT LICENSE*. Para mais informações detalhadas, leia o arquivo [LICENSE](./LICENSE) contido nesse repositório.
