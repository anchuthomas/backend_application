FROM eclipse-temurin:17-jdk-alpine
WORKDIR /usr/app
COPY target/products_api.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","products_api.jar"]
