# Java Ant Build System

## Overview
This project provides a structured **Apache Ant** build system for Java applications. It automates compilation, packaging, testing, and documentation generation.

## Features
- **Automated build process** with Ant
- **JUnit support** for unit testing
- **Javadoc generation** for documentation
- **Dependency management** via `lib/` directory
- **Structured project organization**
- **Single-command full build** using `ant all`

---

## Prerequisites
Before using this build system, ensure you have the following installed:

### 1. **Java Development Kit (JDK)**
- Download and install [JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
- Verify installation:
  ```sh
  java -version
  javac -version
  ```

### 2. **Apache Ant**
- Download and install [Apache Ant](https://ant.apache.org/bindownload.cgi).
- Add Ant to system `PATH`.
- Verify installation:
  ```sh
  ant -version
  ```

---

## Project Structure

```
.
├── build/                 (Compiled Java classes)
├── dist/                  (JAR and dependencies)
│   ├── Java-Ant-App-1.0.jar
│   ├── lib/
│   │   ├── dependency1.jar
│   │   ├── dependency2.jar
│   │   └── ...
├── doc/                   (Javadoc documentation)
├── lib/                   (External dependencies)
│   ├── junit.jar
│   ├── log4j.jar
│   └── ...
├── src/                   (Source code)
│   ├── controller/
│   │   └── ControllerExample.java
│   ├── model/
│   │   └── ModelExample.java
│   ├── observer/          (Observer pattern implementation)
│   │   ├── IObserver.java
│   │   ├── IObservable.java
│   │   ├── AbstractObservable.java
│   │   ├── ConcreteObservable.java
│   │   ├── ConcreteObserver.java
│   ├── view/
│   │   └── ViewExample.java
│   ├── MainApp.java
│   ├── resources/         (Non-Java resources)
│   │   ├── config.properties
│   │   ├── images/
│   │   └── ...
├── test/                  (Test source code)
│   ├── ModelExampleTest.java
│   ├── ControllerExampleTest.java
│   ├── reports/           (JUnit reports)
├── build.xml              (Ant build script)
├── .gitignore             (Git ignored files)
├── LICENSE                (Project license)
├── CONTRIBUTING.md        (Guidelines for contributing)
├── README.md              (Project documentation)
```

---

## Build and Run Commands

### 1️⃣ **Clean the Project**
Removes previous builds and artifacts.
```sh
ant clean
```

### 2️⃣ **Prepare Necessary Directories**
Creates required directories (`build/`, `dist/`, `doc/`, `test/reports/`).
```sh
ant prepare
```

### 3️⃣ **Compile Java Source Code**
Compiles Java classes and places them in the `build/` directory.
```sh
ant compile
```

### 4️⃣ **Create a JAR File**
Packages the compiled classes into a runnable JAR file.
```sh
ant dist
```

### 5️⃣ **Run the Application**
Executes the generated JAR file.
```sh
ant run
```

### 6️⃣ **Run Unit Tests**
Executes tests in the `test/` directory using JUnit.
```sh
ant test
```

### 7️⃣ **Generate JUnit Test Report**
Creates a report from JUnit test execution.
```sh
ant junitreport
```

### 8️⃣ **Generate Javadoc Documentation**
Generates API documentation from JavaDoc comments.
```sh
ant javadoc
```

### 9️⃣ **Build Everything in One Command**
Compiles, tests, packages, and generates documentation.
```sh
ant all
```

---

## Adding Dependencies
If your project requires external libraries (e.g., JUnit, Log4j), add them to the `lib/` directory.

### Example: Adding JUnit
1. Download `junit.jar` from [JUnit Official Site](https://junit.org/junit4/).
2. Place it inside the `lib/` directory.
3. Ant automatically includes all `.jar` files in `lib/` when compiling.

---

## Modifying the Project
### **Change the Main Class**
If your main class is different, update the `build.xml` file:
```xml
<property name="mainClass" value="YourMainClass"/>
```

---

## Troubleshooting
### **Error: `ant: command not found`**
- Ensure Ant is installed and added to `PATH`.

### **Error: `BUILD FAILED` due to missing `javac`**
- Check if JDK is installed and `JAVA_HOME` is correctly set.

### **Error: ClassNotFoundException when running tests**
- Ensure the test classes are named correctly (e.g., `ExampleTest.java`).
- Verify the classpath includes the `build/` directory.

---

## Contact
For questions or issues, please open an issue on GitHub.

---

Happy coding! 🚀

