FROM jenkins/jenkins:alpine
USER root
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt
RUN apk add --no-cache \
    docker \
    docker-compose
COPY --chown=jenkins:jenkins groovy/dsdSetup.groovy /usr/share/jenkins/ref/init.groovy.d/dsdSetup.groovy
USER jenkins