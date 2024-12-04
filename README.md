## mvc-content-neg-views

Demonstration application showing the use of Content-Negotiation in Spring MVC with
multiple Views.

### URLs

```asciidoc
http://localhost:8080/users                  HTML
http://localhost:8080/users?mediaType=xml    XML
http://localhost:8080/users?mediaType=json   JSON
```

### Ref

[Spring MVC Content Negotiating View Resolver Example (Json, XML, HTML)](https://www.devglan.com/spring-mvc/spring-mvc-contentnegotiating-viewresolver-example)

### Notes

@RequestBody can interpret the request data based on the `content-type` header.

### Other related reference documents
1. [Spring MVC Content Negotiating Viewr Resolver Example (Json, XML, HTML)](https://www.devglan.com/spring-mvc/spring-mvc-contentnegotiating-viewresolver-example)
2. [Content Negotiation with ControllerAdvice and ExceptionHandlers in Spring (Boot)](https://www.jvt.me/posts/2022/01/18/spring-negotiate-exception-handler/)
3. [Content negotiation with Spring Data JPA Projections (using HandlerMethodArgumentResolver)](https://www.bluemagma.be/en/2018/10/content-negotiation-with-spring-data-jpa-projections/)
4. [Content-Negotiation in Spring MVC with multiple Views](https://spring.io/blog/2013/06/03/content-negotiation-using-views)
5. [A Custom Data Binder in Spring MVC (using HandlerMethodArgumentResolver)](https://www.baeldung.com/spring-mvc-custom-data-binder).
