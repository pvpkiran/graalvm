# Getting Started
  Trying out Springboot support for graalvm native image(including hints registrar)

### Guides
The following guides illustrate how to use some features concretely:

* [Springboot GraalVM Native Image Support](https://docs.spring.io/spring-boot/reference/native-image/index.html)

### Additional Links
We need graalvm to be installed on the machine

* [GraalVm Installation on Mac](https://www.graalvm.org/latest/docs/getting-started/macos/)

### Executable with Native Build Tools
To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ ./target/graalvm
```