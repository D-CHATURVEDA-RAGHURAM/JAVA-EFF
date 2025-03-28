FROM amazoncorretto:17.0.7-alpine

EXPOSE 9002

ENV TZ=Asia/Kolkata

RUN apk add --no-cache tzdata \
  && ln -snf /usr/share/zoneinfo/$TZ /etc/localtime \
  && echo $TZ > /etc/timezone

ADD target/payment-integration-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-Duser.timezone=Asia/Kolkata", "-jar", "/app.jar"]