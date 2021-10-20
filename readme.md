gradle wrapper
gradle clean && gradle build

java -Dserver.port=8090 -jar build/libs/app.war
./gradlew clean && ./gradlew build
