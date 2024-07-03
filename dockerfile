# Estágio 1: Build da aplicação
FROM maven:3.8.1-openjdk-17-slim AS build

WORKDIR /app

# Copiar arquivo pom.xml primeiro para aproveitar o cache de dependências do Maven
COPY pom.xml .

# Baixar as dependências do Maven (somente se o pom.xml mudou)
RUN mvn dependency:go-offline

# Copiar o código fonte
COPY src ./src

# Compilar e empacotar a aplicação
RUN mvn package -DskipTests

# Estágio 2: Criar imagem final
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiar o JAR da aplicação do estágio de build anterior
COPY --from=build /app/target/veicular-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta 3000 (se necessário)
EXPOSE 3000

# Comando de entrada para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
