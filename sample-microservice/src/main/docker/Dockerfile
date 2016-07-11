FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD Service.jar Service.jar
RUN sh -c 'touch /Service.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/Service.jar"]