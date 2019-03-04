FROM  maven:3.5.0
MAINTAINER dongxifu


RUN echo $JAVA_HOME
RUN env

RUN mkdir -p /usr/local/spring-test
WORKDIR /usr/local/spring-test


#add all files

#RUN ls /usr/local/bawx/service-definition
ADD ./src ./src

ADD pom.xml pom.xml


RUN echo $USER_HOME_DIR


RUN pwd
RUN ls

RUN mvn install -Dmaven.test.skip=true

WORKDIR /usr/local/spring-test/target

RUN chmod +x run.sh
#WORKDIR /usr/local/spring-test/target

ENTRYPOINT ["/usr/local/spring-test/target/run.sh"]

