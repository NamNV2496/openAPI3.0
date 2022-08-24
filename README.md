# openAPI3.0
OpenAPI to generate controller and implement delegate pattern

run
```
mvn clean install
```

## Output: `target/generated-sources/openapi/src/main/java/com/openapi3/controller`

open to view swagger
```
http://localhost:8080/swagger-ui/index.html
```

to implement controller, must add `@Service` before

API:

    POST http://localhost:8080/pet/createPet
        {
            "id": 1,
            "name": "dog"
        }

    GET http://localhost:8080/pet/{id}
        GET http://localhost:8080/pet/1

    GET http://localhost:8080/pet/getAll

    