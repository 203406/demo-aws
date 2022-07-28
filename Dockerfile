FROM openjdk:11
ADD target/demo-aws.jar demo-aws.jar
ENTRYPOINT ["java", "-jar","demo-aws.jar"]
