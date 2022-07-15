# Envirionment
```
 Framework
 - SpringBoot 2.6.9.RELEASE

 Build
 - Gradle 7.4.2

 Language
 - Kotlin1.6 Java11 OpneJDK11

 Encoding
 - UTF-8

 Requirements
 - Spring Data Redis 2.x binaries require JDK level 8.0 and above and Spring Framework 5.3.11 and above.
 - In terms of key-value stores, Redis 2.6.x or higher is required. Spring Data Redis is currently tested against the latest 4.0 release.

```

# Build and Test
```bash
docker-compose up -d
```

```bash
./gradlew wrapper --gradle-version=7.4.2 --distribution-type=bin
./gradlew -v
./gradlew --refresh-dependencies
./gradlew clean build -xtest
```

```bash
./gradlew bootRun
./gradlew clean bootRun -Dspring.profiles.active=h2
./gradlew clean bootRun --args='--spring.profiles.active=h2'

```

## H2DB 접속
- http://localhost:8080/h2-console/login.do
- jdbc:h2:~/vincenzo
- vincenzo / vincenzo


## Swagger
```
Local
* http://localhost:8080/swagger-ui.html
* http://localhost:8080/v3/api-docs/
* http://localhost:8080/actuator/health

```

## History
###### application-h2.yml
```
spring boot 2.1.10 이후로 h2 사용 시 jdbc-url에 MODE=MYSQL을 붙여줘야하며, MySQL5InnoDBDialect는 deprecated되어서 MySQL57Dialect를 사용해야한다고 함
```

###### resources/import.sql
```
스프링부트가 실행될 때 자동으로 해당 파일의 쿼리를 실행
- import.sql은 하이버테이트가 실행
- data.sql은 스프링 JDBC가 실행
```
