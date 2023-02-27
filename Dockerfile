FROM maven:3.6.3-jdk-11-slim

COPY entrypoint.sh /usr/local/bin/entrypoint.sh
#COPY target/ikm-demo-0.0.1-SNAPSHOT.jar ikm-demo-0.0.1-SNAPSHOT.jar

ENV JAVA_VERSION jdk-11.0.11+9
COPY slim-java* /usr/local/bin/

#Start application
WORKDIR /usr/src/mymaven
ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]
CMD ["bash"]