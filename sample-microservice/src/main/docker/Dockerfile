FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD service.jar service.jar
RUN sh -c 'touch /service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/service.jar"]