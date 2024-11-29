# STAGE 1

FROM gradle:jdk21 as builder

WORKDIR /app

COPY build.gradle settings.gradle ./

COPY src ./src

RUN gradle clean bootJar --no-daemon

# STAGE 2

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar discografica-db.jar

#EXPOSE 8080

CMD ["java", "-jar", "discografica-db.jar"]

