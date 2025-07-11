FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY . .

# Grant execute permission to mvnw
RUN chmod +x mvnw

# Now run the build
RUN ./mvnw clean package -DskipTests

EXPOSE 8080

CMD ["java", "-jar", "target/TechTubeGuide-Backend-0.0.1-SNAPSHOT.jar"]
