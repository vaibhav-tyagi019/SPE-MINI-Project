FROM openjdk:11
COPY ./target/Calc_main-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calc_main-1.0-SNAPSHOT-jar-with-dependencies.jar"]
