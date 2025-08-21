# Masjid Asset Inventory 

**Stack:** Java 24 • Spring Boot 3.5.4 • PostgreSQL • Angular (Material) • OAuth2 Login (e.g., Keycloak/Google) • JWT Resource Server • Flyway • Springdoc OpenAPI • Scheduler for overdue notifications

## Getting Started
Create Spring Boot Starter Project with the following dependencies
* Spring Boot DevTools
* Lombok
* Docker Compose Support
* Spring Modulith
* Java Mail Sender
* Spring Boot Actuator
* Spring Data JPA
* Flyway Migration
* PostgreSQL Driver
* Spring Security
* OAuth2 Client
* OAuth2 Resource Server
* Spring Web

and also springdoc-openapi v2.8.10

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.5.4/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.5.4/maven-plugin/build-image.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.5.4/reference/actuator/index.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.5.4/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.5.4/reference/using/devtools.html)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.5.4/reference/features/dev-services.html#features.dev-services.docker-compose)
* [Flyway Migration](https://docs.spring.io/spring-boot/3.5.4/how-to/data-initialization.html#howto.data-initialization.migration-tool.flyway)
* [Java Mail Sender](https://docs.spring.io/spring-boot/3.5.4/reference/io/email.html)
* [Spring Modulith](https://docs.spring.io/spring-modulith/reference/)
* [OAuth2 Client](https://docs.spring.io/spring-boot/3.5.4/reference/web/spring-security.html#web.security.oauth2.client)
* [OAuth2 Resource Server](https://docs.spring.io/spring-boot/3.5.4/reference/web/spring-security.html#web.security.oauth2.server)
* [Spring Security](https://docs.spring.io/spring-boot/3.5.4/reference/web/spring-security.html)
* [Validation](https://docs.spring.io/spring-boot/3.5.4/reference/io/validation.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.5.4/reference/web/servlet.html)
* [Springdoc-OpenApi](https://springdoc.org/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Docker Compose support
This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* postgres: [`postgres:latest`](https://hub.docker.com/_/postgres)

Please review the tags of the used images and set them to the same as you're running in production.

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

Add the following in your pom.xml  

```
<maven.compiler.proc>full</maven.compiler.proc>  
```

> full is the default. Starting with JDK 21, this option must be set explicitly.

