```sh
# DgroupId: package of my main class
# DartifactId: project folder name
# DarchetypeArtifactId: ??
# DarchetypeVersion: ??
# DinteractiveMode: ??
mvn archetype:generate \
    -DgroupId=com.mycompany.app \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

mvn package # without ./m2
mvn install # with ./m2
mvn test # run test
mvn exec:java # run project

java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App # run jar
```# Java-8-Optional
