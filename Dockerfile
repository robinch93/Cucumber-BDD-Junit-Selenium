FROM maven:3.5-jdk-8

COPY ./cucumberDemo/pom.xml pom.xml

RUN mvn dependency:go-offline -B

COPY ./cucumberDemo ./script

WORKDIR /script

RUN apt-get update && \
    apt-get install -y gnupg wget curl unzip --no-install-recommends && \
    wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list && \
    apt-get update -y && \
    apt-get install -y google-chrome-stable && \
    CHROMEVER=$(google-chrome --product-version | grep -o "[^\.]*\.[^\.]*\.[^\.]*") && \
    DRIVERVER=$(curl -s "https://chromedriver.storage.googleapis.com/LATEST_RELEASE_$CHROMEVER") && \
    wget -q --continue -P /chromedriver "http://chromedriver.storage.googleapis.com/$DRIVERVER/chromedriver_linux64.zip" && \
    unzip /chromedriver/chromedriver* -d /chromedriver && \
    mv -v /chromedriver/* /usr/local/bin/ && \
    chmod 777 /usr/local/bin/chromedriver

RUN mvn clean install -DskipTests=true

CMD ["java", "-jar", "target/docker-service-1.0-SNAPSHOT-jar-with-dependencies.jar"]
