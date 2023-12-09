FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
COPY target/students-0.0.1-SNAPSHOT.jar students.jar
ENTRYPOINT ["java","-jar","/students.jar"]