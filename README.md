# Example: Iterator

This example shows a simple implementation of a queue with a defined length that offers the following functionality:

* Specify length at initializaton time.
* Adding and removing of Job objects including error handling for full and empty queues.
* Iterations via implemented iterator.

## Building

This project is a Gradle project that can be developed in any IDE that supports the Gradle build system (IntelliJ IDEA, Eclipse with Buildship, Netbeans).

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

This project requires OpenJDK 21.