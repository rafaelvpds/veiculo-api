# Estágio 1: Build da aplicação
FROM ubuntu:latest AS build

# Atualizar a lista de pacotes
RUN apt-get update

# Instalar OpenJDK 17
RUN apt-get install -y openjdk-17-jdk

# Instalar Maven
RUN apt-get install -y maven

# Copiar todos os arquivos do diretório atual para o contêiner
COPY . .

# Executar Maven clean install
RUN mvn clean install

# Estágio 2: Criar imagem final
FROM openjdk:17-jdk-slim

# Expor a porta 3000 (se necessário)
EXPOSE 3000

# Copiar o JAR da aplicação do estágio de build anterior
COPY --from=build /caminho/para/o/seu/projeto/target/veicular-0.0.1-SNAPSHOT.jar app.jar

# Comando de entrada para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
