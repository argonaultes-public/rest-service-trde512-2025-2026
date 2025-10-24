
Commande pour compiler et tester le projet


```bash
docker run --pull always -v "$(pwd):/app" -w /app maven:3.9.5-amazoncorretto-17 mvn test
```

Commande pour supprimer les résultats des compilations depuis un container

```bash
docker run --pull always -v "$(pwd):/app" -w /app maven:3.9.5-amazoncorretto-17 mvn clean
```

```bash
docker run --rm --pull always -e DATABASE_URL_TEST=jdbc -v "m2:/root/.m2" -v "$(pwd):/app" -w /app maven:3.9.5-amazoncorretto-17 mvn -Ptestdb clean integration-test
```

Création d'un conteneur Postgres

```bash
docker run --rm -d -e POSTGRES_PASSWORD=password postgres:17
```