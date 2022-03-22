
## Environment
```
 Framwork : SpringBoot 2.3.11.RELEASE
 Build : Gradle 6.9
 Language : Java11 OpneJDK11
 Encoding : UTF-8
```

## Build & Run
```
 ./gradlew wrapper --gradle-version={version}
 ./gradlew -v
 ./gradlew clean build -xtest
 ./gradlew clean bootRun --args='--spring.profiles.active=h2'
```
## H2DB 접속
- http://localhost:8080/h2-console/login.do
- sa / sa

## Swagger 접속
- http://localhost:8080/swagger-ui.html
