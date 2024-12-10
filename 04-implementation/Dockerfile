FROM chainguard/maven:openjdk-21

USER root
WORKDIR /app

COPY . .

#RUN mvn -v
#RUN mvn install

EXPOSE 8000
CMD ["spring-boot:run"]
