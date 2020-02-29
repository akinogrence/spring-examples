dockerfile
FROM The base image for building a new image. This command must be on top of the dockerfile. MAINTAINER Optional, it contains the name of the maintainer of the image. RUN Used to execute a command during the build process of the docker image. ADD Copy a file from the host machine to the new docker image. There is an option to use a URL for the file, docker will then download that file to the destination directory. ENV Define an environment variable. CMD Used for executing commands when we build a new container from the docker image. ENTRYPOINT Define the default command that will be executed when the container is running. WORKDIR This is directive for CMD command to be executed. USER Set the user or UID for the container created with the image. VOLUME Enable access/linked directory between the container and the host machine. Now let's start to create our first dockerfile.

FROM java:8-jdk-alpine COPY ./target/app.jar /usr/app/ WORKDIR /usr/app RUN sh -c 'touch app.jar' ENTRYPOINT ["java","-jar”,”app.jar"]

maven plugin
io.fabric8 docker-maven-plugin 0.26.0 true true


${project.artifactId} java:8-jdk-alpine java -jar /maven/${project.artifactId}-${project.version}.jar artifact build post-integration-test build