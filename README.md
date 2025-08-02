# TechTubeGuide-Backend

TechTubeGuide-Backend is a Java-based backend service designed to support the TechTubeGuide application. It is built using Spring Boot and provides RESTful APIs for managing and delivering course suggestions and related functionalities.

## Features
- RESTful API endpoints for course suggestions
- Integration with external data sources
- Configurable via `pom.xml` and `application.properties`
- Docker support for containerized deployment

## Project Structure
```
TechTubeGuide-Backend/
├── src/main/java/com/coursesuggestor/findright/    # Main Java source code
├── src/test/java/                                 # Unit and integration tests
├── pom.xml                                        # Maven build configuration
├── Dockerfile                                     # Docker configuration
├── HELP.md                                        # Spring Boot help and reference
```

## Getting Started
### Prerequisites
- Java 17 or above
- Maven 3.8+
- (Optional) Docker

### Build & Run
```sh
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### Docker
```sh
# Build Docker image
docker build -t techtubeguide-backend .

# Run Docker container
docker run -p 8080:8080 techtubeguide-backend
```

## Configuration
Configuration can be managed via the `application.properties` file located in `src/main/resources/`.

## API Documentation
API endpoints and usage details can be found in the codebase or by running the application and accessing the Swagger UI (if enabled).

## Contributing
Feel free to fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.
