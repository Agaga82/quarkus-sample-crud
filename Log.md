=== 2021-05-31 - Création du projet
Documents de référence \
https://www.youtube.com/watch?v=rFoKfL5FhU0&list=PLcR0l1ErUwydppYwIkUatOaWj3AEJy6D0&index=5 \
https://quarkus.io/guides/rest-data-panache 

Dans visual studio code -> Ctrl + Shift + p -> Quarkus generate project
Extensions : 
- quarkus-hibernate-orm-rest-data-panache
- quarkus-jdbc-h2
- quarkus-resteasy-jsonb
- quarkus-hibernate-orm-panache
- quarkus-resteasy
- smallrye openapi


Creation d'une classe entity Hello.java et d'une interface de generation de CRUD HelloResource.java
 
Lancement de l'application (l'option IPV4 est uniquement pour le wsl 2)
mvn quarkus:dev -Djava.net.preferIPv4Stack=true

Url d'accès : http://127.0.0.1:8080/q/swagger-ui/
