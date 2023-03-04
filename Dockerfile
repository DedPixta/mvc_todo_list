FROM maven:3.9.0-eclipse-temurin-17-alpine AS build

# Copy pom.xml to the image
COPY pom.xml /home/app/pom.xml
RUN mvn -f /home/app/pom.xml verify clean --fail-never

# Copy the source code
COPY src /home/app/src
RUN mvn -f /home/app/pom.xml package

# Install Tomcat    & jdk 17
FROM tomcat:9-jdk17-temurin
# Copy source files to tomcat folder structure
COPY --from=build /home/app/target/mvc_todo_list.war /usr/local/tomcat/webapps/todo.war

EXPOSE 8080

CMD ["catalina.sh", "run"]