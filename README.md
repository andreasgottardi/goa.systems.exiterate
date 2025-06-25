# Example: Iterator

This example shows a simple implementation of a queue with a defined length that offers the following functionality:

* Specify length at initializaton time.
* Adding and removing of Job objects including error handling for full and empty queues.
* Iterations via implemented iterator.

## Building

This project is a [Gradle](https://gradle.org) project that can be developed in any IDE that supports the [Gradle](https://gradle.org) build system ([IntelliJ IDEA](https://www.jetbrains.com/idea/), [Eclipse](https://www.eclipse.org) with [Buildship](https://projects.eclipse.org/projects/tools.buildship), [Netbeans](https://netbeans.apache.org)).

To build the project run

```
gradlew.bat build
```

in Windows or 
```
chmod u+x gradlew
./gradlew build
```

in Linux to build the project.

## Dependencies

This project requires OpenJDK 21, for example from [Azul Systems](https://www.azul.com/downloads/?version=java-21-lts&package=jdk#zulu).