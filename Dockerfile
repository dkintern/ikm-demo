FROM openjdk:21-jdk-slim

#"COPY entrypoint.sh /usr/local/bin/entrypoint.sh"
RUN mkdir /java
WORKDIR /java
COPY target/ikm-demo-0.0.1-SNAPSHOT.jar /java/ikm-demo-0.0.1-SNAPSHOT.jar
EXPOSE 7890
ENTRYPOINT ["java", "-jar", "ikm-demo-0.0.1-SNAPSHOT.jar"]
#Start application
#ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]
#CMD ["bash"]