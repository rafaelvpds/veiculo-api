FROM ubuntu:latest AS build

# Atualizar a lista de pacotes
RUN apt-get update

# Instalar OpenJDK 17
RUN apt-get install openjdk-17-jdk -y

# Copiar todos os arquivos do diretório atual para o contêiner
COPY . .

# Instalar Maven
RUN apt-get install maven -y

# Executar Maven clean install
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 3000

COPY --from=build /target/veicular-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

