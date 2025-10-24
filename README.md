
Commande pour compiler et tester le projet


```bash
docker run --pull always -v "$(pwd)/rest-service:/app" -w /app maven:3.9.5-amazoncorretto-17 mvn test
```



Commande pour supprimer les résultats des compilations depuis un container

```bash
docker run --pull always -v "$(pwd)/rest-service:/app" -w /app maven:3.9.5-amazoncorretto-17 mvn clean
```