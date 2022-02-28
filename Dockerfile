FROM java:8

EXPOSE 8080

ADD /www/wwwroot/82.157.46.200/RubbingMap-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c '/usr/bin/java -jar -Xmx1024M -Xms256M  /www/wwwroot/82.157.46.200/RubbingMap-0.0.1-SNAPSHOT.jar --server.port=8081'

ENTRYPOINT ["java", "-jar", "/app.jar", "--spring.profiles.active=pro"]