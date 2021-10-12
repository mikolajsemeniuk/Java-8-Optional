```sh
# DgroupId: package of my main class
# DartifactId: project folder name
# DarchetypeArtifactId: id of your package (if you gonna publish)
# DarchetypeVersion: version of our package (if you gonna publish)
# DinteractiveMode: ??
mvn archetype:generate \
    -DgroupId=com.mycompany.app \
    -DartifactId=my-app \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DarchetypeVersion=1.4 \
    -DinteractiveMode=false

mvn package # without ./m2
mvn install # with ./m2, create target folder
mvn clean # remove target folder
mvn test # run test
mvn exec:java # run project

java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App # run jar
```
