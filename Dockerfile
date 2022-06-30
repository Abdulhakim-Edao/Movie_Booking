FROM openjdk:17
#ADD wait-for-mysql.sh /tmp/
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/app.jar"]