FROM openjdk:8-jdk
COPY ./target/java-fsd-capstone-assessment-foodbox-0.0.1-SNAPSHOT.jar java-fsd-capstone-assessment-foodbox-0.0.1-SNAPSHOT.jar
CMD ["java" ,"-jar","java-fsd-capstone-assessment-foodbox-0.0.1-SNAPSHOT.jar"]
RUN echo "jenkins ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
