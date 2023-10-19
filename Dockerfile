FROM openjdk

MAINTAINER tanya

WORKDIR /app

COPY target/PhoneBook.jar /app/PhoneBook.jar
ENTRYPOINT ["java","-jar","PhoneBook.jar"]
