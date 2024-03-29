## Spring Boot and Hibernate Search integration

### Build and run

#### Configurations

Open the `application.properties` file and set your own configurations:

- Database connection parameters (this example use MySQL5 as DBMS)
- Hibernate Search's index directory

#### Prerequisites

- Java 8
- Maven > 3.0

#### From terminal

Go on the project's root folder, then type:

    $ mvn spring-boot:run

#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.


### Usage

- Run the application
- Type the url `http://localhost:8080/search?q=some text to search`: a search
  will be performed for the query text "*some text to search*".
