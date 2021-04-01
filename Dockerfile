FROM adoptopenjdk:11-jre
COPY target/JenkinsTestCalc-1.0-SNAPSHOT.jar $DEPLOY_DIR
