##base da aplicação onde estamos escolhendo a versão do java
FROM eclipse-temurin:17
##dono da imagem
LABEL maintainer="author@email.com"
##pasta que vai ficar salva a imagem
WORKDIR /app
##ação copiar da pasta target o arquivo X.jar para a pasta app com o nome x.jar
COPY target/cadastroDeNinjas-0.0.1-SNAPSHOT.jar /app/cadastro-docker.jar
##autorizando que rode
ENTRYPOINT ["java", "-jar", "cadastro-docker.jar"]